package com.example.commetscreen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class OtpFragment extends Fragment implements TextWatcher {

    private EditText otp_1, opt_2, opt_3, opt_4;

    public OtpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_otp, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        otp_1 = view.findViewById(R.id.opt_1);
        opt_2 = view.findViewById(R.id.opt_2);
        opt_3 = view.findViewById(R.id.opt_3);
        opt_4 = view.findViewById(R.id.otp_4);

        otp_1.addTextChangedListener(this);
        opt_2.addTextChangedListener(this);
        opt_3.addTextChangedListener(this);
        opt_4.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (s.length() == 1) {
            if (otp_1.length() == 1) {
                opt_2.requestFocus();
            }
            if (opt_2.length() == 1) {
                opt_3.requestFocus();
            }
            if (opt_3.length() == 1) {
                opt_4.requestFocus();
            }
        } else if (s.length() == 0) {
            if (opt_4.length() == 0) {
                opt_3.requestFocus();
            }
            if (opt_3.length() == 0){
                opt_2.requestFocus();
            }
            if (opt_2.length() == 0){
                otp_1.requestFocus();
            }
        }
    }
}
