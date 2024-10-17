package com.example.kotlindersleri.nesne_tabanli_programlama

class Araba (var renk:String,var hiz:Int,var calisiyorMu:Boolean){

    init {
        println("Constructor çalıştı")
    }

    fun calistir(){ //Side effect : fonksiyon ile sınıfın özeliklerini değiştirebilme
        calisiyorMu = true
        hiz = 10
    }

    fun durdur() {
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        //hiz = hiz + kacKm
        hiz += kacKm
    }

    fun yavasla(kacKm: Int){
        hiz -= kacKm
    }

    fun bilgiAl(){
        println("----------------")
        println("Renk       :${renk}")
        println("Hiz        :${hiz}")
        println("ÇalişiyorMu:${calisiyorMu}")
    }

}