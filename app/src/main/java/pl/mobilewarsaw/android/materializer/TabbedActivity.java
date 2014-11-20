package pl.mobilewarsaw.android.materializer;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

/**
 * @author Mateusz Grzechociński <mateusz.grzechocinski@polidea.com>
 */
public class TabbedActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            }

            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            }

            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
            }
        };

        for (int i = 0; i < 3; i++) {
            supportActionBar.addTab(supportActionBar.newTab().setText("Tab " + (i + 1)).setTabListener(tabListener));
        }

    }
}
