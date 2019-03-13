package com.example.kim.career;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kim.career.job.job_code_name;
import com.example.kim.career.job.job_detail;
import com.example.kim.career.job.job_detail_fragment;
import com.example.kim.career.job.job_fragment;
import com.example.kim.career.job.job_major_name_code;
import com.example.kim.career.major.major_fragment;
import com.example.kim.career.school.school_fragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    home_fragment home_fragment;
    job_fragment job_fragment;
    school_fragment school_fragment;
    major_fragment major_fragment;
    job_detail_fragment job_detail_fragment;

    Bundle bundle = new Bundle();

    TextView text_main;
    EditText editText;
    ImageButton search;

    static String returnResult = "";
    static String MAJOR_NM_get = "";
    static String MAJOR_SEQ_get = "";


    static List<job_code_name> job_code_nameList = new ArrayList<>();
    static List<job_detail> job_detailList = new ArrayList<>();
    static List<job_major_name_code> job_major_name_codeList = new ArrayList<>();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, home_fragment).commit();
                    text_main.setText("커리어넷");
                    return true;
                case R.id.navigation_job:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, job_fragment).commit();
                    text_main.setText("직업");
                    return true;
                case R.id.navigation_school:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, school_fragment).commit();
                    text_main.setText("학교");
                    return true;
                case R.id.navigation_major:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, major_fragment).commit();
                    text_main.setText("학과");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_fragment = new home_fragment();
        job_fragment = new job_fragment();
        school_fragment = new school_fragment();
        major_fragment = new major_fragment();
        job_detail_fragment = new job_detail_fragment();

        text_main = findViewById(R.id.text_main);

        search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Job_detailHttpAsyncTask().execute("https://www.career.go.kr/cnet/openapi/getOpenApi?apiKey=fe73b564918fc7eff9c5bbadd4e9391f&svcType=api&svcCode=JOB_VIEW&contentType=json&gubun=job_dic_list&jobdicSeq=450");
                getSupportFragmentManager().beginTransaction().replace(R.id.container, job_detail_fragment).commit();
            }
        });


        getSupportFragmentManager().beginTransaction().add(R.id.container, home_fragment).commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        new MagazineHttpAsyncTask().execute();

    }

    /********************************직업_상세 부분********************************/
    private class Job_detailHttpAsyncTask extends AsyncTask<String, Void, String> {

        private final String TAG = MainActivity.class.getSimpleName();
        OkHttpClient client = new OkHttpClient();

        @Override
        protected String doInBackground(String... Params) {

            String result = null;
            String strUrl = Params[0];

            String summary;
            String similarJob;
            String aptitude;
            String ability;
            String job;
            String empway = "";
            String employment = "";
            String salery = "";
            String capacity = "";
            String MAJOR_NM = "";
            String MAJOR_SEQ = "";
            String possibility = "";



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
                    Log.d(TAG, "doInBackground : " + jsonObject.toString());

                    summary = jsonObject.getString("summary");
                    similarJob = jsonObject.getString("similarJob");
                    aptitude = jsonObject.getString("aptitude");
                    ability = jsonObject.getString("ability");
                    job = jsonObject.getString("job");

                    JSONArray stateofemp = jsonObject.getJSONArray("stateofemp");
                    if (stateofemp != null) {
                        JSONObject detail = stateofemp.getJSONObject(0);
                        JSONObject detail_2 = stateofemp.getJSONObject(1);
                        JSONObject detail_3 = stateofemp.getJSONObject(2);

                        empway = detail.getString("empway");
                        employment = detail_2.getString("employment");
                        salery = detail_3.getString("salery");

                    }

                    JSONArray capacity_major = jsonObject.getJSONArray("capacity_major");
                    if (capacity_major != null) {
                        JSONObject capacity_1 = capacity_major.getJSONObject(0);

                        capacity = capacity_1.getString("capacity");
                        Log.d(TAG, "capacity : " + capacity);

                        JSONObject capacity_2 = capacity_major.getJSONObject(1);

                        JSONArray capacity_major_major = capacity_2.getJSONArray("major");
                        if (capacity_major_major != null) {
                            for (int m = 0; m < capacity_major_major.length(); m++) {
                                JSONObject jsonObject_major = capacity_major_major.getJSONObject(m);

                                 MAJOR_NM = jsonObject_major.getString("MAJOR_NM");
                                 MAJOR_SEQ = jsonObject_major.getString("MAJOR_SEQ");

                                MAJOR_NM_get += MAJOR_NM + "\n";
                                MAJOR_SEQ_get += MAJOR_SEQ + "\n";

                                Log.d(TAG, "capacity_major_major : " + MAJOR_NM_get);

                            }
                        }
                    }

                    JSONArray job_possibility = jsonObject.getJSONArray("job_possibility");
                    Log.d(TAG, "possibility_get : " + job_possibility);
                    if (job_possibility != null) {
                        JSONObject possibility_get = job_possibility.getJSONObject(0);
                        possibility = possibility_get.getString("possibility");
                        Log.d(TAG, "possibility_gell : " + possibility);
                    }

                    job_major_name_code job_major_name_code = new job_major_name_code(MAJOR_NM_get, MAJOR_SEQ_get);
                    job_detail job_detail = new job_detail(summary, similarJob, aptitude, ability, job, empway, employment, salery, capacity, possibility);
                    job_major_name_codeList.add(job_major_name_code);
                    job_detailList.add(job_detail);

                }


                Log.d(TAG, "job_major_name_codeList : " + job_major_name_codeList.toString());
                Log.d(TAG, "job_detailList : " + job_detailList.toString());

            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            bundle.putString("MAJOR_NM_get", MAJOR_NM_get);
            job_detail_fragment.setArguments(bundle);
            Log.d(TAG, "bundle11 : " + bundle.toString());
        }

    }

    /********************************커리어넷 잡지********************************/
    private class MagazineHttpAsyncTask extends AsyncTask<String, Void, String> {
        private final String TAG = MainActivity.class.getSimpleName();

        @Override
        protected String doInBackground(String... search) {
            String url = "https://www.career.go.kr/cnet/common/service/dreamLetter.rss";
            XmlPullParserFactory factory;
            XmlPullParser parser;
            URL xmlUrl;

            try {
                boolean title = false;
                boolean pubDate = false;
                boolean author = false;
                boolean link = false;

                xmlUrl = new URL(url);
                xmlUrl.openConnection().getInputStream();
                factory = XmlPullParserFactory.newInstance();
                parser = factory.newPullParser();
                parser.setInput(xmlUrl.openStream(), "utf-8");
                int eventType = parser.getEventType();
                while (eventType != XmlPullParser.END_DOCUMENT) {
                    switch (eventType) {
                        case XmlPullParser.START_DOCUMENT:
                            break;
                        case XmlPullParser.END_DOCUMENT:
                            break;
                        case XmlPullParser.START_TAG:
                            if (parser.getName().equals("title")) {
                                title = true;
                            }
                            if (parser.getName().equals("pubDate")) {
                                pubDate = true;
                            }
                            if (parser.getName().equals("author")) {
                                author = true;
                            }
                            if (parser.getName().equals("link")) {
                                link = true;
                            }
                            break;
                        case XmlPullParser.END_TAG:
                            break;
                        case XmlPullParser.TEXT:
                            if (title == true) {
                                returnResult += parser.getText() + "\n";
                                title = false;
                            }
                            if (pubDate == true) {
                                returnResult += parser.getText() + "\n";
                                pubDate = false;
                            }
                            if (author == true) {
                                returnResult += parser.getText() + "\n";
                                author = false;
                            }
                            if (link == true) {
                                returnResult += parser.getText() + "\n";
                                link = false;
                            }
                            break;
                    }
                    eventType = parser.next();
                }
                Log.d(TAG, "doInBackground : " + returnResult);
            } catch (Exception e) {

            }

            return returnResult;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if (s != null) {
                final String date[] = s.split("\n");
                Log.d(TAG, "doInBackground : " + date[0]);
                Bundle bundle = new Bundle();
                bundle.putString("returnResult", returnResult);
                home_fragment.setArguments(bundle);
                Toast.makeText(getApplication(), "값이 들어왔다.", LENGTH_SHORT).show();
            }
        }
    }
}