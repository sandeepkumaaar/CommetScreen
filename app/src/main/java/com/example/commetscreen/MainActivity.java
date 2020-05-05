package com.example.commetscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> titleList = new ArrayList<>();
    MyAdapter adapter;
    ImageView img_comment;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        titleList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित अनुवाद एछित जाने दर्शाता");
        titleList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित अनुवाद एछित जाने दर्शाता");
        titleList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित अनुवाद एछित जाने दर्शाता");
        titleList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित अनुवाद एछित जाने दर्शाता");
        titleList.add("निर्माण अर्थपूर्ण तरीके जनित हमारी कुशलता स्थापित अनुवाद एछित जाने दर्शाता");

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        adapter = new MyAdapter(titleList);
        recyclerView.setAdapter(adapter);

        img_comment = findViewById(R.id.img_comment);
        img_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddCommentActivity.class));
            }
        });

        textView = findViewById(R.id.tv_comments);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });


    }
}
