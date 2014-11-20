package pl.mobilewarsaw.android.materializer;

import android.support.v7.app.ActionBarActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;
import com.robotium.solo.Solo;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testChangeTitleOnMenuItemClick() throws Throwable {
        solo.unlockScreen();
        solo.clickOnActionBarHomeButton();

        ListView listView = (ListView) solo.getView(R.id.m_id_lv_menu);
        solo.clickOnView(listView.getChildAt(0));

        CharSequence title = ((ActionBarActivity) solo.getCurrentActivity()).getSupportActionBar().getTitle();

        assertEquals("Section 1",title);
    }
}
