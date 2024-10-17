package com.example.kotlindersleri.standart_programalama

fun main() {

    val yas = 26
    val isim = "Mehmet"

    if(yas >= 18 ){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    if (isim == "Ahmet"){
        println("Merhaba Ahmet")
    }else if(isim == "Mehmet") {
        println("Merhaba Mehmet")
    }else {
        println("Tanınmayan Kişi")
    }


    val username = "Mehmet"
    val password = 12345

    if (username == "Mehmet" && password == 12345){
        println("Hoşgeldiniz")
    }else{
        println("Kullanıcı adı veya şifre hatalı")
    }

    //When bir çok dilde ise switch olarak geçer

    val gun = 1

    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")

        else -> println("Böyle bir gün yok")
    }


}