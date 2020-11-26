package com.example.todoappwithroom.repositories.remote

import com.example.todoappwithroom.models.TodoModel
import com.google.gson.annotations.SerializedName

data class TodoResponse(

	@field:SerializedName("data")
	val data: List<TodoModel>

)