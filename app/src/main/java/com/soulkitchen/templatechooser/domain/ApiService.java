package com.soulkitchen.templatechooser.domain;

import com.soulkitchen.templatechooser.model.JimdoResponse;
import io.reactivex.Single;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;

/**
 * Created by S.Nur Uysal on 07.04.2019.
 */
public interface ApiService {

  @Headers({ "Accept: application/json"})
  @GET("published_designs")
  Single<ArrayList<String>> getTemplateDesigns();

  @Headers({ "Accept: application/json"})
  @GET
  public Single<JimdoResponse> getUrlResponse(@Url String url);

}
