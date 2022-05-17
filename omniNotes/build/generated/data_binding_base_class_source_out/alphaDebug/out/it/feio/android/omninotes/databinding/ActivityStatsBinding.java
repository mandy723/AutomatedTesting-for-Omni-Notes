// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStatsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView statAttachments;

  @NonNull
  public final TextView statAttachmentsAudiorecordings;

  @NonNull
  public final TextView statAttachmentsFiles;

  @NonNull
  public final TextView statAttachmentsImages;

  @NonNull
  public final TextView statAttachmentsSketches;

  @NonNull
  public final TextView statAttachmentsVideos;

  @NonNull
  public final TextView statCategories;

  @NonNull
  public final TextView statChars;

  @NonNull
  public final TextView statCharsAvg;

  @NonNull
  public final TextView statCharsMax;

  @NonNull
  public final TextView statChecklists;

  @NonNull
  public final TextView statLocations;

  @NonNull
  public final TextView statMasked;

  @NonNull
  public final TextView statNotesActive;

  @NonNull
  public final TextView statNotesArchived;

  @NonNull
  public final TextView statNotesTotal;

  @NonNull
  public final TextView statNotesTrashed;

  @NonNull
  public final TextView statReminders;

  @NonNull
  public final TextView statRemindersFutures;

  @NonNull
  public final TextView statTags;

  @NonNull
  public final TextView statWords;

  @NonNull
  public final TextView statWordsAvg;

  @NonNull
  public final TextView statWordsMax;

  private ActivityStatsBinding(@NonNull ScrollView rootView, @NonNull TextView statAttachments,
      @NonNull TextView statAttachmentsAudiorecordings, @NonNull TextView statAttachmentsFiles,
      @NonNull TextView statAttachmentsImages, @NonNull TextView statAttachmentsSketches,
      @NonNull TextView statAttachmentsVideos, @NonNull TextView statCategories,
      @NonNull TextView statChars, @NonNull TextView statCharsAvg, @NonNull TextView statCharsMax,
      @NonNull TextView statChecklists, @NonNull TextView statLocations,
      @NonNull TextView statMasked, @NonNull TextView statNotesActive,
      @NonNull TextView statNotesArchived, @NonNull TextView statNotesTotal,
      @NonNull TextView statNotesTrashed, @NonNull TextView statReminders,
      @NonNull TextView statRemindersFutures, @NonNull TextView statTags,
      @NonNull TextView statWords, @NonNull TextView statWordsAvg, @NonNull TextView statWordsMax) {
    this.rootView = rootView;
    this.statAttachments = statAttachments;
    this.statAttachmentsAudiorecordings = statAttachmentsAudiorecordings;
    this.statAttachmentsFiles = statAttachmentsFiles;
    this.statAttachmentsImages = statAttachmentsImages;
    this.statAttachmentsSketches = statAttachmentsSketches;
    this.statAttachmentsVideos = statAttachmentsVideos;
    this.statCategories = statCategories;
    this.statChars = statChars;
    this.statCharsAvg = statCharsAvg;
    this.statCharsMax = statCharsMax;
    this.statChecklists = statChecklists;
    this.statLocations = statLocations;
    this.statMasked = statMasked;
    this.statNotesActive = statNotesActive;
    this.statNotesArchived = statNotesArchived;
    this.statNotesTotal = statNotesTotal;
    this.statNotesTrashed = statNotesTrashed;
    this.statReminders = statReminders;
    this.statRemindersFutures = statRemindersFutures;
    this.statTags = statTags;
    this.statWords = statWords;
    this.statWordsAvg = statWordsAvg;
    this.statWordsMax = statWordsMax;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStatsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStatsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_stats, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStatsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.stat_attachments;
      TextView statAttachments = ViewBindings.findChildViewById(rootView, id);
      if (statAttachments == null) {
        break missingId;
      }

      id = R.id.stat_attachments_audiorecordings;
      TextView statAttachmentsAudiorecordings = ViewBindings.findChildViewById(rootView, id);
      if (statAttachmentsAudiorecordings == null) {
        break missingId;
      }

      id = R.id.stat_attachments_files;
      TextView statAttachmentsFiles = ViewBindings.findChildViewById(rootView, id);
      if (statAttachmentsFiles == null) {
        break missingId;
      }

      id = R.id.stat_attachments_images;
      TextView statAttachmentsImages = ViewBindings.findChildViewById(rootView, id);
      if (statAttachmentsImages == null) {
        break missingId;
      }

      id = R.id.stat_attachments_sketches;
      TextView statAttachmentsSketches = ViewBindings.findChildViewById(rootView, id);
      if (statAttachmentsSketches == null) {
        break missingId;
      }

      id = R.id.stat_attachments_videos;
      TextView statAttachmentsVideos = ViewBindings.findChildViewById(rootView, id);
      if (statAttachmentsVideos == null) {
        break missingId;
      }

      id = R.id.stat_categories;
      TextView statCategories = ViewBindings.findChildViewById(rootView, id);
      if (statCategories == null) {
        break missingId;
      }

      id = R.id.stat_chars;
      TextView statChars = ViewBindings.findChildViewById(rootView, id);
      if (statChars == null) {
        break missingId;
      }

      id = R.id.stat_chars_avg;
      TextView statCharsAvg = ViewBindings.findChildViewById(rootView, id);
      if (statCharsAvg == null) {
        break missingId;
      }

      id = R.id.stat_chars_max;
      TextView statCharsMax = ViewBindings.findChildViewById(rootView, id);
      if (statCharsMax == null) {
        break missingId;
      }

      id = R.id.stat_checklists;
      TextView statChecklists = ViewBindings.findChildViewById(rootView, id);
      if (statChecklists == null) {
        break missingId;
      }

      id = R.id.stat_locations;
      TextView statLocations = ViewBindings.findChildViewById(rootView, id);
      if (statLocations == null) {
        break missingId;
      }

      id = R.id.stat_masked;
      TextView statMasked = ViewBindings.findChildViewById(rootView, id);
      if (statMasked == null) {
        break missingId;
      }

      id = R.id.stat_notes_active;
      TextView statNotesActive = ViewBindings.findChildViewById(rootView, id);
      if (statNotesActive == null) {
        break missingId;
      }

      id = R.id.stat_notes_archived;
      TextView statNotesArchived = ViewBindings.findChildViewById(rootView, id);
      if (statNotesArchived == null) {
        break missingId;
      }

      id = R.id.stat_notes_total;
      TextView statNotesTotal = ViewBindings.findChildViewById(rootView, id);
      if (statNotesTotal == null) {
        break missingId;
      }

      id = R.id.stat_notes_trashed;
      TextView statNotesTrashed = ViewBindings.findChildViewById(rootView, id);
      if (statNotesTrashed == null) {
        break missingId;
      }

      id = R.id.stat_reminders;
      TextView statReminders = ViewBindings.findChildViewById(rootView, id);
      if (statReminders == null) {
        break missingId;
      }

      id = R.id.stat_reminders_futures;
      TextView statRemindersFutures = ViewBindings.findChildViewById(rootView, id);
      if (statRemindersFutures == null) {
        break missingId;
      }

      id = R.id.stat_tags;
      TextView statTags = ViewBindings.findChildViewById(rootView, id);
      if (statTags == null) {
        break missingId;
      }

      id = R.id.stat_words;
      TextView statWords = ViewBindings.findChildViewById(rootView, id);
      if (statWords == null) {
        break missingId;
      }

      id = R.id.stat_words_avg;
      TextView statWordsAvg = ViewBindings.findChildViewById(rootView, id);
      if (statWordsAvg == null) {
        break missingId;
      }

      id = R.id.stat_words_max;
      TextView statWordsMax = ViewBindings.findChildViewById(rootView, id);
      if (statWordsMax == null) {
        break missingId;
      }

      return new ActivityStatsBinding((ScrollView) rootView, statAttachments,
          statAttachmentsAudiorecordings, statAttachmentsFiles, statAttachmentsImages,
          statAttachmentsSketches, statAttachmentsVideos, statCategories, statChars, statCharsAvg,
          statCharsMax, statChecklists, statLocations, statMasked, statNotesActive,
          statNotesArchived, statNotesTotal, statNotesTrashed, statReminders, statRemindersFutures,
          statTags, statWords, statWordsAvg, statWordsMax);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
