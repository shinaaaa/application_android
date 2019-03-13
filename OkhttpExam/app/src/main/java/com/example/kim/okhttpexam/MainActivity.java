package com.example.kim.okhttpexam;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // <uses-permission android:name="android.permission.INTERNET"></uses-permission> 하기
        //AsyncTask 첫번째 값에 들어갈 변수, excute() -> AsyncTask 실행하는 명령어
       new HttpAsyncTask().execute("http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastGrib?ServiceKey=qPaKtPFXuD0yHTVcEz2ld9WDwKR0PVHmMesO%2FQl2MGGtnAh1IWV8qJMQkHZmn04J0xmRn%2B2YqB6tmaboC8pXow%3D%3D&base_date=20181110&base_time=1300&nx=55&ny=127&pageNo=1&numOfRows=10&_type=json");
    }

    private static class HttpAsyncTask extends AsyncTask<String, Void, String> {    //AsyncTask 상속을 날씨 정보를 비동기로 가져옴 <주소값, 중간표시 값, 결과 값>

        private static final String TAG = MainActivity.class.getSimpleName();   //로그 TAG 값
        OkHttpClient client = new OkHttpClient();
        //네트워크 통신 하는 것 OkHttp3 사용, gradle 모듈에 implementation 'com.squareup.okhttp3:okhttp:3.11.0' 추가

        @Override
        protected String doInBackground(String... params) { // HttpAsyncTask 클래스 생성시 알트+엔터로 만들기
            List<Weather> weatherList = new ArrayList<>();  //w 값을 담아오는 리스트 생성
            String result = null; //doInBackground의 리턴값, onPostExecute(String s)의 인자로 사용됨
            String strUrl = params[0];  //doInBackground의 파라미터 값


            try {
                Request request = new Request.Builder() //Okhttp 요청 객체
                        .url(strUrl)
                        .build();
                Response response = client.newCall(request).execute();  //Okhttp 응답 객체

                //JSON 형태의 파싱 하기, JSONObject -> JSON에서 "{" 이하의 값 파싱, JSONArray -> "[" 이하의 값 파싱
                JSONObject object = new JSONObject(response.body().string());   //파싱 데이터를 object에 넣음
                JSONObject response_JSONObject = object.getJSONObject("response");  //object 이하 "{" 값 중 "response"를 읽어옴
                JSONObject body = response_JSONObject.getJSONObject("body");    //response 이하 "{" 값 중 "body"를 읽어옴
                JSONObject items = body.getJSONObject("items"); //body 이하 "{" 값 중 "items"를 읽어옴
                JSONArray item = items.getJSONArray("item");    //items 이하 "[" 값 중 "item"를 읽어옴

                for (int i = 0; i < item.length(); i++) {   //item 의 길이 만큼 실행
                    JSONObject jsonObject = item.getJSONObject(i); //item 의 순서
                    String baseDate = jsonObject.getString("baseDate"); //item 중 "baseDate" 값을 baseDate 에 저장
                    String baseTime = jsonObject.getString("baseTime"); //item 중 "baseTime" 값을 baseTime 에 저장
                    String category = jsonObject.getString("category"); //item 중 "category" 값을 category 에 저장
                    String nx = jsonObject.getString("nx"); //item 중 "nx" 값을 nx 에 저장
                    String ny = jsonObject.getString("ny"); //item 중 "ny" 값을 ny 에 저장
                    String obsrValue = jsonObject.getString("obsrValue"); //item 중 "obsrValue" 값을 obsrValue 에 저장
                    Weather w = new Weather(baseDate, baseTime, category, nx, ny, obsrValue);   // class Weather 의 파라미터를 가져옴
                    weatherList.add(w); //weatherList 배열에 저장
                }
                Log.d(TAG,"doInBackground : " + weatherList.toString());    //로그 값 찍기
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
            if (s != null) {
                Log.d(TAG, s);
            }
        }
    }
}
