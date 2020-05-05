package com.example.commetscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AddBookmarksAdapter extends RecyclerView.Adapter<AddBookmarksAdapter.AddBookmarkViewHolder> {

    List<String> stringList;

    public AddBookmarksAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public AddBookmarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_card, parent, false);
        return new AddBookmarkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddBookmarkViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public class AddBookmarkViewHolder extends RecyclerView.ViewHolder {
        public AddBookmarkViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
