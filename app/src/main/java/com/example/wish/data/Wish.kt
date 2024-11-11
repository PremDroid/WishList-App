package com.example.wish.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-description")
    val description: String = ""
)

object dummy{
    val wishList = listOf(
        Wish(title = "watch", description = "Apple Watch"),
        Wish(title = "mobile", description = "Apple mobile"),
    )
}