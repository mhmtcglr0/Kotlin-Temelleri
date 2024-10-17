package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    ucretHesapla(120,KonserveBoyut.ORTA)

}

fun ucretHesapla(adet:Int,boyut: KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Toplam Maliyet : ${adet*30} tl")
        KonserveBoyut.ORTA  -> println("Toplam Maliyet : ${adet*40} tl")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet : ${adet*50} tl")
    }
}