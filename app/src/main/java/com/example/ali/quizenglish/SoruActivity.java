package com.example.ali.quizenglish;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class SoruActivity extends AppCompatActivity implements View.OnClickListener {

    private int bolum;
    private Sorular sorular;
    private int sira=0;
    private int dogrusayi=0;
    private int yanlissayi=0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btnSoru;

public void Init(){
    btn1 =(Button) findViewById(R.id.sik1);
    btn2 =(Button) findViewById(R.id.sik2);
    btn3 =(Button) findViewById(R.id.sik3);
    btn4 =(Button) findViewById(R.id.sik4);
    btnSoru = (Button) findViewById(R.id.soru);
}

    public void soruGetir(int sorusira){
        Intent intent = getIntent();

        //this.setTitle(String.format("%d",bolum));
        sorular = new Sorular();

        bolum = intent.getIntExtra("bolum",0);

        Soru sr;
        sr=sorular.getSorular().get(sorusira);

        ArrayList<String> siklar = new ArrayList<String>();

        siklar.add(sr.getSoruCevap().getCevap());
        siklar.add(sr.getYanlis1());
        siklar.add(sr.getYanlis2());
        siklar.add(sr.getYanlis3());

        Random r = new Random();

        int rnd = r.nextInt(4);

        btn1.setOnClickListener(this);
        btn1.setText(siklar.get(rnd));
        siklar.remove(rnd);


        btn2.setOnClickListener(this);
        rnd = r.nextInt(3);
        btn2.setText(siklar.get(rnd));
        siklar.remove(rnd);

        btn3.setOnClickListener(this);
        rnd = r.nextInt(2);
        btn3.setText(siklar.get(rnd));
        siklar.remove(rnd);

        btn4.setOnClickListener(this);
        btn4.setText(siklar.get(0));

        btnSoru.setClickable(false);
        btnSoru.setText(sr.getSoruCevap().getSoru());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soru);
        Init();
        soruGetir(sira);
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        if (b.getText()==sorular.getSorular().get(sira).getSoruCevap().getCevap())
            {
                dogrusayi+=1;
                this.setTitle(String.format("Doğru:%d   Yanlış=%d",dogrusayi,yanlissayi));
                //this.setTitle(b.getText()+" "+sorular.getSorular().get(sira).getSoruCevap().getCevap());
                sira+=1;
                soruGetir(sira);
            }
        else
            {
                yanlissayi+=1;
                //this.setTitle(b.getText()+" "+sorular.getSorular().get(sira).getSoruCevap().getCevap());
                this.setTitle(String.format("Doğru:%d   Yanlış=%d",dogrusayi,yanlissayi));
                sira+=1;
                soruGetir(sira);
            }

    }
}
