package com.example.kotlinderslerilayda.nesne_tabanli
fun main(){
    val pc = Urunler(1,"PC",13000.0)
    var parfum = Urunler(9,"Parfüm",1000.0)

    //Değer Atama
    pc.ad="PC Macbook"
    pc.fiyat=36000.0

    //Değer Okuma
    println("Id: ${pc.id}")
    println("Ad: ${pc.ad}")

    println("---------------")

    //Main'de bir fonksiyon oluşturuyorum
    pc.bilgiAl()
    parfum.bilgiAl()

}
