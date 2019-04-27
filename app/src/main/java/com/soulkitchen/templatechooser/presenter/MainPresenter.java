package com.soulkitchen.templatechooser.presenter;

import com.soulkitchen.templatechooser.view.TemplateView;
import com.soulkitchen.templatechooser.data.Repository;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;

public class MainPresenter implements Presenter {

  TemplateView view;

  public MainPresenter(TemplateView view) {
    this.view = view;
  }

  @Override
  public void loadData() {
    Repository repository = new Repository();
    repository.getTemplateDesigns().subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(
            new SingleObserver<ArrayList<String>>() {
              @Override
              public void onSubscribe(Disposable d) {

              }

              @Override
              public void onSuccess(ArrayList<String> strings) {
               view.showData(strings);

              }

              @Override
              public void onError(Throwable e) {

              }
            });

  }
}
