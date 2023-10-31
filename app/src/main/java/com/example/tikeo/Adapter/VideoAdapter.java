package com.example.tikeo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikeo.Adapter.Holder.VideoHolder;
import com.example.tikeo.Models.Video;
import com.example.tikeo.R;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoHolder> {
    private Context context;
    private List<Video> videoList;
    public VideoAdapter(Context context, List<Video> videoList) {
        this.context = context;
        this.videoList = videoList;
    }

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
