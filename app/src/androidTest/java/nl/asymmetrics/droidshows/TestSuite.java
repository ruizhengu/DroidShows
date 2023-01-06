package nl.asymmetrics.droidshows;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestSuite {

    @Rule
    public ActivityScenarioRule<DroidShows> activityScenarioRule = new ActivityScenarioRule<>(DroidShows.class);


    /**
     * The application can help you manage TV shows and keep track of the episodes that you have or have not seen.
     * You can also add the air dates of episodes in the calendar.
     *
     * Before the development:
     * Please make sure the emulator is connected to the Internet.
     * Please login your Google account on the emulator to make sure you can access the Calendar app.
     */

    @Test
    public void addShow() {
        /*
        Description: Add the show "Yellowstone" then delete the show.

        Assertion: None.
        */
    }

    @Test
    public void markEpisodeWatched() {
        /*
        Description: Add the show "Yellowstone", and mark the 1st episode of the 1st season as watched.
                     Delete the added show at last.

        Assertion: Assert the watched date as today's date.
        */
    }

    @Test
    public void addAiredDateToCalendar() {
        /*
        Description: Add the show "Yellowstone", and add the air date of the 7th episode of the 5th season to the Calendar.
                     Delete the Calendar event. Return to DroidShows and delete the added show.

        Assertion: Assert the date of the Calendar event as the air date of the episode in DroidShows.
        */
    }
}
