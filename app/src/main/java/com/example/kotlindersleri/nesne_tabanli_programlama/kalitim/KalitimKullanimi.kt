package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {

    val topkapiSarayi = Saray(5,20)
    val bogazVilla = Villa(true,50)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarmi)
    println(bogazVilla.pencereSayisi)


    /*Upcasting
    val ev:Ev = bogazVilla */

    /*DownCasting
    val ev1 = Ev(10)
    val saray = ev1 as Saray*/


}