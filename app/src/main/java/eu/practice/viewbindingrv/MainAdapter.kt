package eu.practice.viewbindingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import eu.practice.viewbindingrv.databinding.RecycleviewItemBinding

class MainAdapter (val taskList : List<Task> ):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
        inner  class MainViewHolder (
            val itemBinding: RecycleviewItemBinding):
            RecyclerView.ViewHolder(itemBinding.root) {
            fun bindItem(task: Task){
                itemBinding.titleTv.text = task.title
                itemBinding.timerTv.text = task.timestamp



            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecycleviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
       val task =  taskList[position]
        holder.bindItem(task)

    }
}