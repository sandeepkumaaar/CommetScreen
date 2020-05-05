package com.example.commetscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DownloadsAdapter extends RecyclerView.Adapter<DownloadsAdapter.DownloadViewHolder> {

    private List<String> stringList;

    public DownloadsAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public DownloadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_card, parent, false);
        return new DownloadViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DownloadViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    class DownloadViewHolder extends RecyclerView.ViewHolder {
        DownloadViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
