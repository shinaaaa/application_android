package com.example.kim.career;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class home_fragment extends Fragment {

    private static final String TAG = home_fragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.home_main_view, container, false);

        TextView magazine_1_title = rootView.findViewById(R.id.magazine_1_title);
        TextView magazine_2_title = rootView.findViewById(R.id.magazine_2_title);
        TextView magazine_3_title = rootView.findViewById(R.id.magazine_3_title);
        TextView magazine_4_title = rootView.findViewById(R.id.magazine_4_title);
        TextView magazine_5_title = rootView.findViewById(R.id.magazine_5_title);
        TextView magazine_6_title = rootView.findViewById(R.id.magazine_6_title);
        TextView magazine_7_title = rootView.findViewById(R.id.magazine_7_title);
        TextView magazine_8_title = rootView.findViewById(R.id.magazine_8_title);
        TextView magazine_9_title = rootView.findViewById(R.id.magazine_9_title);
        TextView magazine_10_title = rootView.findViewById(R.id.magazine_10_title);

        TextView magazine_1_day = rootView.findViewById(R.id.magazine_1_day);
        TextView magazine_2_day = rootView.findViewById(R.id.magazine_2_day);
        TextView magazine_3_day = rootView.findViewById(R.id.magazine_3_day);
        TextView magazine_4_day = rootView.findViewById(R.id.magazine_4_day);
        TextView magazine_5_day = rootView.findViewById(R.id.magazine_5_day);
        TextView magazine_6_day = rootView.findViewById(R.id.magazine_6_day);
        TextView magazine_7_day = rootView.findViewById(R.id.magazine_7_day);
        TextView magazine_8_day = rootView.findViewById(R.id.magazine_8_day);
        TextView magazine_9_day = rootView.findViewById(R.id.magazine_9_day);
        TextView magazine_10_day = rootView.findViewById(R.id.magazine_10_day);

        final String magazine_1_link;
        final String magazine_2_link;
        final String magazine_3_link;
        final String magazine_4_link;
        final String magazine_5_link;
        final String magazine_6_link;
        final String magazine_7_link;
        final String magazine_8_link;
        final String magazine_9_link;
        final String magazine_10_link;


        final CardView magazine_1 = rootView.findViewById(R.id.magazine_1);
        CardView magazine_2 = rootView.findViewById(R.id.magazine_2);
        CardView magazine_3 = rootView.findViewById(R.id.magazine_3);
        CardView magazine_4 = rootView.findViewById(R.id.magazine_4);
        CardView magazine_5 = rootView.findViewById(R.id.magazine_5);
        CardView magazine_6 = rootView.findViewById(R.id.magazine_6);
        CardView magazine_7 = rootView.findViewById(R.id.magazine_7);
        CardView magazine_8 = rootView.findViewById(R.id.magazine_8);
        CardView magazine_9 = rootView.findViewById(R.id.magazine_9);
        CardView magazine_10 = rootView.findViewById(R.id.magazine_10);


        Bundle bundle = this.getArguments();
        Log.d(TAG, "bundle : " + bundle);
        if (bundle != null) {
            Toast.makeText(getActivity(), "값 확인.", LENGTH_SHORT).show();
            String message = bundle.getString("returnResult");
            String date[] = message.split("\n");

            magazine_1_title.setText(date[3]);
            magazine_1_link = date[4];
            magazine_1_day.setText(date[5]);
            magazine_1.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_1_link)));
                }
            });

            magazine_2_title.setText(date[7]);
            magazine_2_link = date[8];
            magazine_2_day.setText(date[9]);
            magazine_2.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_2_link)));
                }
            });

            magazine_3_title.setText(date[11]);
            magazine_3_link = date[12];
            magazine_3_day.setText(date[13]);
            magazine_3.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_3_link)));
                }
            });

            magazine_4_title.setText(date[15]);
            magazine_4_link = date[16];
            magazine_4_day.setText(date[17]);
            magazine_4.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_4_link)));
                }
            });

            magazine_5_title.setText(date[19]);
            magazine_5_link = date[20];
            magazine_5_day.setText(date[21]);
            magazine_5.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_5_link)));
                }
            });

            magazine_6_title.setText(date[23]);
            magazine_6_link = date[24];
            magazine_6_day.setText(date[25]);
            magazine_6.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_6_link)));
                }
            });

            magazine_7_title.setText(date[27]);
            magazine_7_link = date[28];
            magazine_7_day.setText(date[29]);
            magazine_7.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_7_link)));
                }
            });

            magazine_8_title.setText(date[31]);
            magazine_8_link = date[32];
            magazine_8_day.setText(date[33]);
            magazine_8.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_8_link)));
                }
            });

            magazine_9_title.setText(date[35]);
            magazine_9_link = date[36];
            magazine_9_day.setText(date[37]);
            magazine_9.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_9_link)));
                }
            });

            magazine_10_title.setText(date[39]);
            magazine_10_link = date[40];
            magazine_10_day.setText(date[41]);
            magazine_10.setOnClickListener(new CardView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(magazine_10_link)));
                }
            });
        }

        return  rootView;
    }

}
