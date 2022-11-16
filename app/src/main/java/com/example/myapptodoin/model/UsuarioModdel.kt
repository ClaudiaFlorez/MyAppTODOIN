package com.example.myapptodoin.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="usuarios")

class UsuarioModdel(
    @PrimaryKey
    val usuario: String,
    @ColumnInfo(name = "correo")
    val correo: String,
    @ColumnInfo(name = "contrasena")
    val contrasena: String,
    @ColumnInfo(name = "confirmar contrasena")
    val confcontrasena: String,
    @ColumnInfo(name = "nombre completo")
    val nombrecompleto: String,
    @ColumnInfo(name = "telefono")
    val telefono: String,
)