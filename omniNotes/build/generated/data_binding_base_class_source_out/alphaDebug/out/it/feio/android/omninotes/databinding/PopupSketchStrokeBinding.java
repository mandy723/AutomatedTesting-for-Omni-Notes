// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.OpacityBar;
import com.larswerkman.holocolorpicker.SVBar;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PopupSketchStrokeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final OpacityBar opacitybar;

  @NonNull
  public final ImageView strokeCircle;

  @NonNull
  public final ColorPicker strokeColorPicker;

  @NonNull
  public final SeekBar strokeSeekbar;

  @NonNull
  public final SVBar svbar;

  private PopupSketchStrokeBinding(@NonNull LinearLayout rootView, @NonNull OpacityBar opacitybar,
      @NonNull ImageView strokeCircle, @NonNull ColorPicker strokeColorPicker,
      @NonNull SeekBar strokeSeekbar, @NonNull SVBar svbar) {
    this.rootView = rootView;
    this.opacitybar = opacitybar;
    this.strokeCircle = strokeCircle;
    this.strokeColorPicker = strokeColorPicker;
    this.strokeSeekbar = strokeSeekbar;
    this.svbar = svbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PopupSketchStrokeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PopupSketchStrokeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.popup_sketch_stroke, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PopupSketchStrokeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.opacitybar;
      OpacityBar opacitybar = ViewBindings.findChildViewById(rootView, id);
      if (opacitybar == null) {
        break missingId;
      }

      id = R.id.stroke_circle;
      ImageView strokeCircle = ViewBindings.findChildViewById(rootView, id);
      if (strokeCircle == null) {
        break missingId;
      }

      id = R.id.stroke_color_picker;
      ColorPicker strokeColorPicker = ViewBindings.findChildViewById(rootView, id);
      if (strokeColorPicker == null) {
        break missingId;
      }

      id = R.id.stroke_seekbar;
      SeekBar strokeSeekbar = ViewBindings.findChildViewById(rootView, id);
      if (strokeSeekbar == null) {
        break missingId;
      }

      id = R.id.svbar;
      SVBar svbar = ViewBindings.findChildViewById(rootView, id);
      if (svbar == null) {
        break missingId;
      }

      return new PopupSketchStrokeBinding((LinearLayout) rootView, opacitybar, strokeCircle,
          strokeColorPicker, strokeSeekbar, svbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
