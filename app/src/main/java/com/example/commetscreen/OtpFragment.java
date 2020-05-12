package com.example.commetscreen;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class OtpFragment extends Fragment implements TextWatcher {

    private static final long START_TIME_IN_MILLIS = 30000;
    private boolean mTimerRunning = false;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private EditText otp_1, opt_2, opt_3, opt_4;
    private TextView tv_countDown;

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

        TextView tv_otp = view.findViewById(R.id.tv_otpScreen);
        String otpText = "कृपया आपके मोबाइल पर भेजे गए वेरिफिकेशन कोड दर्ज करें";
        SpannableString ss = new SpannableString(otpText);
        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.parseColor("#d71920"));
        ss.setSpan(fcsRed, 29,44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv_otp.setText(ss);

        otp_1 = view.findViewById(R.id.opt_1);
        opt_2 = view.findViewById(R.id.opt_2);
        opt_3 = view.findViewById(R.id.opt_3);
        opt_4 = view.findViewById(R.id.otp_4);

        otp_1.addTextChangedListener(this);
        opt_2.addTextChangedListener(this);
        opt_3.addTextChangedListener(this);
        opt_4.addTextChangedListener(this);

        tv_countDown = view.findViewById(R.id.tv_countDown); // textview Count
        TextView tv_reSendOtp = view.findViewById(R.id.tv_reSendOtp);

        // for start the timer
        TextView tv_submit = view.findViewById(R.id.tv_submit);
        tv_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });

        tv_reSendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });
        updateCountDownText();
    }

    private void startTimer() {
        CountDownTimer mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
            }
        }.start();

        mTimerRunning = true;
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d", minutes, seconds);
        tv_countDown.setText(timeLeftFormatted);
    }

    private void resetTimer() {
        mTimeLeftInMillis  = START_TIME_IN_MILLIS;
        updateCountDownText();
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
