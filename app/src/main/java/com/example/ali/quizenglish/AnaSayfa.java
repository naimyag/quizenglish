package com.example.ali.quizenglish;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class AnaSayfa extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    //sesimi duyan varmııııı

    Button btnOyun;
    Button btnYarisma;
    Button btnSerbestCalisma;
    Button btnOgrendiklerim;

    private void init()
    {
        btnOyun= (Button) findViewById(R.id.btnOyun);
        btnYarisma= (Button) findViewById(R.id.btnYarisma);
        btnSerbestCalisma= (Button) findViewById(R.id.btnSerbestCalisma);
        btnOgrendiklerim= (Button) findViewById(R.id.btnOgrendiklerim);

        btnOyun.setOnClickListener(this);
        btnYarisma.setOnClickListener(this);
        btnSerbestCalisma.setOnClickListener(this);
        btnOgrendiklerim.setOnClickListener(this);

        btnOyun.setOnTouchListener(this);
        btnYarisma.setOnTouchListener(this);
        btnSerbestCalisma.setOnTouchListener(this);
        btnOgrendiklerim.setOnTouchListener(this);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);
        init();

        Typeface tf = Typeface.createFromAsset(getAssets(), "Impact.ttf");
        LinearLayout lay = (LinearLayout) findViewById(R.id.anamenu);

        for(int count = 0; count < lay.getChildCount(); count ++) {

            View view=lay.getChildAt(count);
            if (view instanceof Button) {
                Button btn = (Button) view;
                btn.setTypeface(tf);
            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnOyun:
                Intent intent1 = new Intent(AnaSayfa.this, MenuZorluk.class);
                Bundle bndlanimation1= ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.animation1,R.anim.animation2).toBundle();
                startActivity(intent1,bndlanimation1);
                break;
            case R.id.btnYarisma:
                Intent intent2 = new Intent(AnaSayfa.this, MenuZorluk.class);
                Bundle bndlanimation2= ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.animation1,R.anim.animation2).toBundle();
                startActivity(intent2,bndlanimation2);
                break;
            case R.id.btnSerbestCalisma:
                Intent intent3 = new Intent(AnaSayfa.this, MenuZorluk.class);
                Bundle bndlanimation3= ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.animation1,R.anim.animation2).toBundle();
                startActivity(intent3,bndlanimation3);
                break;
            case R.id.btnOgrendiklerim:
                Intent intent4 = new Intent(AnaSayfa.this, MenuZorluk.class);
                Bundle bndlanimation4= ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.animation1,R.anim.animation2).toBundle();
                startActivity(intent4,bndlanimation4);
                break;
        }

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        switch (view.getId())
        {
            case R.id.btnOyun:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    btnOyun.setBackgroundResource(R.drawable.buttonontouch);
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btnOyun.setBackgroundResource(R.drawable.buton);
                }
                break;
            case R.id.btnYarisma:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    btnYarisma.setBackgroundResource(R.drawable.buttonontouch);
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btnYarisma.setBackgroundResource(R.drawable.buton);
                }
                break;
            case R.id.btnSerbestCalisma:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    btnSerbestCalisma.setBackgroundResource(R.drawable.buttonontouch);
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btnSerbestCalisma.setBackgroundResource(R.drawable.buton);
                }
                break;
            case R.id.btnOgrendiklerim:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    btnOgrendiklerim.setBackgroundResource(R.drawable.buttonontouch);
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btnOgrendiklerim.setBackgroundResource(R.drawable.buton);
                }
                break;
        }


        return false;
    }
}
