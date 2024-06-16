package com.darelshroo.aristidevcourse.androidmaster.todoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.darelshroo.aristidevcourse.R
import com.darelshroo.aristidevcourse.androidmaster.todoapp.Task
import com.darelshroo.aristidevcourse.androidmaster.todoapp.view.TasksViewHolder

// Adaptador para gestionar la lista de tareas en el RecyclerView
class TasksAdapter(private var tasks: List<Task>, private val onTaskSelected: (Int) -> Unit) :
    RecyclerView.Adapter<TasksViewHolder>() {

    // Crea un nuevo ViewHolder cuando no hay suficientes ViewHolders existentes para reciclar
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false) // Infla la vista del elemento de la tarea
        return TasksViewHolder(view)
    }

    // Devuelve el tamaño de la lista de tareas
    override fun getItemCount(): Int = tasks.size

    // Vincula la tarea al ViewHolder, configurando la vista con los datos de la tarea
    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        holder.render(tasks[position]) // Renderiza la tarea en la vista
        holder.itemView.setOnClickListener { onTaskSelected(position) } // Establece el listener para la selección de la tarea
    }

    // Devuelve la lista de tareas actual
    fun getTasks(): List<Task> {
        return tasks
    }

    // Establece una nueva lista de tareas y notifica al adaptador
    fun setTasks(tasks: List<Task>) {
        this.tasks = tasks
    }
}