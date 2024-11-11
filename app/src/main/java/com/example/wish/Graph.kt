package com.example.wish

import android.content.Context
import androidx.room.Room
import com.example.wish.data.WishDataBase
import com.example.wish.data.WishRepository

object Graph { // service provider

    lateinit var database: WishDataBase
    // todo inject

    val wishRepository by lazy {
        WishRepository(
            wishDao = database.wishDao()
        )
    } // when wish repository required then only it will run

    fun provide(context: Context) {
        database = Room.databaseBuilder(context, WishDataBase::class.java, "wishlist.db" ).build()
        // this is part of android persistance library.
    }
}