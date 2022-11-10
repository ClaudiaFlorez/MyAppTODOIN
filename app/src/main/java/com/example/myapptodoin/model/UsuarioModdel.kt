package com.example.myapptodoin.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="usuarios")
class UsuarioModdel(
    @PrimaryKey
    val nomusuario: String,
    @ColumnInfo(name = "usuario")
    val usuario: String,
    @ColumnInfo(name = "correo")
    val correo: String,
    @ColumnInfo(name = "contrasena")
    val contrasena: String,
    @ColumnInfo(name = "confcontrasena")
    val confcontrasena: String,
    @ColumnInfo(name = "direccion")
    val direccion: String,


    )
