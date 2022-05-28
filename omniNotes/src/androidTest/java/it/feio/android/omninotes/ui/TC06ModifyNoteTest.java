package it.feio.android.omninotes.ui;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import it.feio.android.omninotes.OmniNotes;
import it.feio.android.omninotes.R;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class TC06ModifyNoteTest  extends BaseEspressoTest{
    @Test
    public void modifyNote() {
        createNoteByUI("TestTitle", "TestContent");
        onView(withText("TestTitle")).perform(click());
        onView(withText("TestContent")).perform(typeText("Modified"));

        navigateUp();
        onView(withText("TestTitle")).perform(click());
        onView(withId(R.id.detail_content)).check(matches(withText("TestContentModified")));
        onView(withId(R.id.detail_content)).check(matches(not(withText("TestContent"))));
    }
}
