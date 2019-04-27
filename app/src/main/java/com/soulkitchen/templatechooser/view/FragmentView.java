package com.soulkitchen.templatechooser.view;

import com.soulkitchen.templatechooser.model.JimdoResponse;

public interface FragmentView {

  void showData(JimdoResponse jimdoResponse);

  void clickSelectedButton();
}
