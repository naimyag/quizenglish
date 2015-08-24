package com.example.ali.quizenglish;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MenuZorluk extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener {

    TextView txtKolayToplam;
    TextView txtNormalToplam;
    TextView txtZorToplam;
    FrameLayout frmKolay;
    FrameLayout frmNormal;
    FrameLayout frmZor;


    private void init(){
        txtKolayToplam = (TextView) findViewById(R.id.txtKolayToplam);
        txtNormalToplam = (TextView) findViewById(R.id.txtNormalToplam);
        txtZorToplam = (TextView) findViewById(R.id.txtZorToplam);
        frmKolay = (FrameLayout) findViewById(R.id.frmKolay);
        frmNormal= (FrameLayout) findViewById(R.id.frmNormal);
        frmZor= (FrameLayout) findViewById(R.id.frmZor);
        TextView txtKolay = (TextView) findViewById(R.id.txtKolay);
        TextView txtNormal = (TextView) findViewById(R.id.txtNormal);
        TextView txtZor = (TextView) findViewById(R.id.txtZor);
        Typeface tf = Typeface.createFromAsset(getAssets(),"Impact.ttf");
        txtKolayToplam.setTypeface(tf);
        txtKolay.setTypeface(tf);
        txtNormalToplam.setTypeface(tf);
        txtNormal.setTypeface(tf);
        txtZorToplam.setTypeface(tf);
        txtZor.setTypeface(tf);

        frmKolay.setOnClickListener(this);
        frmNormal.setOnClickListener(this);
        frmZor.setOnClickListener(this);

        frmKolay.setOnTouchListener(this);
        frmNormal.setOnTouchListener(this);
        frmZor.setOnTouchListener(this);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_zorluk);
        init();
    }



    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.frmKolay:
                Intent intent1 = new Intent(MenuZorluk.this, GridBolumler.class);
                Bundle bndlanimation1= ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation1, R.anim.animation2).toBundle();
                startActivity(intent1,bndlanimation1);
                break;
            case R.id.frmNormal:
                Intent intent2 = new Intent(MenuZorluk.this, GridBolumler.class);
                Bundle bndlanimation2= ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.animation1,R.anim.animation2).toBundle();
                startActivity(intent2,bndlanimation2);
                break;
            case R.id.frmZor:
                Intent intent3 = new Intent(MenuZorluk.this, GridBolumler.class);
                Bundle bndlanimation3= ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.animation1,R.anim.animation2).toBundle();
                startActivity(intent3,bndlanimation3);
                break;
        }

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (view.getId()){
                case R.id.frmKolay:
                    if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        frmKolay.setBackgroundResource(R.drawable.kolaybutton1koyu);
                    } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                        frmKolay.setBackgroundResource(R.drawable.kolaybutton1);
                    }
                    break;
                case R.id.frmNormal:
                    if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        frmNormal.setBackgroundResource(R.drawable.normalbutton1koyu);
                    } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                        frmNormal.setBackgroundResource(R.drawable.normalbutton1);
                    }
                    break;
                case R.id.frmZor:
                    if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        frmZor.setBackgroundResource(R.drawable.zorbutton1koyu);
                    } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                        frmZor.setBackgroundResource(R.drawable.zorbutton1);
                    }
                    break;
            }

                return false;

    }
}
