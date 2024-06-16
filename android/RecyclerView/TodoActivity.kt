package com.darelshroo.aristidevcourse.androidmaster.todoapp

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.darelshroo.aristidevcourse.R
import com.darelshroo.aristidevcourse.androidmaster.todoapp.TaskCategory.Business
import com.darelshroo.aristidevcourse.androidmaster.todoapp.TaskCategory.Other
import com.darelshroo.aristidevcourse.androidmaster.todoapp.TaskCategory.Personal
import com.darelshroo.aristidevcourse.androidmaster.todoapp.adapter.CategoriesAdapter
import com.darelshroo.aristidevcourse.androidmaster.todoapp.adapter.TasksAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodoActivity : AppCompatActivity() {

    // Definición de una lista de categorías: Negocios, Personal y Otro
    private val categories = listOf(
        Business,
        Personal,
        Other
    )

    // Inicialización de una lista mutable de tareas con algunas tareas de ejemplo para cada categoría
    private val tasks = mutableListOf(
        Task("PruebaBussiness", Business),
        Task("PruebaPersonal", Personal),
        Task("PruebaOther", Other)
    )

    // Propiedades lateinit para RecyclerViews y Adapters para categorías y tareas
    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rvTasks: RecyclerView
    private lateinit var tasksAdapter: TasksAdapter

    // Propiedad lateinit para FloatingActionButton para agregar nuevas tareas
    private lateinit var fabAddTask: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Habilita la visualización de borde a borde para la actividad
        setContentView(R.layout.activity_todo) // Establece la vista de contenido al layout de la actividad de tareas

        // Ajusta el padding para manejar las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initComponents() // Inicializa los componentes de la interfaz de usuario
        initUI() // Configura los componentes de la interfaz de usuario con adaptadores y gestores de layout
        initListeners() // Inicializa los listeners para las interacciones de la interfaz de usuario
    }

    private fun initListeners() {
        // Establece un listener de clic para el FloatingActionButton para mostrar un diálogo para agregar una nueva tarea
        fabAddTask.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        // Crea y configura el diálogo para agregar una nueva tarea
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)

        // Obtiene referencias a los componentes de la interfaz de usuario del diálogo
        val btnAddTask: Button = dialog.findViewById(R.id.btnAddTask)
        val etTask: EditText = dialog.findViewById(R.id.etTask)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)

        // Establece un listener de clic para el botón de agregar tarea
        btnAddTask.setOnClickListener {
            val currentTask = etTask.text.toString() // Obtiene el texto ingresado en el EditText
            if (currentTask.isNotEmpty()) {
                // Obtiene la categoría seleccionada del RadioGroup
                val selectedId = rgCategories.checkedRadioButtonId
                val selectedRadioButton = rgCategories.findViewById<RadioButton>(selectedId)
                val currentCategory: TaskCategory = when (selectedRadioButton.text) {
                    getString(R.string.todo_dialog_category_business) -> Business
                    getString(R.string.todo_dialog_category_personal) -> Personal
                    else -> Other
                }
                // Agrega la nueva tarea a la lista de tareas y actualiza la interfaz de usuario
                tasks.add(Task(etTask.text.toString(), currentCategory))
                updateTasks()
                dialog.hide() // Oculta el diálogo después de agregar la tarea
            }
        }

        dialog.show() // Muestra el diálogo
    }

    private fun initComponents() {
        // Inicializa los RecyclerViews y el FloatingActionButton
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
        fabAddTask = findViewById(R.id.fabAddTask)
    }

    private fun initUI() {
        // Configura el RecyclerView de categorías con su adaptador y gestor de layout
        categoriesAdapter = CategoriesAdapter(categories) { position ->
            updateCategories(position)
        }
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        // Configura el RecyclerView de tareas con su adaptador y gestor de layout
        tasksAdapter = TasksAdapter(tasks) { onItemSelected((it)) }
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = tasksAdapter

    }

    private fun updateCategories(position: Int) {
        // Cambia el estado de selección de la categoría clickeada
        categories[position].isSelected = !categories[position].isSelected
        categoriesAdapter.notifyItemChanged(position) // Notifica al adaptador para actualizar la interfaz de usuario
        updateTasks() // Actualiza las tareas mostradas según las categorías seleccionadas
    }

    private fun onItemSelected(position: Int) {
        // Cambia el estado de selección de la tarea clickeada
        tasks[position].isSelected = !tasks[position].isSelected
        updateTasks() // Actualiza las tareas mostradas según las categorías seleccionadas
    }

    private fun updateTasks() {
        // Filtra las tareas según las categorías seleccionadas y actualiza el adaptador de tareas
        val selectedCategories: List<TaskCategory> = categories.filter { it.isSelected }
        val newTasks = tasks.filter { selectedCategories.contains(it.category) }
        tasksAdapter.setTasks(newTasks)
        tasksAdapter.notifyDataSetChanged()
    }
}