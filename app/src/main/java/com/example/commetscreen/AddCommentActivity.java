package com.example.commetscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AddCommentActivity extends AppCompatActivity {

    ImageView ic_back, ic_onlyme, ic_public;
    TextView tv_onlyme, tv_public, tv_count, tv_submit;
    LinearLayout ll_onlyme, ll_public;
    EditText editText;
    int maxLimit =0;

    int isSelected = -1;
    boolean a = false;
    boolean b = false;

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
        tv_count = findViewById(R.id.tv_count);
        tv_public = findViewById(R.id.tv_public);
        tv_submit = findViewById(R.id.tv_submit);

        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        editText = findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                maxLimit = 120 - editText.length();
                String convert = String.valueOf(maxLimit);
                tv_count.setText(convert);
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        tv_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddCommentActivity.this, ThankuActivity.class));
            }
        });

    }
}
