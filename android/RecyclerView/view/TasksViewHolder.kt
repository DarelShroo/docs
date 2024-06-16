package com.darelshroo.aristidevcourse.androidmaster.todoapp.view

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.darelshroo.aristidevcourse.R
import com.darelshroo.aristidevcourse.androidmaster.todoapp.Task
import com.darelshroo.aristidevcourse.androidmaster.todoapp.TaskCategory

// ViewHolder para manejar la vista de cada elemento de la lista de tareas
class TasksViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvTask: TextView = view.findViewById(R.id.tvTask) // Referencia al TextView para mostrar el nombre de la tarea
    private val cbTask: CheckBox = view.findViewById(R.id.cbTask) // Referencia al CheckBox para marcar la tarea como completada

    // Método para renderizar la tarea en la vista
    fun render(task: Task) {
        // Actualiza el estilo del texto según si la tarea está seleccionada o no
        if(task.isSelected){
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG // Aplica el estilo tachado si la tarea está seleccionada
        }else {
            tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv() // Remueve el estilo tachado si la tarea no está seleccionada
        }

        tvTask.text = task.name // Establece el nombre de la tarea en el TextView
        cbTask.isChecked = task.isSelected // Establece el estado del CheckBox según si la tarea está seleccionada

        // Asigna el color del CheckBox según la categoría de la tarea
        val color = when (task.category) {
            TaskCategory.Business -> R.color.todo_business_category // Color para la categoría de Negocios
            TaskCategory.Personal -> R.color.todo_personal_category // Color para la categoría Personal
            TaskCategory.Other -> R.color.todo_other_category // Color para la categoría Otra
        }

        // Establece el color del CheckBox
        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context, color)
        )
    }
}
