package com.yenus210.carpoolingtecstudentapp;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

public class Tab1MapWest extends Fragment {
    private Button _0,_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12;
    private ProgressBar _0_1, _1_2, _2_3,_3_4, _4_5,_1_7, _2_8, _3_9, _3_10, _4_11,_0_6, _5_11, _5_12, _6_7, _7_8, _8_9, _9_10, _10_11, _11_12;
    private int progressStatus = 100;
    private Handler handler = new Handler();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

        _0 = (Button) rootView.findViewById(R.id._0);
        _0_1= (ProgressBar) rootView.findViewById(R.id._0_1);
        _1 = (Button) rootView.findViewById(R.id._1);
        _1_2= (ProgressBar) rootView.findViewById(R.id._1_2);
        _2 = (Button) rootView.findViewById(R.id._2);
        _2_3= (ProgressBar) rootView.findViewById(R.id._2_3);
        _3 = (Button) rootView.findViewById(R.id._3);
        _3_4= (ProgressBar) rootView.findViewById(R.id._3_4);
        _4 = (Button) rootView.findViewById(R.id._4);
        _4_5= (ProgressBar) rootView.findViewById(R.id._4_5);
        _5= (Button) rootView.findViewById(R.id._5);
        _5_12= (ProgressBar) rootView.findViewById(R.id._5_11);
        _5_12= (ProgressBar) rootView.findViewById(R.id._5_12);
        _6 = (Button) rootView.findViewById(R.id._6);
        _6_7= (ProgressBar) rootView.findViewById(R.id._6_7);
        _7 = (Button) rootView.findViewById(R.id._7);
        _7_8= (ProgressBar) rootView.findViewById(R.id._7_8);


        Button [] buttonL = {_0,_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12};
        _0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pbar(_0_1);
            }
        });
        _1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pbar(_1_2);
            }
        });

        return rootView;

    }

    public void pbar (final ProgressBar x){
        new Thread(new Runnable() {
            public void run() {
                while (progressStatus > 0) {
                    progressStatus -= 1;
                    // Update the progress bar and display the
                    //current value in the text view
                    handler.post(new Runnable() {
                        public void run() {
                            x.setProgress(progressStatus);
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
