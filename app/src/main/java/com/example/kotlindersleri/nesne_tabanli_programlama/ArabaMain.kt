package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    //Nesne oluşturma

    val bmw = Araba("Mavi",0,false)

    //Okuma
    bmw.bilgiAl()

    //Veri Atama
    bmw.renk = "Gri"
    bmw.hiz = 10
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()

    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()

    val masserati = Araba("Beyaz",10,true)

    masserati.bilgiAl()

    masserati.calistir()
    masserati.bilgiAl()

    masserati.hizlan(100)
    masserati.bilgiAl()

    masserati.yavasla(110)
    masserati.durdur()




}