package com.example.kim.career.job;

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

public class job_fragment extends Fragment {

    static List<job_code_name> job_code_nameList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.job_main_view, container, false);

        CardView job_list_1 = rootView.findViewById(R.id.job_list_1);
        CardView job_list_2= rootView.findViewById(R.id.job_list_2);
        CardView job_list_3 = rootView.findViewById(R.id.job_list_3);
        CardView job_list_4 = rootView.findViewById(R.id.job_list_4);
        CardView job_list_5 = rootView.findViewById(R.id.job_list_5);
        CardView job_list_6 = rootView.findViewById(R.id.job_list_6);
        CardView job_list_7 = rootView.findViewById(R.id.job_list_7);
        CardView job_list_8 = rootView.findViewById(R.id.job_list_8);
        CardView job_list_9 = rootView.findViewById(R.id.job_list_9);
        CardView job_list_10 = rootView.findViewById(R.id.job_list_10);
        CardView job_list_11 = rootView.findViewById(R.id.job_list_11);
        CardView job_list_12 = rootView.findViewById(R.id.job_list_12);
        CardView job_list_13 = rootView.findViewById(R.id.job_list_13);
        CardView job_list_14 = rootView.findViewById(R.id.job_list_14);
        CardView job_list_15 = rootView.findViewById(R.id.job_list_15);
        CardView job_list_16 = rootView.findViewById(R.id.job_list_16);
        CardView job_list_17 = rootView.findViewById(R.id.job_list_17);
        CardView job_list_18 = rootView.findViewById(R.id.job_list_18);
        CardView job_list_19 = rootView.findViewById(R.id.job_list_19);
        CardView job_list_20 = rootView.findViewById(R.id.job_list_20);
        CardView job_list_21 = rootView.findViewById(R.id.job_list_21);
        CardView job_list_22 = rootView.findViewById(R.id.job_list_22);
        CardView job_list_23 = rootView.findViewById(R.id.job_list_23);
        CardView job_list_24 = rootView.findViewById(R.id.job_list_24);

        job_list_1.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100041");
            }
        });
        job_list_2.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100042");
            }
        });
        job_list_3.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100043");
            }
        });
        job_list_4.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100044");
            }
        });
        job_list_5.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100045");
            }
        });
        job_list_6.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100046");
            }
        });
        job_list_7.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100047");
            }
        });
        job_list_8.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100048");
            }
        });
        job_list_9.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100049");
            }
        });
        job_list_10.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100050");
            }
        });
        job_list_11.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100051");
            }
        });
        job_list_12.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100052");
            }
        });
        job_list_13.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100053");
            }
        });
        job_list_14.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100054");
            }
        });
        job_list_15.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100055");
            }
        });
        job_list_16.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100056");
            }
        });
        job_list_17.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100057");
            }
        });
        job_list_18.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100058");
            }
        });
        job_list_19.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100059");
            }
        });
        job_list_20.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100060");
            }
        });
        job_list_21.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100061");
            }
        });
        job_list_22.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100062");
            }
        });
        job_list_23.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100063");
            }
        });
        job_list_24.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                job_code_nameList.clear();
                new job_fragment.Job_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB&contentType=json&gubun=job_dic_list&category=100064");
            }
        });

        return rootView;
    }


    /********************************직업_리스트 부분********************************/
    private class Job_ListHttpAsyncTask extends AsyncTask<String, Void, String> {

        private final String TAG = MainActivity.class.getSimpleName();
        OkHttpClient client = new OkHttpClient();

        @Override
        protected String doInBackground(String... Params) {

            String result = null;
            String strUrl = Params[0];

            String jobdicSeq = "";   //직업 코드 ID
            String job = ""; //직업명

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
                    Log.d(TAG, "Job_ListHttpAsyncTask : " + jsonObject.toString());

                    job = jsonObject.getString("job");
                    jobdicSeq = jsonObject.getString("jobdicSeq");

                    job_code_name job_code_name = new job_code_name(jobdicSeq, job);
                    job_code_nameList.add(job_code_name);
                }

                Log.d(TAG, "job_code_nameList : " + job_code_nameList);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return result;
        }

    }
}
