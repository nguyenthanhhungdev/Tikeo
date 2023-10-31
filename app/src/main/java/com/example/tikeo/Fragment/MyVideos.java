package com.example.tikeo.Fragment;

import static com.example.tikeo.Activity.MainActivity.videoList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikeo.Adapter.VideoAdapter;
import com.example.tikeo.R;

public class MyVideos extends Fragment {
    private View view;
    private RecyclerView recyclerView;
    private VideoAdapter videoAdapter;

    public MyVideos(int contentLayoutId) {
        super(contentLayoutId);
    }

    public MyVideos() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewSong);
        recyclerView.setHasFixedSize(true);

        if (!videoList.isEmpty()) {
            if (videoList.size() > 1){//            Nếu lấy ra thành công video thì tạo đối tượng adapter
                videoAdapter = new VideoAdapter(getContext(), videoList);
//            Thêm adapter vào recyclerView
                recyclerView.setAdapter(videoAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
            }
        }
    }
}
