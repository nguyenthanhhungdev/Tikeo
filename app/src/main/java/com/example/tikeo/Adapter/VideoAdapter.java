package com.example.tikeo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikeo.Adapter.Holder.VideoHolder;
import com.example.tikeo.R;

public class VideoAdapter extends RecyclerView.Adapter<VideoHolder> {
    @NonNull
    @Override
    public VideoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_item, parent, false);
        return new VideoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
