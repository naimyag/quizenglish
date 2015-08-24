package com.example.ali.quizenglish;

import java.util.ArrayList;

/**
 * Created by Ali on 23.8.2015.
 */
public class Soru {

    private String yanlis1;
    private String yanlis2;
    private String yanlis3;
    private SoruCevap soru;

    public class SoruCevap{
        private String soru;
        private String cevap;

        public String getCevap() {
            return cevap;
        }

        public void setCevap(String cevap) {
            this.cevap = cevap;
        }

        public String getSoru() {
            return soru;
        }

        public void setSoru(String soru) {
            this.soru = soru;
        }

        public SoruCevap(String soru, String cevap) {
            this.soru = soru;
            this.cevap = cevap;
        }
    }

    public SoruCevap getSoruCevap() {
        return soru;
    }

    public void setSoru(SoruCevap soru) {
        this.soru = soru;
    }

    public String getYanlis1() {
        return yanlis1;
    }

    public void setYanlis1(String yanlis1) {
        this.yanlis1 = yanlis1;
    }

    public String getYanlis2() {
        return yanlis2;
    }

    public void setYanlis2(String yanlis2) {
        this.yanlis2 = yanlis2;
    }

    public String getYanlis3() {
        return yanlis3;
    }

    public void setYanlis3(String yanlis3) {
        this.yanlis3 = yanlis3;
    }


    public Soru(String soru,String cevap, String yanlis1, String yanlis2, String yanlis3) {
        this.soru = new  SoruCevap(soru,cevap);
        this.yanlis1 = yanlis1;
        this.yanlis2 = yanlis2;
        this.yanlis3 = yanlis3;
    }

}
