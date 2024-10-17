package com.example.kotlindersleri.standart_programalama

fun main() {

    //1,2,3
    for(i in 1..3) { // Swift : i in 1..3

        println("Döngü1 : $i")
    }

    //10 ile 20 arasında çalışsın 5'er artsın

    for (a in 10..20 step 5){
        println("Döngü2 : $a")
    }

    //20 den başlasın 10'a doğru 2'şer azalsın

    for (b in 20 downTo 10 step 2) {
        println("Döngü3 : $b ")
    }

    //1,2,3,4,5

    var sayac = 1

    while(sayac < 6) {
        println("Döngü4 : $sayac")
        sayac++ // sayac +=1 , sayac = sayac + 1
    }

    //Döngüyü durdurmak için
    for(br in 1..5 ) {
        if(br == 3){
            break
        }
        println("Döngü5 : $br")
    }

    //Döngüyü pas geçmek için

    for(p in 1..5){
        if(p ==3){
            continue
        }
        println("Döngü6 : $p")
    }





}