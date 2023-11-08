package com.example.tikeo.Adapter.Holder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikeo.R;

public class VideoHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView numTextView, nameTextView, otherTextView, durationTextView;
    private ImageButton button;

    public VideoHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        numTextView = itemView.findViewById(R.id.numberText);
        nameTextView = itemView.findViewById(R.id.nameSongTextView);
        otherTextView = itemView.findViewById(R.id.otherTextView);
        durationTextView = itemView.findViewById(R.id.durationTextView);
        button = itemView.findViewById(R.id.playButton);

    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public TextView getNumTextView() {
        return numTextView;
    }

    public void setNumTextView(TextView numTextView) {
        this.numTextView = numTextView;
    }

    public TextView getNameTextView() {
        return nameTextView;
    }

    public void setNameTextView(TextView nameTextView) {
        this.nameTextView = nameTextView;
    }

    public TextView getOtherTextView() {
        return otherTextView;
    }

    public void setOtherTextView(TextView otherTextView) {
        this.otherTextView = otherTextView;
    }

    public TextView getDurationTextView() {
        return durationTextView;
    }

    public void setDurationTextView(TextView durationTextView) {
        this.durationTextView = durationTextView;
    }

    public ImageButton getButton() {
        return button;
    }

    public void setButton(ImageButton button) {
        this.button = button;
    }
}
