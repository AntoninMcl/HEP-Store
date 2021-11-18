package com.epsi.hepstore


import androidx.appcompat.app.AppCompatActivity


class homepage : AppCompatActivity() {


    class Raquette(val Taille_Manche: Double, val marque: String, val gamme: String, val poid: Double, val cordage: String, val prix: Double){

    }

    fun main(args: Raquette){
        val raquette = Raquette(15.0, "babolat", "aéro", 285.0, "boyaux", 15.00)
        println(raquette)
        var listA = mutableListOf(raquette)

    }

}