//package com.soulkitchen.templatechooser;
//
//import com.soulkitchen.templatechooser.View.MainActivity;
//import com.soulkitchen.templatechooser.domain.ApiClient;
//import com.soulkitchen.templatechooser.domain.ApiService;
//import io.reactivex.Single;
//import java.util.ArrayList;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.ArgumentCaptor;
//import org.mockito.Captor;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.robolectric.Robolectric;
//import org.robolectric.RobolectricGradleTestRunner;
//import org.robolectric.annotation.Config;
//import org.robolectric.util.ActivityController;
//
//@Config(constants = BuildConfig.class, sdk = 21,
//    manifest = "app/manifests/AndroidManifest.xml")
//@RunWith(RobolectricGradleTestRunner.class)
//public class RetrofitCallTest {
//
//  private MainActivity mainActivity;
//
////  @Rule
////  public ActivityTestRule<MainActivity> mActivityRule =
////      new ActivityTestRule<>(MainActivity.class, true, false);
//
//  @Mock
//  private ApiService mockRetrofitApiImpl;
//
//  @Captor
//  private ArgumentCaptor<Single<ArrayList<String>>> callbackArgumentCaptor;
//
//  @Before
//  public void setUp() {
//    MockitoAnnotations.initMocks(this);
//
//    ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class);
//    mainActivity = controller.get();
//    ApiClient.setApi(mockRetrofitApiImpl);
//    controller.create();
//  }
//
//  @Test
//  public void shouldFillAdapter() throws Exception {
//    Mockito.verify(mockRetrofitApiImpl)
//        .getTemplateDesigns();
//
////    int objectsQuantity = 10;
////    List<YourObject> list = new ArrayList<YourObject>();
////    for(int i = 0; i < objectsQuantity; ++i) {
////      list.add(new YourObject());
////    }
////
////    callbackArgumentCaptor.getValue().success(list, null);
////
////    S yourAdapter = mainActivity.getAdapter(); // Obtain adapter
////    // Simple test check if adapter has as many items as put into response
////    assertThat(yourAdapter.getItemCount(), equalTo(objectsQuantity));
//  }
//}
