package com.example.kotlindersleri.collections

fun main() {

    val o1 = Ogrenciler(100,"Mehmet","9D")
    val o2 = Ogrenciler(200,"Merve","9B")
    val o3 = Ogrenciler(300,"Feyza","9E")

    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for(ogrenci in ogrencilerListesi){
        println("No:${ogrenci.no} - Ad:${ogrenci.ad} - Sınıf:${ogrenci.sinif}")
    }

    //Sıralama - Sorted
    println("Küçükten Büyüğe Sıralama")
    val siralama1 = ogrencilerListesi.sortedWith(compareBy{it.no}) //ASC
    for (ogrenci in siralama1){
        println("No:${ogrenci.no} - Ad:${ogrenci.ad} - Sınıf :${ogrenci.sinif}")
    }

    println("Büyükten Küçüğe Sıralama")

    val sıralama2 = ogrencilerListesi.sortedWith(compareByDescending {it.no}) //DESC
    for (ogrenci in sıralama2){
        println("No:${ogrenci.no} - Ad:${ogrenci.ad} - Sınıf :${ogrenci.sinif}")
    }

    println("Metinsel Sıralama Küçükten Büyüğe")

    val sıralama3 = ogrencilerListesi.sortedWith(compareByDescending {it.ad}) //DESC
    for (ogrenci in sıralama3){
        println("No:${ogrenci.no} - Ad:${ogrenci.ad} - Sınıf :${ogrenci.sinif}")
    }


    //Filtreleme
    println("Filtreleme1")
    val filtreleme1 = ogrencilerListesi.filter { it.no >150 }
    for (f1 in filtreleme1){
        println("No:${f1.no} - Ad:${f1.ad} - Sınıf :${f1.sinif}")
    }

    println("Filtreleme2")
    val filtrleme2 = ogrencilerListesi.filter { (it.ad).contains("yz") } //search kısmında kullanabilirsiniz
    for (f2 in filtrleme2){
        println("No:${f2.no} - Ad:${f2.ad} - Sınıf :${f2.sinif}")
    }
















}