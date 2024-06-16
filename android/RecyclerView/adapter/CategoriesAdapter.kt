package com.darelshroo.aristidevcourse.androidmaster.todoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.darelshroo.aristidevcourse.R
import com.darelshroo.aristidevcourse.androidmaster.todoapp.TaskCategory
import com.darelshroo.aristidevcourse.androidmaster.todoapp.view.CategoriesViewHolder

// Adaptador para gestionar la lista de categorías de tareas en el RecyclerView
class CategoriesAdapter(private val categories: List<TaskCategory>, private val onItemSelected: (Int) -> Unit) :
    RecyclerView.Adapter<CategoriesViewHolder>() {

    // Crea un nuevo ViewHolder cuando no hay suficientes ViewHolders existentes para reciclar
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false) // Infla la vista del elemento de la categoría
        return CategoriesViewHolder(view)
    }

    // Devuelve el tamaño de la lista de categorías
    override fun getItemCount(): Int = categories.size

    // Vincula la categoría al ViewHolder, configurando la vista con los datos de la categoría
    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position], onItemSelected) // Renderiza la categoría en la vista
    }
}
