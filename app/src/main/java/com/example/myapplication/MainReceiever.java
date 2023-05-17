package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class MainReceiever extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        img=findViewById(R.id.imgView);

        MyParcelable gift=(MyParcelable) getIntent().getParcelableExtra("giftbox");
        TextView txtView=(TextView) findViewById(R.id.textView);

        int imageResource=gift.getWishes();
        img.setImageResource(imageResource);
        txtView.setText(gift.getSenderName()+"\n"+gift.getSubject()+"\n"+Arrays.toString(gift.getMessage())+"\n");


    }
}