package com.example.ali.quizenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridBolumler extends AppCompatActivity {

    private GridView pnlGrid;
    private Bolumler bolumler;
    private BolumAdapter controller;

    private void init(){
        pnlGrid=(GridView) findViewById(R.id.pnlGrid);
        bolumler = new Bolumler();
        controller = new BolumAdapter(this,bolumler);
        pnlGrid.setAdapter(controller);
    }

    private void registerhandle(){

        pnlGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(GridBolumler.this, SoruActivity.class);
                intent.putExtra("bolum",position);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_bolumler);
        init();
        registerhandle();
    }


}
