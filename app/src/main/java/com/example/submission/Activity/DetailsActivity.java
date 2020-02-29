package com.example.submission.Activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.submission.Models.ArtistData;
import com.example.submission.Models.Artist;
import com.example.submission.R;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {
    private ArrayList<Artist> list = new ArrayList<>();
    private Artist artist;
    private TextView tvHeaderArtistName, tvDeskripsi, tvDetailsName, tvDetailsBorn, tvDetailsGender, tvDetailsOccupation;
    private ImageView ivDetailsPhoto;
    private ProgressBar pbLoadingPhoto;
    private ImageView btnWiki, btnInstagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String key = getIntent().getStringExtra("key");

        list.addAll(ArtistData.getListData());
        for (Artist a : list) {
            if (a.getId().equals(key)){
                artist = a;
            }
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Details");
        }
        if (getSupportActionBar()  != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tvHeaderArtistName = findViewById(R.id.tv_details_header_artistname);
        tvDeskripsi = findViewById(R.id.tv_details_deskripsi);
        tvDetailsName = findViewById(R.id.tv_details_table_name);
        tvDetailsBorn = findViewById(R.id.tv_details_table_born);
        tvDetailsGender = findViewById(R.id.tv_details_table_gender);
        tvDetailsOccupation = findViewById(R.id.tv_details_table_occupation);
        ivDetailsPhoto = findViewById(R.id.iv_details_photo);
        pbLoadingPhoto = findViewById(R.id.pb_details_loadphoto);
        btnInstagram = findViewById(R.id.btn_details_ig);
        btnWiki = findViewById(R.id.btn_details_wiki);
        ivDetailsPhoto = findViewById(R.id.iv_details_photo);

        tvHeaderArtistName.setText(artist.getName());
        tvDeskripsi.setText(artist.getDesc());
        tvDetailsName.setText(artist.getName());
        tvDetailsBorn.setText(artist.getBorn());
        tvDetailsGender.setText(artist.getGender());
        tvDetailsOccupation.setText(artist.getOccupation());
        Glide.with(this)
                .load(artist.getPhoto_link())
//                .apply(new RequestOptions().override(55, 55))
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        pbLoadingPhoto.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(), "Image Loading Failed", Toast.LENGTH_SHORT).show();
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        pbLoadingPhoto.setVisibility(View.GONE);
                        return false;
                    }
                })
                .into(ivDetailsPhoto);

        btnWiki.setOnClickListener(this);
        btnInstagram.setOnClickListener(this);
        ivDetailsPhoto.setOnClickListener(this);

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_details_wiki:
                String wiki_link = "https://en.wikipedia.org/wiki/"+artist.getWiki_name();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(wiki_link)));
                break;
            case R.id.btn_details_ig:
                String instagram_link = "https://www.instagram.com/"+artist.getInstagram_name()+"/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(instagram_link)));
                break;
            case R.id.iv_details_photo :
                Intent intent = new Intent(this, ImagePreviewActivity.class);
                intent.putExtra("image_link",artist.getPhoto_link());
                startActivity(intent);
                break;
        }
    }
}
