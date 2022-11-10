package com.example.myapptodoin.data

import androidx.room.*
import com.example.myapptodoin.model.UsuarioModdel


@Dao
interface UsuarioDAO {
    @Query("SELECT*FROM usuarios")

    fun consultar():List<UsuarioModdel>

    @Update
    fun actualizar(usuario:UsuarioModdel)

    @Insert
    fun insertar(usuario: UsuarioModdel)

    @Delete
    fun eliminar(usuario: UsuarioModdel)

}