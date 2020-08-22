package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {
    private Post Item;
    private TextView tvNombre,tvid;
    private ImageView imgfoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        Item = (Post) getIntent().getSerializableExtra("objetoData");

        tvNombre= (TextView) findViewById(R.id.textView7);
        tvid =(TextView)findViewById(R.id.textView9);
        imgfoto= (ImageView) findViewById(R.id.imageView);

        tvNombre.setText(Item.getname());
        tvid.setText(Item.getId());
        imgfoto.setImageResource(Item.getfoto());
    }


}