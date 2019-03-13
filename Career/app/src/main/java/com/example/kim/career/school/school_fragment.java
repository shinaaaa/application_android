package com.example.kim.career.school;

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

public class school_fragment extends Fragment {

    static List<school_list> school_listList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.school_main_view, container, false);

        CardView school_list_1 = rootView.findViewById(R.id.school_list_1);
        CardView school_list_2 = rootView.findViewById(R.id.school_list_2);
        CardView school_list_3 = rootView.findViewById(R.id.school_list_3);
        CardView school_list_4 = rootView.findViewById(R.id.school_list_4);
        CardView school_list_5 = rootView.findViewById(R.id.school_list_5);
        CardView school_list_6 = rootView.findViewById(R.id.school_list_6);
        CardView school_list_7 = rootView.findViewById(R.id.school_list_7);
        CardView school_list_8 = rootView.findViewById(R.id.school_list_8);
        CardView school_list_9 = rootView.findViewById(R.id.school_list_9);
        CardView school_list_10 = rootView.findViewById(R.id.school_list_10);
        CardView school_list_11 = rootView.findViewById(R.id.school_list_11);
        CardView school_list_12 = rootView.findViewById(R.id.school_list_12);
        CardView school_list_13 = rootView.findViewById(R.id.school_list_13);
        CardView school_list_14 = rootView.findViewById(R.id.school_list_14);
        CardView school_list_15 = rootView.findViewById(R.id.school_list_15);
        CardView school_list_16 = rootView.findViewById(R.id.school_list_16);
        CardView school_list_17 = rootView.findViewById(R.id.school_list_17);

        school_list_1.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100260");
            }
        });
        school_list_2.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100276");
            }
        });
        school_list_3.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100269");
            }
        });
        school_list_4.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100267");
            }
        });
        school_list_5.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100272");
            }
        });
        school_list_6.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100275");
            }
        });
        school_list_7.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100271");
            }
        });
        school_list_8.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100273");
            }
        });
        school_list_9.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100704");
            }
        });
        school_list_10.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100278");
            }
        });
        school_list_11.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100280");
            }
        });
        school_list_12.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100281");
            }
        });
        school_list_13.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100285");
            }
        });
        school_list_14.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100291");
            }
        });
        school_list_15.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100282");
            }
        });
        school_list_16.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100283");
            }
        });
        school_list_17.setOnClickListener(new CardView.OnClickListener() {
            @Override
            public void onClick(View v) {
                school_listList.clear();
                new school_fragment.School_ListHttpAsyncTask().execute("http://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=SCHOOL&contentType=json&gubun=univ_list&region=100292");
            }
        });


        return  rootView;
    }

    /********************************학교_리스트 부분********************************/
    private class School_ListHttpAsyncTask extends AsyncTask<String, Void, String> {

        private final String TAG = MainActivity.class.getSimpleName();
        OkHttpClient client = new OkHttpClient();

        @Override
        protected String doInBackground(String... Params) {

            String result = null;
            String strUrl = Params[0];

            String campusName;  //캠퍼스 명
            String schoolGubun;  //학교 종류
            String adres;   //주소
            String schoolName;  //학교 명
            String estType; //설립유형
            String link;    //링크

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

                    campusName = jsonObject.getString("campusName");
                    schoolGubun = jsonObject.getString("schoolGubun");
                    adres = jsonObject.getString("adres");
                    schoolName = jsonObject.getString("schoolName");
                    estType = jsonObject.getString("estType");
                    link = jsonObject.getString("link");

                    school_list school_list = new school_list(campusName, schoolGubun, adres, schoolName, estType, link);
                    school_listList.add(school_list);
                }

                Log.d(TAG, "school_list : " + school_listList);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return result;
        }

    }

}
