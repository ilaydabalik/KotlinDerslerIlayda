package com.example.kotlinderslerilayda.ilaydaBalikHW2

class HW2Fonksiyonlar {

    fun celciusToFahrenheit(C:Int){
        println("$C Celcius to Fahrenheit  = ${(C*1.8)+32}")
    }

    fun perimeterOfRectengular(sL:Double,lL:Double){
        println("Perimeter of rectangle with short side $sL and long side $lL is ${(sL*2)+(lL*2)}")
    }

    fun faktoriyel(sayi: Int) {
        var faktoriyel = 1
        for (i in 1..sayi) {
            faktoriyel *= i
        }
        return println("$faktoriyel")
    }

    fun harfSayisi(kelime: String) {
        var sayac = 0
        for (harf in kelime) {
            if (harf == 'a') {
                sayac++
            }
        }
        return println("a harfi sayısı : $sayac")
    }

    fun internalAngleCalculator(kenarSayisi: Int){

        println("$kenarSayisi kenarı olan bir çokgenin iç açıları toplamı  = ${(kenarSayisi-2)*180}")

    }

    fun maasHesapla(gunSayisi: Int): Any {
        val calismaSaati = 8
        val calismaSaatiUcreti = 10
        val mesaiSaatiUcreti = 20
        val aylikMesaiSiniri = 160
        var toplamMaas = 0

        if (gunSayisi <= 0) {
            return toplamMaas
        }

        val calismaSaatiToplami = calismaSaati * gunSayisi
        val mesaiSaati = if (calismaSaatiToplami > aylikMesaiSiniri) {
            calismaSaatiToplami - aylikMesaiSiniri
        } else {
            0
        }

        toplamMaas = (calismaSaatiToplami * calismaSaatiUcreti) + (mesaiSaati * mesaiSaatiUcreti)

        return println("$gunSayisi kadar çalışırsanız maaşınız : $toplamMaas TL")
    }

    fun ucretHesapla(kotaMiktari: Int) {
        val birimUcret = 4
        val sabitUcret = 100
        val kotaSiniri = 50
        var toplamUcret = 0

        if (kotaMiktari <= kotaSiniri) {
            toplamUcret = sabitUcret
        } else {
            val kotaAsimi = kotaMiktari - kotaSiniri
            toplamUcret = sabitUcret + (kotaAsimi * birimUcret)
        }

        return println("Toplam internet kullanım ücretiniz : $toplamUcret")
    }





}