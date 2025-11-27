package com.unimanagementsys.Util.Enums;

public enum Grade {
    FIRST(1, "1.sinif"),
    SECOND(2, "2.sinif"),
    THIRD(3, "3.sinif"),
    FOURTH(4, "4.sinif"),
    MAX(4, "4.sinif");

    private int code;
    private String gradeStr;

    private Grade(int code, String gradeStr) {// First cagirildigi zaman calisiyoru 1 = int code
        this.code = code;
        this.gradeStr = gradeStr;
    }

    // navigator sonra anlatilacak

    public String getGrade() {
        return this.gradeStr;
    }

    public Grade moveUpGrade() {//YENI KAYIT OLAN OGRENCIYE NE OLACAK NASIL OLACAK

        if (this.code == MAX.code) {
            return this;
        }

        int nextOrdinal = this.code + 1;

        return switch (nextOrdinal) {
            case 1 -> FIRST;
            case 2 -> SECOND;
            case 3 -> THIRD;
            case 4 -> FOURTH;
            default -> this;

        };

    }// Service katmaninda yaplilmamasi gerekli.
     // service katmani surecei yonetir islemi yapmaz
    /*
     * Surecler...
     * Ogrenci var mi(service)--Varsa getir(repository)
     * Ogrencinin not ortalamasini hesapla(service)--Ogrencei calssinin icerisindeki
     * hesaplayici(atomic)
     * Ortalama gecer puanin (65 puan) uzerinde mi(service) -- Ogrencinin notlarini
     * bulup hesap yapan metotlar(atomic)
     * Uzerinde ise(service)-- moveUpGrade(). metodu calissin
     */

}
