package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    val sonuc = 5 carpi 2
    println("Gelen Sonuc $sonuc")

}

infix fun Int.carpi(sayi1:Int):Int {
    return this * sayi1 //this bu sınıf yani Int sınıfı
}