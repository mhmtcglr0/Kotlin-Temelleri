package com.example.kotlindersleri.degiskenler

fun main(){


    var ogrenciAdı = "Mehmet"
    println(ogrenciAdı)

    var ogrenciYası = 26
    println(ogrenciYası)

    var ogrenciBoyu = 1.77
    println(ogrenciBoyu)

    var ogrenciBasHarf = 'M'
    println(ogrenciBasHarf)

    var ogrenciDevamEdiyorMu = true
    println(ogrenciDevamEdiyorMu)

    println("--------Tür Belirterek Değişken Oluşturma --------")

    //tür belirterek değişken oluşturma
    var urun_id : Int = 3416
    println("Ürün Id : $urun_id")

    var urun_adi : String = "Iphone Pro Max"
    println("Ürün Adı : $urun_adi")

    var urun_adet : Int = 1000
    println("ürün Adedi : $urun_adet")

    var urun_fiyat : Double = 42656.99
    println("Ürün Fiyatı : $urun_fiyat tl")

    var urun_tedarikci : String = "Apple"
    println("Ürün Tedarikçisi : $urun_tedarikci")

    println("----- $:insert detaylandırma ----- ")

    var a = 10
    var b= 20

    println("$a * $b : ${ a*b }")


    //Sabitler - Constant
    //val(Kotlin) keywordü ile tanımlama yapılır. Farklı dillerde let(Swift) final(java)

    var sayi = 30
    println(sayi)

    sayi = 100
    println(sayi)

    val numara = 40

    //Tür Dönüşümü Type Casting

    //1-Sayısal sayısala Dönüşüm
    val i = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    //2-Sayısaldan Metine Dönüşüm

    val sonuc3 = i.toString()
    println(sonuc3)

    //3-Metinden Sayısala Dönüşüm

    val yazi = "67.45t"
    val sonuc5 = yazi.toDoubleOrNull()

    println(sonuc5)


    if(sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşüm Hatası oluştu ve sayınızı kontrol ediniz")
    }

    //if in benzeri
    sonuc5?.let {
        println(sonuc5)
    }

    sonuc5?.let {
        println(it)
    }















}