package com.example.myapptodoin

import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.FileProvider
import com.example.myapptodoin.databinding.ActivityFotoPerfilBinding
import java.io.File
import java.io.OutputStream
import java.net.URI

class FotoPerfil : AppCompatActivity() {
    private lateinit var binding: ActivityFotoPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFotoPerfilBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btntomarfoto.setOnClickListener {

            val Intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
                it.resolveActivity(packageManager).also {component->
                    creararchivoimagen()
                    val fotoUri: Uri = FileProvider.getUriForFile(
                        this,
                        BuildConfig.APPLICATION_ID + "fileprovider", file
                    )
                    it.putExtra(MediaStore.EXTRA_OUTPUT, fotoUri)

                }
            }

            abrircamara.launch(intent)
            // abrircamara.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }
        binding.btnguardar.setOnClickListener {
            guardarGaleria()

        }
    }

    val abrircamara =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                val data = result.data!!
                val bitmap = data.extras!!.get("data") as Bitmap
                binding.imgfoto.setImageBitmap(bitmap)
            }

        }

    private lateinit var file: File

    private fun creararchivoimagen() {
        val dir= getExternalFilesDir(Environment.DIRECTORY_PICTURES)!!
        file = File.createTempFile("IMG_${System.currentTimeMillis()}_",".jpg",dir)

    }

    private fun guardarGaleria() {
        val contenido = crearContenido()
        val Uri = guardar(contenido)
        limpiarcontenido(contenido, Uri)

    }

    private fun crearContenido(): ContentValues {

        val nombreArchivo = file.name
        val tipoarchivo = "image/jpg"
        return ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, nombreArchivo)
            put(MediaStore.MediaColumns.MIME_TYPE, tipoarchivo)
            put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_PICTURES)
            put(MediaStore.MediaColumns.IS_PENDING, 1)
        }
    }

    private fun guardar(content: ContentValues): Uri {
        var outputStream: OutputStream?
        var uri: Uri?
        application.contentResolver.also { resolver ->
            uri=resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, content)
            outputStream=resolver.openOutputStream(uri!!)
        }
        outputStream.use{
            output->
            getBitmap().compress(Bitmap.CompressFormat.JPEG, 100,output)

        }
        return uri!!
    }
    private fun getBitmap():Bitmap{
     return BitmapFactory.decodeFile(file.toString())
    }
    private fun limpiarcontenido(content: ContentValues,uri:Uri){
        content.clear()
        content.put(MediaStore.MediaColumns.IS_PENDING,0)
        contentResolver.update(uri,content,null, null)

    }
}











