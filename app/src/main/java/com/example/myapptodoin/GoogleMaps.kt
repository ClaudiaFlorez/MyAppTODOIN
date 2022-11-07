package com.example.myapptodoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityGoogleMapsBinding
import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class GoogleMaps : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityGoogleMapsBinding
    private lateinit var map:GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGoogleMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

       crearfragment()
    }

    private fun crearfragment() {
        val mapFragment:SupportMapFragment=supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(gm: GoogleMap) {
        map=gm
        crearMarker()

    }

    private fun crearMarker(){
        val coordenadasParqueLosFundadores=LatLng(4.122372773344632, -73.64200035700762)
        val coordenadasMonserrate=LatLng(4.607600038523203, -74.05548732728269)
        val coordenadasParqueCaldas=LatLng(2.441610139944081, -76.606166613844)
        val marker:MarkerOptions=MarkerOptions().position(coordenadasParqueLosFundadores).title("Parque Los Fundadores")
        val marker1:MarkerOptions=MarkerOptions().position(coordenadasMonserrate).title("Monserrate")
        val marker2:MarkerOptions=MarkerOptions().position(coordenadasParqueCaldas).title("Parque Caldas")
        map.addMarker(marker)
        map.addMarker(marker1)
        map.addMarker(marker2)
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordenadasParqueLosFundadores,6f),5000,null)
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordenadasMonserrate,6f),5000,null)
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordenadasParqueCaldas,6f),5000,null)

    }
}