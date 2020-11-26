package com.example.todoappwithroom.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todoappwithroom.R
import com.example.todoappwithroom.databinding.FragmentTodoListBinding
import com.example.todoappwithroom.models.TodoModel
import com.example.todoappwithroom.presenters.TodoPresenter
import com.example.todoappwithroom.repositories.TodoRepository
import com.example.todoappwithroom.repositories.remote.TodoRemoteRepo
import com.example.todoappwithroom.views.adapters.TodoAdapter
import com.example.todoappwithroom.views.contracts.TodoContract

class TodoListFragment : Fragment(), TodoContract.View {

    private lateinit var binding: FragmentTodoListBinding
    private val adapter by lazy { TodoAdapter(requireContext()) }
    private val repository: TodoRepository by lazy { TodoRemoteRepo(requireContext()) }
    private val presenter: TodoContract.Presenter by lazy { TodoPresenter(this, repository) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodoListBinding.inflate(layoutInflater, container, false).apply {

            rvTodoListFragment.adapter = adapter
            presenter.getAllTodo()

        }

        return binding.root
    }

    override fun onSuccessGetAllTodo(todo: List<TodoModel>) {
        val data = todo as MutableList<TodoModel>
        adapter.list = data
    }

    override fun onSuccessInsertTodo(todoModel: TodoModel) {
        TODO("Not yet implemented")
    }

    override fun onSuccessDeleteTodo(id: Long) {
        TODO("Not yet implemented")
    }

    override fun onSuccessUpdateTodo(todoModel: TodoModel) {
        TODO("Not yet implemented")
    }


}