package com.darelshroo.aristidevcourse.androidmaster.todoapp.view

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.darelshroo.aristidevcourse.R
import com.darelshroo.aristidevcourse.androidmaster.todoapp.TaskCategory

// ViewHolder para manejar la vista de cada elemento de la lista de categorías de tareas
class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName) // Referencia al TextView para mostrar el nombre de la categoría
    private val separator: View = view.findViewById(R.id.separator) // Referencia al separador de color para la categoría
    private val viewContainer: CardView = view.findViewById(R.id.viewContainer) // Referencia al contenedor de la vista

    // Método para renderizar la categoría de la tarea en la vista
    fun render(taskCategory: TaskCategory, onItemSelected: (Int) -> Unit) {

        // Asigna el color del fondo de la tarjeta según si la categoría está seleccionada
        val color = if(taskCategory.isSelected) {
            R.color.todo_background_card // Color para categoría seleccionada
        } else {
            R.color.todo_background_disabled // Color para categoría no seleccionada
        }

        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))

        // Establece el listener para la selección de la categoría
        itemView.setOnClickListener { onItemSelected(layoutPosition) }

        // Asigna el nombre y color del separador según la categoría
        when(taskCategory) {
            TaskCategory.Business -> {
                tvCategoryName.text = "Negocios"
                separator.setBackgroundColor(
                    ContextCompat.getColor(separator.context, R.color.todo_business_category)
                )
            }
            TaskCategory.Other -> {
                tvCategoryName.text = "Otros"
                separator.setBackgroundColor(
                    ContextCompat.getColor(separator.context, R.color.todo_other_category)
                )
            }
            TaskCategory.Personal -> {
                tvCategoryName.text = "Personal"
                separator.setBackgroundColor(
                    ContextCompat.getColor(separator.context, R.color.todo_personal_category)
                )
            }
        }
    }
}