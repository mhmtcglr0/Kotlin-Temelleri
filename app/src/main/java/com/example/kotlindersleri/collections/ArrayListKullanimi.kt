package com.example.kotlindersleri.collections

fun main() {

    //Tanımlama

    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //Veri Ekleme
    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Portakal")
    println(meyveler)

    //Veri Güncelleme
    meyveler[0] = "Kivi"
    println(meyveler)

    //Insert
    meyveler.add(2,"Mandalina")
    println(meyveler)

    //Okuma İşlemi
    println(meyveler[0])
    println(meyveler.get(1))

    //Boyut ile ilgili işlemler

    println("Boyut: ${meyveler.size}")
    println("Boyut: ${meyveler.count()}")

    //Boş Kontrolü
    println("Boş Kontrolü : ${meyveler.isEmpty()}")

    //içeriyor Mu
    println("içeriyor Mu : ${meyveler.contains("Kiraz")}")

    //İçeriği terse çevirme
    meyveler.reverse()
    println(meyveler)

    //sıralama
    meyveler.sort()
    println(meyveler)

    //Iterating:Değer alma
    for(meyve in meyveler){
        println("Sonuc: $meyve")
    }

    //Index numarası ile değer alma

    for((index,meyve) in meyveler.withIndex()){
        println("$index. -> $meyve")
    }

    //herhangi bir indexi silme
    meyveler.removeAt(2)
    println(meyveler)

    /*tamamını silme
    meyveler.clear()
    println(meyveler)*/














}