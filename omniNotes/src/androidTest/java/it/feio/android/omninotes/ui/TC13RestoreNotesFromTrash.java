package it.feio.android.omninotes.ui;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withParentIndex;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import org.junit.Test;

import it.feio.android.omninotes.R;

public class TC13RestoreNotesFromTrash extends BaseEspressoTest{
    @Test
    public void restoreNotesFromTrash() {
        createNoteByUI("TestTitle1", "TestContent1");
        createNoteByUI("TestTitle2", "TestContent2");
        onView(withText("TestTitle1")).perform(longClick());
        onView(withText("TestTitle2")).perform(click());
        onView(allOf(
                withContentDescription("More options"),
                allOf(
                        withParent(allOf(
                                withParent(withId(R.id.action_mode_bar)),
                                withParentIndex(2))
                        ), withParentIndex(2)),
                isDisplayed())
        ).perform(click());
        onView(withText("Trash")).perform(click());
//        onView(withText(R.string.note_trashed)).perform(click());
        onView(allOf(
                withContentDescription("drawer open"),
                allOf(
                        withParent(withId(R.id.toolbar)),
                        withParentIndex(0)
                ),
                isDisplayed())
        ).perform(click());
        onView(withText("Trash")).perform(click());

        onView(withText("TestTitle1")).perform(longClick());
        onView(withText("TestTitle2")).perform(click());
        onView(allOf(
                withContentDescription("Restore from trash"),
                allOf(
                        withParent(allOf(
                                withParent(withId(R.id.action_mode_bar)),
                                withParentIndex(2))
                        ), withParentIndex(1)),
                isDisplayed())
        ).perform(click());
        onView(withText(R.string.note_untrashed)).perform(click());
        onView(allOf(
                withContentDescription("drawer open"),
                allOf(
                        withParent(withId(R.id.toolbar)),
                        withParentIndex(0)
                ),
                isDisplayed())
        ).perform(click());
        onView(withText("Notes")).perform(click());

        onView(withText("TestTitle1")).check(matches(withText("TestTitle1")));
        onView(withText("TestTitle2")).check(matches(withText("TestTitle2")));
    }
}
