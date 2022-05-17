// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.neopixl.pixlui.components.textview.TextView;
import it.feio.android.omninotes.R;
import it.feio.android.omninotes.models.views.SquareImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoteLayoutExpandedBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView alarmIcon;

  @NonNull
  public final ImageView archivedIcon;

  @NonNull
  public final SquareImageView attachmentThumbnail;

  @NonNull
  public final LinearLayout cardLayout;

  @NonNull
  public final View categoryMarker;

  @NonNull
  public final ImageView locationIcon;

  @NonNull
  public final ImageView lockedIcon;

  @NonNull
  public final TextView noteContent;

  @NonNull
  public final TextView noteDate;

  @NonNull
  public final TextView noteTitle;

  @NonNull
  public final FrameLayout root;

  private NoteLayoutExpandedBinding(@NonNull FrameLayout rootView, @NonNull ImageView alarmIcon,
      @NonNull ImageView archivedIcon, @NonNull SquareImageView attachmentThumbnail,
      @NonNull LinearLayout cardLayout, @NonNull View categoryMarker,
      @NonNull ImageView locationIcon, @NonNull ImageView lockedIcon, @NonNull TextView noteContent,
      @NonNull TextView noteDate, @NonNull TextView noteTitle, @NonNull FrameLayout root) {
    this.rootView = rootView;
    this.alarmIcon = alarmIcon;
    this.archivedIcon = archivedIcon;
    this.attachmentThumbnail = attachmentThumbnail;
    this.cardLayout = cardLayout;
    this.categoryMarker = categoryMarker;
    this.locationIcon = locationIcon;
    this.lockedIcon = lockedIcon;
    this.noteContent = noteContent;
    this.noteDate = noteDate;
    this.noteTitle = noteTitle;
    this.root = root;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NoteLayoutExpandedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoteLayoutExpandedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.note_layout_expanded, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoteLayoutExpandedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alarmIcon;
      ImageView alarmIcon = ViewBindings.findChildViewById(rootView, id);
      if (alarmIcon == null) {
        break missingId;
      }

      id = R.id.archivedIcon;
      ImageView archivedIcon = ViewBindings.findChildViewById(rootView, id);
      if (archivedIcon == null) {
        break missingId;
      }

      id = R.id.attachmentThumbnail;
      SquareImageView attachmentThumbnail = ViewBindings.findChildViewById(rootView, id);
      if (attachmentThumbnail == null) {
        break missingId;
      }

      id = R.id.card_layout;
      LinearLayout cardLayout = ViewBindings.findChildViewById(rootView, id);
      if (cardLayout == null) {
        break missingId;
      }

      id = R.id.category_marker;
      View categoryMarker = ViewBindings.findChildViewById(rootView, id);
      if (categoryMarker == null) {
        break missingId;
      }

      id = R.id.locationIcon;
      ImageView locationIcon = ViewBindings.findChildViewById(rootView, id);
      if (locationIcon == null) {
        break missingId;
      }

      id = R.id.lockedIcon;
      ImageView lockedIcon = ViewBindings.findChildViewById(rootView, id);
      if (lockedIcon == null) {
        break missingId;
      }

      id = R.id.note_content;
      TextView noteContent = ViewBindings.findChildViewById(rootView, id);
      if (noteContent == null) {
        break missingId;
      }

      id = R.id.note_date;
      TextView noteDate = ViewBindings.findChildViewById(rootView, id);
      if (noteDate == null) {
        break missingId;
      }

      id = R.id.note_title;
      TextView noteTitle = ViewBindings.findChildViewById(rootView, id);
      if (noteTitle == null) {
        break missingId;
      }

      FrameLayout root = (FrameLayout) rootView;

      return new NoteLayoutExpandedBinding((FrameLayout) rootView, alarmIcon, archivedIcon,
          attachmentThumbnail, cardLayout, categoryMarker, locationIcon, lockedIcon, noteContent,
          noteDate, noteTitle, root);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
