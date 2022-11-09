package com.example.myapptodoin.dao

import androidx.room.*
import com.example.myapptodoin.model.UsuarioModel

@Dao
interface UsuarioDAO {
    @Query("SELECT*FROM usuarios")
    fun consultar():List<UsuarioModel>

    @Update
    fun actualizar(usuario:UsuarioModel)

    @Insert
    fun insertar(usuario:UsuarioModel)

    @Delete
    fun eliminar(usuario:UsuarioModel)
}