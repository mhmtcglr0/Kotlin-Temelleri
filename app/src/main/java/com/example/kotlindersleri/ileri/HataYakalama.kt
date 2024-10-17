package com.example.kotlindersleri.ileri

fun main() {
    //1.Compile Error
    /*
    * val x= 10
    * x=300
    * */

    //2.Exception : Runtime Error

    val a = 10
    val b = 0

    try {
        println("Sonuc : ${a/b}")
        println("Sonuc Tamam")
    }catch (e:Exception){
        println("İkinci sayi sıfır olamaz")
    }



}