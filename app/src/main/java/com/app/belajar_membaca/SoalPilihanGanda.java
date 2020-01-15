package com.app.belajar_membaca;

public class SoalPilihanGanda {
    public String pertanyaan [] = {
            "Hewan apa yang suka memakan wortel?",
            "Hewan apa yang memiliki leher yang panjang?",
            "Hewan apa yang memiliki belalai panjang?",
            "Hewan apa yang suka memakan pisang?",
            "Hewan apa yang bernafas dengan insang?"
    };

    private String pilihanjawaban [][] = {
            {"Gajah","Katak","Kelinci","Monyet"},
            {"Jerapah","Ikan","Semut","Monyet"},
            {"Semut","Katak","Kelinci","Gajah"},
            {"Jerapah","Katak","Ikan","Monyet"},
            {"Gajah","Ikan","Kelinci","Monyet"}
    };

    private String jawabanbenar [] = {
            "Kelinci",
            "Jerapah",
            "Gajah",
            "Monyet",
            "Ikan"
    };

    public String getPertanyaan (int x) {
        String soal = pertanyaan [x];
        return soal;
    }

    public String getpilihanjawaban1 (int x) {
        String jawaban1 = pilihanjawaban [x][0];
        return jawaban1;
    }

    public String getpilihanjawaban2 (int x) {
        String jawaban2 = pilihanjawaban [x][1];
        return jawaban2;
    }

    public String getpilihanjawaban3 (int x) {
        String jawaban3 = pilihanjawaban [x][2];
        return jawaban3;
    }

    public String getpilihanjawaban4 (int x) {
        String jawaban4 = pilihanjawaban [x][3];
        return jawaban4;
    }

    public String getjawabanbenar (int x){
        String jawaban = jawabanbenar [x];
        return jawaban;
    }
}
