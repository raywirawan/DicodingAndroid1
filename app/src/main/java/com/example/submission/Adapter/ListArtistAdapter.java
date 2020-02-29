package com.example.submission.Adapter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.submission.Activity.DetailsActivity;
import com.example.submission.Models.Artist;
import com.example.submission.R;

import java.util.ArrayList;

public class ListArtistAdapter extends RecyclerView.Adapter<ListArtistAdapter.ListViewHolder> {
    private ArrayList<Artist> listArtist;

    public ListArtistAdapter(ArrayList<Artist> list) {
        this.listArtist = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_card, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int i) {
        final Artist artist = listArtist.get(i);
        holder.pbLoading.setVisibility(View.VISIBLE);
        Glide.with(holder.itemView.getContext())
                .load(artist.getPhoto_link())
//                .apply(new RequestOptions().override(55, 55))
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        holder.pbLoading.setVisibility(View.GONE);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        holder.pbLoading.setVisibility(View.GONE);
                        return false;
                    }
                })
                .into(holder.imgPhoto);
        holder.tvName.setText(artist.getName());
        holder.tvJob.setText(artist.getOccupation());
        holder.tvGender.setText(artist.getGender());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                intent.putExtra("key", artist.getId());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listArtist.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvJob, tvGender;
        ProgressBar pbLoading;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvJob = itemView.findViewById(R.id.tv_item_job);
            tvGender = itemView.findViewById(R.id.tv_item_gender);
            pbLoading = itemView.findViewById(R.id.pb_card_imageloading);
        }
    }
}
