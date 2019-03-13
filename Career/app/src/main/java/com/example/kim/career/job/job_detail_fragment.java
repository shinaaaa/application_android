package com.example.kim.career.job;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kim.career.R;

import static android.widget.Toast.LENGTH_SHORT;

public class job_detail_fragment extends Fragment {

    Bundle bundle;

    private static final String TAG = job_detail_fragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.job_detail_view, container, false);

        TextView MAJOR_NM_get = rootView.findViewById(R.id.MAJOR_NM_get);

        if (bundle != null) {
            Toast.makeText(getContext(), "값 확인.", LENGTH_SHORT).show();
            String message = bundle.getString("MAJOR_NM_get");
            String date[] = message.split("\n");
            Log.d(TAG, "message1 : " + date[0] + date[2]+ date[3]+ date[4]+ date[5]);
        }

        return  rootView;
    }
}
