package com.example.kotlinderslerilayda.standart_programlama

fun main(){

    val yas = 19
    val isim = "Ahmet"

    if(yas >= 18){
        println("Reşitsiniz..")

    }else{
        println("Reşit değilsiniz")
    }

    if (isim=="Ahmet"){
        println("Merhaba Ahmet")
    } else if (isim == "Mehmet"){
        println("Merhaba Mehmet")
    }else{
        println("Tanınmayan kişi")
    }

    //Çoklu Koşul

    val sayi = 10

    if (sayi == 10 || sayi == 11){
        println("Sayılar birbirine eşit.")
    }else
    {
        println("Sayılar birbirine eşit değil.")
    }

    //SWITCH - WHEN

    val numara = 1
    when (numara){
        1 -> println("Numara 1")
        2 -> println("Numara 2")
        else -> println("Uygun sayi değil")
    }





}