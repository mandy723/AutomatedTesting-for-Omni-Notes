// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.neopixl.pixlui.components.textview.TextView;
import it.feio.android.omninotes.R;
import it.feio.android.omninotes.models.views.NonScrollableListView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNavigationDrawerBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final NonScrollableListView drawerNavList;

  @NonNull
  public final NonScrollableListView drawerTagList;

  @NonNull
  public final LinearLayout leftDrawer;

  @NonNull
  public final ImageView navdrawerImage;

  @NonNull
  public final TextView navdrawerTitle;

  @NonNull
  public final DrawerCategoryListFooterBinding settingsView;

  private FragmentNavigationDrawerBinding(@NonNull ScrollView rootView,
      @NonNull NonScrollableListView drawerNavList, @NonNull NonScrollableListView drawerTagList,
      @NonNull LinearLayout leftDrawer, @NonNull ImageView navdrawerImage,
      @NonNull TextView navdrawerTitle, @NonNull DrawerCategoryListFooterBinding settingsView) {
    this.rootView = rootView;
    this.drawerNavList = drawerNavList;
    this.drawerTagList = drawerTagList;
    this.leftDrawer = leftDrawer;
    this.navdrawerImage = navdrawerImage;
    this.navdrawerTitle = navdrawerTitle;
    this.settingsView = settingsView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_navigation_drawer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNavigationDrawerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.drawer_nav_list;
      NonScrollableListView drawerNavList = ViewBindings.findChildViewById(rootView, id);
      if (drawerNavList == null) {
        break missingId;
      }

      id = R.id.drawer_tag_list;
      NonScrollableListView drawerTagList = ViewBindings.findChildViewById(rootView, id);
      if (drawerTagList == null) {
        break missingId;
      }

      id = R.id.left_drawer;
      LinearLayout leftDrawer = ViewBindings.findChildViewById(rootView, id);
      if (leftDrawer == null) {
        break missingId;
      }

      id = R.id.navdrawer_image;
      ImageView navdrawerImage = ViewBindings.findChildViewById(rootView, id);
      if (navdrawerImage == null) {
        break missingId;
      }

      id = R.id.navdrawer_title;
      TextView navdrawerTitle = ViewBindings.findChildViewById(rootView, id);
      if (navdrawerTitle == null) {
        break missingId;
      }

      id = R.id.settings_view;
      View settingsView = ViewBindings.findChildViewById(rootView, id);
      if (settingsView == null) {
        break missingId;
      }
      DrawerCategoryListFooterBinding binding_settingsView = DrawerCategoryListFooterBinding.bind(settingsView);

      return new FragmentNavigationDrawerBinding((ScrollView) rootView, drawerNavList,
          drawerTagList, leftDrawer, navdrawerImage, navdrawerTitle, binding_settingsView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
