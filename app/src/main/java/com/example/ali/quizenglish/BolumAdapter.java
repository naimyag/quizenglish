package com.example.ali.quizenglish;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Ali on 22.8.2015.
 */
public class BolumAdapter extends BaseAdapter {


    private Context context;
    private Bolumler bolumler;

    public BolumAdapter(Context context, Bolumler bolumler) {
        this.context = context;
        this.bolumler = bolumler;
    }

    @Override
    public int getCount() {
        return bolumler.getBolumler().size();
    }

    @Override
    public Object getItem(int position) {
        return bolumler.getBolumler().get(position);
    }

    @Override
    public long getItemId(int position) {
        return bolumler.getBolumler().get(position).getBolumno();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Bolum blm = (Bolum) getItem(position);

        int YildizSayisi =blm.getBolumyildiz();

        LayoutInflater li = ((Activity) context).getLayoutInflater();

        LinearLayout pnlItem = (LinearLayout)  li.inflate(R.layout.gridbolumitem, null);




        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int screenWidth = (displaymetrics.widthPixels/3)-20;
        // int screenHeight = displaymetrics.heightPixels;




        TextView txtBolumNo =  (TextView) pnlItem.findViewById(R.id.bolum);
        TextView txtBolum =  (TextView) pnlItem.findViewById(R.id.txtBolum);

        txtBolumNo.setText((position + 1) + "");
        txtBolum.setText("Bölüm");

        ImageView yldz1 = (ImageView) pnlItem.findViewById(R.id.yildiz1);
        ImageView yldz2 = (ImageView) pnlItem.findViewById(R.id.yildiz2);
        ImageView yldz3 = (ImageView) pnlItem.findViewById(R.id.yildiz3);

        yldz1.setImageResource(R.drawable.yildizpasif);
        yldz2.setImageResource(R.drawable.yildizpasif);
        yldz3.setImageResource(R.drawable.yildizpasif);

        switch (YildizSayisi){
            case 0:
                pnlItem.setBackground(context.getResources().getDrawable(R.drawable.buttonpasif));
                break;
            case 1:
                yldz1.setImageResource(R.drawable.yildizaktif);
                break;
            case 2:
                yldz1.setImageResource(R.drawable.yildizaktif);
                yldz2.setImageResource(R.drawable.yildizaktif);
                break;
            case 3:
                yldz1.setImageResource(R.drawable.yildizaktif);
                yldz2.setImageResource(R.drawable.yildizaktif);
                yldz3.setImageResource(R.drawable.yildizaktif);
                break;
        }
        return pnlItem;
    }
}
