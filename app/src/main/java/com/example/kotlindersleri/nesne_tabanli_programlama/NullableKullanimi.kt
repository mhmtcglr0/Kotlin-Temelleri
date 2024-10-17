package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    //Nullable - null safety - Optional(Swift)

    var x = "Merhaba"

    //Tanımlama
    var str:String? = null

    //Kullanimi Yöntem1
    println("Yöntem1 : ${str?.trim()}")

    //Kullanimi Yöntem2
    //println("Yöntem2 : ${str!!.trim()}")

    //Kullanim Yöntemi3 - Null kontrolü

    if(str != null){
        println("Yöntem3 : ${str.trim()}")
    }else{
        println("Sonuç nulldur")

    }

    //Kullanim Yöntemi4

    str?.let {
        println("Yöntem4 : ${str.trim()}") //IF'in aynısı
    }


}