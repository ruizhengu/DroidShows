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

    /** Before the development:
     *  Please make sure the emulator is connected to the Internet.
     * */

    @Test
    public void addShow() {

    }
}
