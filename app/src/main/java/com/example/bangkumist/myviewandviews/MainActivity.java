package com.example.bangkumist.myviewandviews;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton imgChat;
    Button btnBuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgChat = findViewById(R.id.imgchat);
        imgChat.setOnClickListener(this);
        btnBuy= findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(this);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Google Pixel");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgchat:
                String text = "Beli sis";// Replace with your message.

                String toNumber = "+62895357637876"; // Replace with mobile phone number without +Sign or leading zeros.


                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
                startActivity(intent);
                break;
            case R.id.btn_buy:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fi.google.com/about/phones/#pixel-2"));
                startActivity(i);
                break;
        }
    }
}
