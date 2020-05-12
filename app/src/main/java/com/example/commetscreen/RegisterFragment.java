package com.example.commetscreen;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tv_register = view.findViewById(R.id.tv_register);
        String text = "कृपया अपना मोबाइल नंबर दर्ज करें";
        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.parseColor("#d71920"));
        ss.setSpan(fcsRed, 11,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv_register.setText(ss);

        TextView tv_submit = view.findViewById(R.id.tv_submit);
        tv_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                OtpFragment otpFragment = new OtpFragment();
                ft.replace(R.id.container, otpFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
    }
}
