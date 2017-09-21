package com.example.xmb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mOneButton, mTwoButton, mThreeButton, mFourButton, mFiveButton, mZeroButton, mSixButton, mSevenButton, mEightButton, mNineButton, mTimeButton, mDevideButton, mEqualButton, mAddButton, mCButton,
            mOppositeButton, mPercentButton, mMinusButton, mDotButton;
    private TextView mMonitorTextView;
    private Double r, n, m, p, sq, tem, ii;
    private String i, rr;
    private char j, d, e, jj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        i = "0";
        rr = "0";
        m = 0.0;
        p = 0.0;
        sq = 0.0;
        tem = 0.0;
        ii = 0.0;
        r = 0.0;
        n = 0.0;
        j = ' ';
        d = ' ';
        e = ' ';
        jj = ' ';
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mZeroButton = (Button) this.findViewById(R.id.id_zero_btn);
        mZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zero();
                if (Double.parseDouble(i) == 520) {
                    mMonitorTextView.setText("♡");
                } else {
                    mMonitorTextView.setText(i);
                }

            }
        });
        mMonitorTextView.setText(i);
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mOneButton = (Button) this.findViewById(R.id.id_one_btn);
        mOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one();
                mMonitorTextView.setText(i);
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mTwoButton = (Button) this.findViewById(R.id.id_two_btn);
        mTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two();
                mMonitorTextView.setText(i);
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mThreeButton = (Button) this.findViewById(R.id.id_three_btn);
        mThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                three();
                mMonitorTextView.setText(i);
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mFourButton = (Button) this.findViewById(R.id.id_four_btn);
        mFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four();
                if (Double.parseDouble(i) == 5201314) {
                    mMonitorTextView.setText("给你朵小发❀");
                } else {
                    mMonitorTextView.setText(i);
                }
                ;
            }

        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mFiveButton = (Button) this.findViewById(R.id.id_five_btn);
        mFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                five();
                mMonitorTextView.setText(i);
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mSixButton = (Button) this.findViewById(R.id.id_six_btn);
        mSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                six();
                mMonitorTextView.setText(i);
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mSevenButton = (Button) this.findViewById(R.id.id_seven_btn);
        mSevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven();
                mMonitorTextView.setText(i);
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mEightButton = (Button) this.findViewById(R.id.id_eight_btn);
        mEightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eight();
                mMonitorTextView.setText(i);
            }
        });

        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mNineButton = (Button) this.findViewById(R.id.id_nine_btn);
        mNineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nine();
                mMonitorTextView.setText(i);
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mAddButton = (Button) this.findViewById(R.id.id_add_btn);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j!=' '){
                    j = '+';
                    d = ' ';
                    i = "0";
                    rr = Double.toString(r);
                    if(Math.floor(r)==r){
                        rr = rr.substring(0,rr.length()-2);
                    }else{}
                    mMonitorTextView.setText(rr);
                    n = r;}
                else{
                    j = '+';
                    d = ' ';
                    r = Double.parseDouble(i);
                    i = "0";
                }
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mTimeButton = (Button) this.findViewById(R.id.id_time_btn);
        mTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j!=' '){
                    j = '*';
                    d = ' ';
                    i = "0";
                    rr = Double.toString(r);
                    if(Math.floor(r)==r){
                        rr = rr.substring(0,rr.length()-2);
                    }else{}
                    mMonitorTextView.setText(rr);
                    n = r;}
                else{
                    j = '*';
                    d = ' ';
                    r = Double.parseDouble(i);
                    i = "0";
                }
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mDevideButton = (Button) this.findViewById(R.id.id_devide_btn);
        mDevideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j!=' '){
                    j = '/';
                    d = ' ';
                    i = "0";
                    rr = Double.toString(r);
                    if(Math.floor(r)==r){
                        rr = rr.substring(0,rr.length()-2);
                    }else{}
                    mMonitorTextView.setText(rr);
                    n = r;}
                else{
                    j = '/';
                    d = ' ';
                    r = Double.parseDouble(i);
                    i = "0";
                }
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mMinusButton = (Button) this.findViewById(R.id.id_minus_btn);
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j!=' '){
                    j = '-';
                    d = ' ';
                    i = "0";
                    rr = Double.toString(r);
                    if(Math.floor(r)==r){
                        rr = rr.substring(0,rr.length()-2);
                    }else{}
                    mMonitorTextView.setText(rr);
                    n = r;}
                else{
                    j = '-';
                    d = ' ';
                    r = Double.parseDouble(i);
                    i = "0";
                }
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mDotButton = (Button) this.findViewById(R.id.id_dot_btn);
        mDotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( d != '.'){
                    i+=".";
                    d = '.';
                  mMonitorTextView.setText(i);
                }
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mCButton = (Button) this.findViewById(R.id.id_c_btn);
        mCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d = ' ';
                j = ' ';
                i = "0";
                r = 0.0;
                e = 0 ;
                mMonitorTextView.setText(i);
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mOppositeButton = (Button) this.findViewById(R.id.id_opposite_btn);
        mOppositeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mPercentButton = (Button) this.findViewById(R.id.id_percent_btn);
        mPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i.length()==1 && j==' '){
                    i="0";
                    n = 0.0;
                    mMonitorTextView.setText(i);
                }else{
                if (Double.parseDouble(i)== 0){
                    if(j ==' '){}else{
                            j = ' ';
                            i=Double.toString(n);
                            if(Math.floor(Double.parseDouble(i))==Double.parseDouble(i)){
                                i = i.substring(0,i.length()-2);
                            }else{
                            }
                        }
                    }else{
                        i = i.substring(0,i.length()-1);
                        mMonitorTextView.setText(i);
                        switch (j) {
                            case ' ':
                                n = Double.parseDouble(i);
                                break;
                            case '+':
                                r = Double.parseDouble(i) + n;
                                break;
                            case '-':
                                r = n - Double.parseDouble(i);
                                break;
                            case '*':
                                r = n * Double.parseDouble(i);
                                break;
                            case '/':
                                r = n / Double.parseDouble(i);
                                break;
                        }
                    }
                }
            }
        });
        mMonitorTextView = (TextView) this.findViewById(R.id.id_monitor_txt);
        mEqualButton = (Button) this.findViewById(R.id.id_equal_btn);
        mEqualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e == '=') {
                    switch (jj) {
                        case ' ':
                            n = ii;
                            break;
                        case '+':
                            r = ii + r;
                            break;
                        case '-':
                            r = r - ii;
                            break;
                        case '*':
                            r = r * ii;
                            break;
                        case '/':
                            r = r / ii;
                            break;
                    }
                    n = r;
                } else {
                    d = ' ';
                    n = r;
                    jj = j;
                    j = ' ';
                    ii = Double.parseDouble(i);
                    i = "0";
                    e = '=';
                }
                rr = Double.toString(r);
                if (Math.floor(r) == r) {
                    rr = rr.substring(0, rr.length() - 2);
                } else {
                }
                mMonitorTextView.setText(rr);
            }
        });
    }

    private void zero() {
        e = ' ';
        ii = 0.0;
        jj = ' ';
        if (Double.parseDouble(i) == 0 && d != '.') {
            i = "0";
        } else {
            i += "0";
        }
        switch (j) {
            case ' ':
                n = Double.parseDouble(i);
                break;
            case '+':
                r = Double.parseDouble(i) + n;
                break;
            case '-':
                r = n - Double.parseDouble(i);
                break;
            case '*':
                r = n * Double.parseDouble(i);
                break;
            case '/':
                r = n / Double.parseDouble(i);
                break;
        }
    }

    private void one() {
        e = ' ';
        ii = 0.0;
        jj = ' ';

        if (Double.parseDouble(i) == 0 && d != '.') {
            i = "1";
        } else {
            i += "1";
        }
        switch (j) {
            case ' ':
                n = Double.parseDouble(i);
                break;
            case '+':
                r = Double.parseDouble(i) + n;
                break;
            case '-':
                r = n - Double.parseDouble(i);
                break;
            case '*':
                r = n * Double.parseDouble(i);
                break;
            case '/':
                r = n / Double.parseDouble(i);
                break;
        }
    }

    private void two() {
        e = ' ';
        ii = 0.0;
        jj = ' ';

        if (Double.parseDouble(i) == 0 && d != '.') {
            i = "2";
        } else {
            i += "2";
        }
        switch (j) {
            case ' ':
                n = Double.parseDouble(i);
                break;
            case '+':
                r = Double.parseDouble(i) + n;
                break;
            case '-':
                r = n - Double.parseDouble(i);
                break;
            case '*':
                r = n * Double.parseDouble(i);
                break;
            case '/':
                r = n / Double.parseDouble(i);
                break;
        }
    }

    private void three() {
        e = ' ';
        ii = 0.0;
        jj = ' ';
        if (Double.parseDouble(i) == 0 && d != '.') {
            i = "3";
        } else {
            i += "3";
        }
        switch (j) {
            case ' ':
                n = Double.parseDouble(i);
                break;
            case '+':
                r = Double.parseDouble(i) + n;
                break;
            case '-':
                r = n - Double.parseDouble(i);
                break;
            case '*':
                r = n * Double.parseDouble(i);
                break;
            case '/':
                r = n / Double.parseDouble(i);
                break;

        }
    }

    private void four() {
        e = ' ';
        ii = 0.0;
        jj = ' ';
        if (Double.parseDouble(i) == 0 && d != '.') {
            i = "4";
        } else {
            i += "4";
        }
        switch (j) {
            case ' ':
                n = Double.parseDouble(i);
                break;
            case '+':
                r = Double.parseDouble(i) + n;
                break;
            case '-':
                r = n - Double.parseDouble(i);
                break;
            case '*':
                r = n * Double.parseDouble(i);
                break;
            case '/':
                r = n / Double.parseDouble(i);
                break;

        }
    }

    private void five() {
        e = ' ';
        ii = 0.0;
        jj = ' ';
        if (Double.parseDouble(i) == 0 && d != '.') {
            i = "5";
        } else {
            i += "5";
        }
        switch (j) {
            case ' ':
                n = Double.parseDouble(i);
                break;
            case '+':
                r = Double.parseDouble(i) + n;
                break;
            case '-':
                r = n - Double.parseDouble(i);
                break;
            case '*':
                r = n * Double.parseDouble(i);
                break;
            case '/':
                r = n / Double.parseDouble(i);
                break;

        }
    }

    private void six() {
        e = ' ';
        ii = 0.0;
        jj = ' ';
        if (Double.parseDouble(i) == 0 && d != '.') {
            i = "6";
        } else {
            i += "6";
        }
        switch (j) {
            case ' ':
                n = Double.parseDouble(i);
                break;
            case '+':
                r = Double.parseDouble(i) + n;
                break;
            case '-':
                r = n - Double.parseDouble(i);
                break;
            case '*':
                r = n * Double.parseDouble(i);
                break;
            case '/':
                r = n / Double.parseDouble(i);
                break;

        }
    }
    private void seven (){
        e = ' ';
        ii = 0.0;
        jj = ' ';
        if(Double.parseDouble(i) == 0 && d!='.'){
            i = "7";
        }
        else{
            i += "7";
        }
        switch(j){
            case' ':
                n = Double.parseDouble(i);
                break;
            case'+':
                r = Double.parseDouble(i) + n;
                break;
            case'-':
                r = n - Double.parseDouble(i);
                break;
            case'*':
                r = n * Double.parseDouble(i);
                break;
            case'/':
                r = n / Double.parseDouble(i);
                break;

        }
    }
    private void eight(){
        e = ' ';
        ii = 0.0;
        jj = ' ';
        if(Double.parseDouble(i) == 0 && d!='.'){
            i = "8";
        }
        else{
            i += "8";
        }
        switch(j){
            case' ':
                n = Double.parseDouble(i);
                break;
            case'+':
                r = Double.parseDouble(i) + n;
                break;
            case'-':
                r = n - Double.parseDouble(i);
                break;
            case'*':
                r = n * Double.parseDouble(i);
                break;
            case'/':
                r = n / Double.parseDouble(i);
                break;

        }
    }
    private void nine(){
        e = ' ';
        ii = 0.0;
        jj = ' ';
        if(Double.parseDouble(i) == 0 && d!='.'){
            i = "9";
        }
        else{
            i += "9";
        }
        switch(j){
            case' ':
                n = Double.parseDouble(i);
                break;
            case'+':
                r = Double.parseDouble(i) + n;
                break;
            case'-':
                r = n - Double.parseDouble(i);
                break;
            case'*':
                r = n * Double.parseDouble(i);
                break;
            case'/':
                r = n / Double.parseDouble(i);
                break;

        }
    }
}
