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
     * Before the development:
     * Please make sure the emulator is connected to the Internet.
     * Please login your Google account on the emulator to make sure you can access the Calendar app.
     */

    @Test
    public void addShow() {
        // 1. Click the "ADD SHOW" button on the home page.
        // 2. Enter "Yellowstone" in the "Show to add..." field and press enter key.
        // 3. Click "Yellowstone (2018) (en)".
        // 4. Click the "ADD SHOW" button in the dialog.
        // 5. Use "press back" to return to the home page.
        // 6. Assert the added show's name to "Yellowstone (2018)".
        // 7. Click the "⋮" button of the added show.
        // 8. Click "Delete" in the popup menu.
        // 9. Click the "OK" button in the dialog.
    }

    @Test
    public void markEpisodeWatched() {
        // 1. Click the "ADD SHOW" button on the home page.
        // 2. Enter "Yellowstone" in the "Show to add..." field and press enter key.
        // 3. Click "Yellowstone (2018) (en)".
        // 4. Click the "ADD SHOW" button in the dialog.
        // 5. Use "press back" to return to the home page.
        // 6. Click the added show on the home page.
        // 7. Click "Season 1".
        // 8. Click the checkbox of "Ep. 1. Daybreak".
        // 9. Assert the watched date next to the checkbox to today's date.
        // 10. Use "press back" to return to the Seasons page of the show.
        // 11. Use "press back" to return to the home page.
        // 12. Click the "⋮" button of the added show.
        // 13. Click "Delete" in the popup menu.
        // 14. Click the "OK" button in the dialog.
    }

    @Test
    public void addAiredDateToCalendar() {
        // 1. Click the "ADD SHOW" button on the home page.
        // 2. Enter "Yellowstone" in the "Show to add..." field and press enter key.
        // 3. Click "Yellowstone (2018) (en)".
        // 4. Click the "ADD SHOW" button in the dialog.
        // 5. Use "press back" to return to the home page.
        // 6. Click the added show on the home page.
        // 7. Click "Season 5".
        // 8. Click "Ep. 6. Cigarettes, Whiskey, a Meadow and Fog".
        // 9. Click the aired date "Dec 11, 2022".
        // 10. Assert the name of the Calendar event to "Yellowstone (2018) 5x06".
        // 11. Assert the start date of the Calendar event to "Sun, Dec 11, 2022".
        // 12. Click the "SAVE" icon on the top right corner of the Calendar event.
        // 13. Click the Calendar event "Yellowstone (2018) 5x06".
        // 14. Click the "⋮" button in the top right corner of the Calendar event.
        // 15. Click "Delete" in the popup menu.
        // 16. Click "DELETE" in the dialog.
        // 17. Launch the "DroidShows" app.
        // 18. Use "press back" to return to the Episodes page of Season 5.
        // 19. Use "press back" to return to the Seasons page of the show.
        // 20. Use "press back" to return to the home page.
        // 21. Click the "⋮" button of the added show.
        // 22. Click "Delete" in the popup menu.
        // 23. Click the "OK" button in the dialog.
    }
}
