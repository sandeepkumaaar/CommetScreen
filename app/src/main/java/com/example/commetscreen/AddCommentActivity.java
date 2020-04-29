package com.example.commetscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AddCommentActivity extends AppCompatActivity {

    ImageView ic_back, ic_onlyme, ic_public;
    TextView tv_onlyme, tv_public;
    LinearLayout ll_onlyme, ll_public;

    int isSelected = -1;
    boolean a = false; // no selection by default
    boolean b = false; // no selection by default

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_comment);

        ic_onlyme = findViewById(R.id.ic_onlyme);
        ic_public = findViewById(R.id.ic_public);
        ic_back = findViewById(R.id.ic_back);

        ll_onlyme = findViewById(R.id.ll_onlyme);
        ll_public = findViewById(R.id.ll_public);

        tv_onlyme = findViewById(R.id.tv_onlyme);
        tv_public = findViewById(R.id.tv_public);

        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
