package com.example.commetscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AddCommentsAdapter extends RecyclerView.Adapter<AddCommentsAdapter.AddCommentViewHolder> {

    private List<String> stringList;

    public AddCommentsAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public AddCommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_card, parent, false);
        return new AddCommentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddCommentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    class AddCommentViewHolder extends RecyclerView.ViewHolder {
        AddCommentViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
