package com.example.kotlinderslerilayda.standart_programlama

fun main(){

    //1,2,3
    for (i in 1..3){  //for each döngüleri
        println("Döngü 1 : $i")

    }

    var sayac = 1

    while (sayac<4){
        println("Döngü 2 : $sayac")
        sayac++
    }

    //For döngüsünde artış miktarını kontrol etmek istiyorum
    for (i in 10 .. 20 step 5){
        println("Döngü 3 : $i")
    }

    //for(i in 20downTo 10 step 5){ // Tersine saymak istiyorsam azaltarak
    //    println("Döngü $i")
    //}

    for (x in 1..5){
        if (x==3){
            break
            //continue : burada break yerine kullandığımızda üçü yazdırmıyor sonrasına devam ediyor
        }
        println("Döngü 5 : $x")

    }
}