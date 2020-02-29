package com.example.submission.Activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.submission.R;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView btnInstagram, btnFacebook, btnTwitter, btnLine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("About");
        }
        if (getSupportActionBar()  != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        btnInstagram = findViewById(R.id.btn_about_instagram);
        btnFacebook = findViewById(R.id.btn_about_facebook);
        btnTwitter = findViewById(R.id.btn_about_twitter);
        btnLine = findViewById(R.id.btn_about_line);

        btnInstagram.setOnClickListener(this);
        btnFacebook.setOnClickListener(this);
        btnTwitter.setOnClickListener(this);
        btnLine.setOnClickListener(this);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_about_instagram :
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/raywirawan/")));
                break;
            case R.id.btn_about_facebook :
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/raywirawanking")));
                break;
            case R.id.btn_about_twitter :
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/raywirawan_")));
                break;
            case R.id.btn_about_line :
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://line.me/ti/p/umKhdZhjV5")));
                break;
        }
    }
}
