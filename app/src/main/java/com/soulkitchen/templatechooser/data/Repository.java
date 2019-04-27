package com.soulkitchen.templatechooser.data;

import com.soulkitchen.templatechooser.domain.ApiClient;
import com.soulkitchen.templatechooser.domain.ApiService;
import com.soulkitchen.templatechooser.model.JimdoResponse;
import io.reactivex.Single;
import java.util.ArrayList;

public class Repository implements ApiService {

  @Override
  public Single<ArrayList<String>> getTemplateDesigns() {
    return ApiClient.getInstance().getTemplateDesigns();
  }

  @Override
  public Single<JimdoResponse> getUrlResponse(String url) {
    return ApiClient.getInstance().getUrlResponse(url);
  }
}
