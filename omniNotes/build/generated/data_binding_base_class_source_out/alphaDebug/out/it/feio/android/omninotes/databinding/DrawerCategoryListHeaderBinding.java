// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.neopixl.pixlui.components.textview.TextView;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DrawerCategoryListHeaderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout layoutRoot;

  @NonNull
  public final TextView tag;

  private DrawerCategoryListHeaderBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout layoutRoot, @NonNull TextView tag) {
    this.rootView = rootView;
    this.layoutRoot = layoutRoot;
    this.tag = tag;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DrawerCategoryListHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DrawerCategoryListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.drawer_category_list_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DrawerCategoryListHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout layoutRoot = (LinearLayout) rootView;

      id = R.id.tag;
      TextView tag = ViewBindings.findChildViewById(rootView, id);
      if (tag == null) {
        break missingId;
      }

      return new DrawerCategoryListHeaderBinding((LinearLayout) rootView, layoutRoot, tag);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
