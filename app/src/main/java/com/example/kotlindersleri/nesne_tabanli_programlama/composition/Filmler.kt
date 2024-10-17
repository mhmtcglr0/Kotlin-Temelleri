package com.example.kotlindersleri.nesne_tabanli_programlama.composition

data class Filmler(var film_id:Int,
                   var film_ad:String,
                   var film_yil:Int,
                   var Yonetmen:Yönetmenler, //Composition
                   var Kategori:Kategoriler) {


}