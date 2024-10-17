package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.override_kullanimi

fun main() {

    val hayvan  = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Köpek()

    hayvan.sesCikar() //Kalitim yok kendi sınıfına erişti
    memeli.sesCikar() //Kalitim var üst sınıfın metodunu kullandı
    kedi.sesCikar() //Kalitim var override ile kendi metodunu kullandi
    kopek.sesCikar() //Kalitim var override ile kendi metodunu kullandi



}