package com.soulkitchen.templatechooser.domain;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by S.Nur Uysal on 07.04.2019.
 */
public class ApiClient {

  private static final String TAG = "ApiClient";
  private static final String BASE_URL = "https://api.dmp.jimdo-server.com/api/";
  private static final OkHttpClient client;
  private static ApiService mService;

  static {

    client = new OkHttpClient.Builder()
        .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .addNetworkInterceptor(new Interceptor() {
          @Override
          public Response intercept(Chain chain) throws IOException {
            Request.Builder requestBuilder = chain.request().newBuilder();
            requestBuilder.header("Accept", "application/json");
            return chain.proceed(requestBuilder.build());
          }
        })
        .build();

  }

  public static ApiService getInstance() {
    synchronized (new Object()) {
      if (mService == null) {
        mService = getRetrofitInstance().create(ApiService.class);
      }
      return mService;
    }
  }

  private static Retrofit getRetrofitInstance() {
    return new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(client)
        .build();
  }

  public static void setApi(ApiService mockRetrofitApiImpl) {
    mService=mockRetrofitApiImpl;
  }

  public ApiService getService() {
    return mService;
  }



}
