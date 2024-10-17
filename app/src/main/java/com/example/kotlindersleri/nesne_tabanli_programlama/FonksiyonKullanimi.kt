package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    val f = Fonksiyonlar()
    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuc : $gelenSonuc")

    f.selamla3("Mehmet")

    val gelenToplam = f.toplama1(10,20)
    println("Gelen Toplam : $gelenToplam")

    f.carp(10,20,"Mehmet")





}