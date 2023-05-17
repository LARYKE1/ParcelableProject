package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte=new Intent(getApplicationContext(),MainReceiever.class);


                int imageResource=R.drawable.cutedog;

                MyParcelable gift=new MyParcelable("Mihai","My new dog",imageResource ,new String[]{
                        "Hey",
                        "I want to show you my new dog"
                });//is not my dog btw

                inte.putExtra("giftbox",gift);
                startActivity(inte);
            }
        });


    }
}