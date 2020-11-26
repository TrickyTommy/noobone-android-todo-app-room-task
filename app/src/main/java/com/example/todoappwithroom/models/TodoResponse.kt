package com.example.todoappwithroom.models

import com.google.gson.annotations.SerializedName

data class TodoResponse(

	@field:SerializedName("data")
	val data: List<TodoModel>,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: Boolean
)