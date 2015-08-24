package com.example.ali.quizenglish;

/**
 * Created by Ali on 22.8.2015.
 */
public class Bolum {

    private int bolumno;
    private int bolumyildiz;

    public Bolum(int bolumno, int bolumyildiz) {
        this.bolumno = bolumno;
        this.bolumyildiz = bolumyildiz;
    }

    public int getBolumno() {
        return bolumno;
    }

    public void setBolumno(int bolumno) {
        this.bolumno = bolumno;
    }

    public int getBolumyildiz() {
        return bolumyildiz;
    }

    public void setBolumyildiz(int bolumyildiz) {
        this.bolumyildiz = bolumyildiz;
    }

}
