package com.example.myapptodoin.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapptodoin.model.UsuarioModdel

@Database(
    entities=[UsuarioModdel::class],
    version=1, exportSchema =false)


abstract class UsuarioDB:RoomDatabase() {
    abstract val usuarioDAO: UsuarioDAO


    companion object {
        const val DATABASE_NAME = "dbtodoin"

    }


}