package com.soulkitchen.templatechooser.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.soulkitchen.templatechooser.R;
import com.soulkitchen.templatechooser.model.JimdoResponse;
import com.soulkitchen.templatechooser.presenter.FragmentPresenter;

public class ScreenSlidePageFragment extends Fragment implements FragmentView, OnClickListener {

  public static final String URL = "URL";
  private ImageView myImageView;
  private TextView tvName;
  private Button btnSelect;

  public ScreenSlidePageFragment() {

  }

  public static ScreenSlidePageFragment newInstance(String url) {
    ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
    Bundle bundle = new Bundle();
    bundle.putString(URL, url);
    fragment.setArguments(bundle);
    return fragment;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    ViewGroup rootView = (ViewGroup) inflater.inflate(
        R.layout.fragment_screen_slide_page, container, false);
    myImageView = rootView.findViewById(R.id.image_item);
    tvName = rootView.findViewById(R.id.textView);
    btnSelect = rootView.findViewById(R.id.btnSelect);
    btnSelect.setOnClickListener(this);
    return rootView;
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    new FragmentPresenter(this, getArguments().getString(URL)).loadData();
  }

  @Override
  public void showData(JimdoResponse jimdoResponse) {
    tvName.setText(jimdoResponse.getName());
    Glide
        .with(getContext())
        .load(jimdoResponse.getScreenshots().getIphone())
        .centerCrop()
        .into(myImageView);
  }

  @Override
  public void clickSelectedButton() {
    Toast.makeText(getContext(), tvName.getText().toString() + " Selected.", Toast.LENGTH_LONG)
        .show();

  }

  @Override
  public void onClick(View v) {
    if (v.getId() == R.id.btnSelect) {
      clickSelectedButton();
    }
  }
}