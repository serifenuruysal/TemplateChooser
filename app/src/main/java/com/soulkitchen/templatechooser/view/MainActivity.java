package com.soulkitchen.templatechooser.view;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.soulkitchen.templatechooser.presenter.MainPresenter;
import com.soulkitchen.templatechooser.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TemplateView {

  MainPresenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    presenter = new MainPresenter(this);
    presenter.loadData();
  }


  @Override
  public void showData(ArrayList<String> strings) {
    final ViewPager mPager = findViewById(R.id.viewpager);
    DotsIndicator dotsIndicator = (DotsIndicator) findViewById(R.id.dots_indicator);
    ScreenSlidePagerAdapter pagerAdapter =
        new ScreenSlidePagerAdapter(getSupportFragmentManager(), strings);
    mPager.setAdapter(pagerAdapter);
    dotsIndicator.setViewPager(mPager);
  }
}
