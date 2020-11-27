package com.example.todoappwithroom.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import org.w3c.dom.Text
import java.util.*

@Parcelize
@Entity(tableName = "favorite")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val task: String,
    val status: Int,
    val date: Date
) : Parcelable