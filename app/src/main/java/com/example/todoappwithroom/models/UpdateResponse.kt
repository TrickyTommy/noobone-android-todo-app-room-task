package com.example.todoappwithroom.models

import com.google.gson.annotations.SerializedName

data class UpdateResponse(

	@field:SerializedName("task")
	val task: String,

	@field:SerializedName("status")
	val status: String
)