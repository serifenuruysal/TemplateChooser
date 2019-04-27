package com.soulkitchen.templatechooser.presenter;

import com.soulkitchen.templatechooser.view.FragmentView;
import com.soulkitchen.templatechooser.data.Repository;
import com.soulkitchen.templatechooser.model.JimdoResponse;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class FragmentPresenter implements Presenter {

  FragmentView view;
  String url;

  public FragmentPresenter(FragmentView view, String url) {
    this.view = view;
    this.url = url;
  }

  @Override
  public void loadData() {
    Repository repository = new Repository();
    repository
        .getUrlResponse(url)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new SingleObserver<JimdoResponse>() {
          @Override
          public void onSubscribe(Disposable d) {

          }

          @Override
          public void onSuccess(JimdoResponse jimdoResponse) {
            view.showData(jimdoResponse);
          }

          @Override
          public void onError(Throwable e) {

          }
        });

  }
}
