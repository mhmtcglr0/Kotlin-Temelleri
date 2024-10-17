package com.example.kotlindersleri.nesne_tabanli_programlama.composition

fun main() {

    val k1 = Kategoriler(1,"Komedi")
    val k2 = Kategoriler(2,"Bilim Kurgu")

    val y1 = Yönetmenler(1,"Mehmet ÇAĞLAR")
    val y2 = Yönetmenler(2,"Osman Sınav")

    val f1 = Filmler(1,"Kurtlar Vadisi",2003,y2,k2)

    println("Film_id       :${f1.film_id}")
    println("Film_ad       :${f1.film_ad}")
    println("Film_yil      :${f1.film_yil}")
    println("Film_Yönetmen :${f1.Yonetmen.yonetmen_ad}")
    println("Film_Kategori :${f1.Kategori.kategori_ad}")



}