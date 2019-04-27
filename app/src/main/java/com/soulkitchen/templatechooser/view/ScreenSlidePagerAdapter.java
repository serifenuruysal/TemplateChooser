package com.soulkitchen.templatechooser.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;

class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

  private ArrayList<String> urlList;

  public ScreenSlidePagerAdapter(FragmentManager fm, ArrayList<String> urlList) {
    super(fm);
    this.urlList = urlList;
  }

  @Override
  public Fragment getItem(int position) {
    return ScreenSlidePageFragment.newInstance(urlList.get(position));
  }

  @Override
  public int getCount() {
    return urlList.size();
  }
}
