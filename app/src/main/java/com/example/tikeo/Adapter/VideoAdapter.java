package com.example.tikeo.Adapter;

import static com.example.tikeo.Activity.MainActivity.thumpnailBitmaps;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikeo.Activity.PlayActivity;
import com.example.tikeo.Adapter.Holder.VideoHolder;
import com.example.tikeo.Models.Video;
import com.example.tikeo.R;

import java.io.IOException;
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
        String title = videoList.get(position).getName();
        holder.getNameTextView().setText(title);

        String otherInfo = videoList.get(position).getPath().getPath();
        holder.getOtherTextView().setText(otherInfo);

        holder.getNumTextView().setText(String.valueOf(position));

        String duration = milliSecondsToTimer(videoList.get(position).getDuration());
        holder.getDurationTextView().setText(duration);

        holder.getImageView().setImageBitmap(thumpnailBitmaps.get(position));

        holder.getButton().setOnClickListener(e -> {
            startMyActivity(position);
        });

        holder.itemView.setOnClickListener(e -> {
            startMyActivity(position);
        });
    }

    private void startMyActivity(int position) {
        Intent intent = new Intent(context, PlayActivity.class);
        intent.putExtra("position", position);
        context.startActivity(intent);
    }

    public String milliSecondsToTimer(long milliseconds) {
        String finalTimerString;
        String secondsString;

        // Chuyển đổi tổng số milliseconds thành số giây
        int seconds = (int) (milliseconds / 1000);

        // Tính số phút
        int minutes = seconds / 60;
        seconds = seconds % 60;

        // Định dạng chuỗi cho số giây và số phút
        secondsString = String.valueOf(seconds);
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        finalTimerString = minutes + ":" + secondsString;

        // Trả về chuỗi mm:ss
        return finalTimerString;
    }


    @Override
    public int getItemCount() {
        return (videoList.size() > 0 ? videoList.size() : 1);
    }
}
