package com.example.commetscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    String url = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTZyKcmOSdtyzyOndU-y7N1Gc42Gv76sfnczKgE4EZj01-P3h8V&usqp=CAU";

    ImageView imageView;
    RecyclerView rv_addComments, rv_bookmarks, rv_mydownloads;
    AddCommentsAdapter addCommentsAdapter;
    AddBookmarksAdapter addBookmarksAdapter;
    DownloadsAdapter downloadsAdapter;

    List<String> stringList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.imageView_profile);
        Glide.with(getBaseContext())
                .load(url)
                .apply(RequestOptions.circleCropTransform())
                .into(imageView);

        rv_addComments = findViewById(R.id.rv_addComments);
        rv_bookmarks = findViewById(R.id.rv_bookmarks);
        rv_mydownloads = findViewById(R.id.rv_mydownloads);

        stringList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित");
        stringList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित");
        stringList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित");
        stringList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित");
        stringList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित");

        // Add comment Adapter
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_addComments.setLayoutManager(llm);

        addCommentsAdapter = new AddCommentsAdapter(stringList);
        rv_addComments.setAdapter(addCommentsAdapter);

        // Bookmarks Adapter
        LinearLayoutManager llmTwo = new LinearLayoutManager(this);
        llmTwo.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_bookmarks.setLayoutManager(llmTwo);

        addBookmarksAdapter = new AddBookmarksAdapter(stringList);
        rv_bookmarks.setAdapter(addBookmarksAdapter);

        // Download Adapter
        LinearLayoutManager llmThree = new LinearLayoutManager(this);
        llmThree.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_mydownloads.setLayoutManager(llmThree);

        downloadsAdapter = new DownloadsAdapter(stringList);
        rv_mydownloads.setAdapter(downloadsAdapter);
    }
}
