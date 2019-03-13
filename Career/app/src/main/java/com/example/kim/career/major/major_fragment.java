package com.example.kim.career.major;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kim.career.MainActivity;
import com.example.kim.career.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class major_fragment extends Fragment {

    static List<major_list> major_listList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.major_main_view, container, false);

        CardView major_list_1 = rootView.findViewById(R.id.major_list_1);
        CardView major_list_2 = rootView.findViewById(R.id.major_list_2);
        CardView major_list_3 = rootView.findViewById(R.id.major_list_3);
        CardView major_list_4 = rootView.findViewById(R.id.major_list_4);
        CardView major_list_5 = rootView.findViewById(R.id.major_list_5);
        CardView major_list_6 = rootView.findViewById(R.id.major_list_6);
        CardView major_list_7 = rootView.findViewById(R.id.major_list_7);

        major_list_1.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                major_listList.clear();
                new major_fragment.Major_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=MAJOR&contentType=json&gubun=univ_list&subject=100391");
            }
        });
        major_list_2.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                major_listList.clear();
                new major_fragment.Major_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=MAJOR&contentType=json&gubun=univ_list&subject=100392");
            }
        });
        major_list_3.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                major_listList.clear();
                new major_fragment.Major_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=MAJOR&contentType=json&gubun=univ_list&subject=100393");
            }
        });
        major_list_4.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                major_listList.clear();
                new major_fragment.Major_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=MAJOR&contentType=json&gubun=univ_list&subject=100394");
            }
        });
        major_list_5.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                major_listList.clear();
                new major_fragment.Major_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=MAJOR&contentType=json&gubun=univ_list&subject=100395");
            }
        });
        major_list_6.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                major_listList.clear();
                new major_fragment.Major_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=MAJOR&contentType=json&gubun=univ_list&subject=100396");
            }
        });
        major_list_7.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                major_listList.clear();
                new major_fragment.Major_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=MAJOR&contentType=json&gubun=univ_list&subject=100397");
            }
        });

        return  rootView;
    }

    /********************************학과_리스트 부분********************************/
    private class Major_ListHttpAsyncTask extends AsyncTask<String, Void, String> {

        private final String TAG = MainActivity.class.getSimpleName();
        OkHttpClient client = new OkHttpClient();

        @Override
        protected String doInBackground(String... Params) {

            String result = null;
            String strUrl = Params[0];

            String mClass;  //학과
            String majorSeq;    //학과코드

            try {
                Request request = new Request.Builder()
                        .url(strUrl)
                        .build();
                Response response = client.newCall(request).execute();

                JSONObject object = new JSONObject(response.body().string());
                JSONObject dataSearch = object.getJSONObject("dataSearch");
                JSONArray content = dataSearch.getJSONArray("content");

                for (int i = 0; i < content.length(); i++) {
                    JSONObject jsonObject = content.getJSONObject(i);
                    Log.d(TAG, "Major_ListHttpAsyncTask : " + jsonObject.toString());

                    mClass = jsonObject.getString("mClass");
                    majorSeq = jsonObject.getString("majorSeq");

                    major_list major_list = new major_list(mClass, majorSeq);
                    major_listList.add(major_list);
                }

                Log.d(TAG, "major_listList : " + major_listList);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return result;
        }

    }

}
