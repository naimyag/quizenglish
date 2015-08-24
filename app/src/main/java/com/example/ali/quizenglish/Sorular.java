package com.example.ali.quizenglish;

import java.util.ArrayList;

/**
 * Created by Ali on 23.8.2015.
 */
public class Sorular {

    private ArrayList<Soru> sorular;

    public ArrayList<Soru> getSorular() {
        return sorular;
    }

    public Sorular(){
        sorular= new ArrayList<Soru>();

        sorular.add(new Soru("a","b","x","y","z"));
        sorular.add(new Soru("a1","b1","x1","y1","z1"));
        sorular.add(new Soru("a2","b2","x2","y2","z2"));
        sorular.add(new Soru("a3","b3","x3","y3","z3"));
        sorular.add(new Soru("a4","b4","x4","y4","z4"));
        sorular.add(new Soru("a5","b5","x5","y5","z5"));
        sorular.add(new Soru("a6","b6","x6","y6","z6"));
        sorular.add(new Soru("a7","b7","x7","y7","z7"));
        sorular.add(new Soru("a8","b8","x8","y8","z8"));
        sorular.add(new Soru("a9","b9","x9","y9","z9"));

    }
}
