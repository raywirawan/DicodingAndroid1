package com.example.submission.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.submission.Models.ArtistData;
import com.example.submission.Adapter.ListArtistAdapter;
import com.example.submission.Models.Artist;
import com.example.submission.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvArtist;
    private ArrayList<Artist> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("My Favorite Artists");
        }
        rvArtist = findViewById(R.id.rv_artist);
        rvArtist.setHasFixedSize(true);
        list.addAll(ArtistData.getListData());
        showList();
    }


    private void showList(){
        rvArtist.setLayoutManager(new LinearLayoutManager(this));
        ListArtistAdapter listArtistAdapter = new ListArtistAdapter(list);
        rvArtist.setAdapter(listArtistAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
        }
    }
}
