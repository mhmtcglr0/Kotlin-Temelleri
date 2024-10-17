package com.example.kotlindersleri.collections

fun main() {

    //Tanımlama
    val iller = HashMap<Int,String>()

    //ekleme
    iller.put(10,"Balıkesir")
    iller.put(34,"İstanbul")
    iller[41] = "Kocaeli"
    println(iller)

    //Okuma
    println(iller.get(10))

    //Güncelleme
    iller.put(34,"Yeni İstanbul")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    //Iterator
    for((key,value) in iller){
        println("$key -> $value")
    }

    //Silme
    iller.remove(34)
    println(iller)

    //Tamamını Silme
    /*
    * iller.clear()
    * println(iller)
     */




























}