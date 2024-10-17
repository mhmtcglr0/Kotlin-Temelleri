package com.example.kotlindersleri.collections

fun main() {

    val meyveler = HashSet<String>()

    meyveler.add("Kiraz")
    meyveler.add("Muz")
    meyveler.add("Portakal")
    println(meyveler)

    println(meyveler.size)
    println(meyveler.isEmpty())
    println(meyveler.elementAt(1))

    //For döngüsü ile iterating
    for (meyve in meyveler){
        println("Sonuc : ${meyve}")
    }

    for ((i,meyve) in meyveler.withIndex()){
        println("$i.-> $meyve")
    }

    //Silme İşlemi
    meyveler.remove("Elma")
    println(meyveler)

    /* Hepsini siler
    * meyveler.clear()
    * */



}