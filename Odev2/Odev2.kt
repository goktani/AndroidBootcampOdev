package com.example.firstproject.odevler

class Odev2 {
    fun dereceyiFahrenheitCevir(celcius: Double): Double {
        return (celcius * 1.8) + 32
    }

    fun dikdortgenCevresiniHesapla(kenar1: Double, kenar2: Double): Double {
        return 2 * (kenar1 + kenar2)
    }

    fun faktoriyelHesapla(sayi: Int): Int {
        if (sayi < 0) {
            throw IllegalArgumentException("Faktoriyel negatif sayılar için tanımlı değildir.")
        }
        if (sayi == 0) {
            return 1
        }
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    fun kelimedeAHarfiSayisiniBul(kelime: String): Int {
        var sayac = 0
        for (harf in kelime) {
            if (harf.toLowerCase() == 'a') {
                sayac++
            }
        }
        return sayac
    }

    fun icAcilarToplamiHesapla(kenarSayisi: Int): Int {
        if (kenarSayisi < 3) {
            throw IllegalArgumentException("Çokgenin en az 3 kenarı olmalıdır.")
        }
        return (kenarSayisi - 2) * 180
    }

    fun maasHesapla(calismaGunSayisi: Int): Double {
        val gunlukCalismaSaati = 8
        val normalSaatUcreti = 10.0
        val mesaiSaatUcreti = 20.0
        val mesaiSiniri = 160

        val toplamCalismaSaati = calismaGunSayisi * gunlukCalismaSaati
        var maas = 0.0

        if (toplamCalismaSaati <= mesaiSiniri) {
            maas = toplamCalismaSaati * normalSaatUcreti
        } else {
            val normalMaas = mesaiSiniri * normalSaatUcreti
            val mesaiSaati = toplamCalismaSaati - mesaiSiniri
            val mesaiMaasi = mesaiSaati * mesaiSaatUcreti
            maas = normalMaas + mesaiMaasi
        }
        return maas
    }

    fun kotaUcretiHesapla(kotaMiktariGB: Int): Double {
        val ilkKotaGB = 50
        val ilkKotaUcreti = 100.0
        val asimUcretiGB = 4.0

        return if (kotaMiktariGB <= ilkKotaGB) {
            ilkKotaUcreti
        } else {
            ilkKotaUcreti + (kotaMiktariGB - ilkKotaGB) * asimUcretiGB
        }
    }
}