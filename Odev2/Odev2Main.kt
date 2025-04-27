package com.example.firstproject.odevler

fun main() {
    val odevler = Odev2()

    // Ödev 1 Testleri
    println("--- Ödev 1 Testleri ---")
    val celciusDegeri = 25.0
    val fahrenheitDegeri = odevler.dereceyiFahrenheitCevir(celciusDegeri)
    println("$celciusDegeri derece, Fahrenheit olarak $fahrenheitDegeri'dir.")

    val k1 = 5.0
    val k2 = 10.0
    val dikdortgenCevre = odevler.dikdortgenCevresiniHesapla(k1, k2)
    println("Kenarları $k1 ve $k2 olan dikdörtgenin çevresi: $dikdortgenCevre")

    val sayiFaktoriyel = 5
    val faktoriyelSonucu = odevler.faktoriyelHesapla(sayiFaktoriyel)
    println("$sayiFaktoriyel sayısının faktöriyeli: $faktoriyelSonucu")

    val kelime = "Merhaba Ankara"
    val aHarfiSayisi = odevler.kelimedeAHarfiSayisiniBul(kelime)
    println("'$kelime' kelimesinde $aHarfiSayisi adet 'a' harfi bulunmaktadır.")

    println("\n--- Ödev 2 Testleri ---")
    // Ödev 2 Testleri
    val kenar = 6
    val icAcilar = odevler.icAcilarToplamiHesapla(kenar)
    println("$kenar kenarlı bir çokgenin iç açılarının toplamı: $icAcilar derecedir.")

    val gunSayisi = 22
    val toplamMaas = odevler.maasHesapla(gunSayisi)
    println("$gunSayisi gün çalışan birinin maaşı: $toplamMaas ₺'dir.")

    val gunSayisiMesaili = 25
    val toplamMaasMesaili = odevler.maasHesapla(gunSayisiMesaili)
    println("$gunSayisiMesaili gün çalışan (mesaili) birinin maaşı: $toplamMaasMesaili ₺'dir.")

    val kota1 = 40
    val ucret1 = odevler.kotaUcretiHesapla(kota1)
    println("$kota1 GB kota ücreti: $ucret1 ₺'dir.")

    val kota2 = 60
    val ucret2 = odevler.kotaUcretiHesapla(kota2)
    println("$kota2 GB kota ücreti: $ucret2 ₺'dir.")
}