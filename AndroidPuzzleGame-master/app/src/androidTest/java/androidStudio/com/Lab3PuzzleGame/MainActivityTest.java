package androidStudio.com.Lab3PuzzleGame;

import static org.junit.Assert.*;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import androidStudio.com.Lab3PuzzleGame.MainActivity.MainActivity;

public class MainActivityTest {

    public ActivityTestRule<MainActivity> mtimeActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private  MainActivity mpuzzleTime = null;

    @Before
    public void setUp() throws Exception {

        mpuzzleTime = mtimeActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = mpuzzleTime.findViewById(R.id.);

        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {

        mpuzzleTime = null;
    }
}