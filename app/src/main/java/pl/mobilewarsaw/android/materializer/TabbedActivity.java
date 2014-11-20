package pl.mobilewarsaw.android.materializer;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import roboguice.activity.RoboActionBarActivity;
import roboguice.inject.InjectView;

/**
 * @author Mateusz Grzechociński <mateusz.grzechocinski@polidea.com>
 */
public class TabbedActivity extends RoboActionBarActivity {

    public static final int NUMBER_OF_TABS = 20;

    @InjectView(R.id.m_if_vp_tabs)
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_activity_tabbed);

        setupActionBar();

        viewPager.setAdapter(new MaterializerTabAdapter(getSupportFragmentManager(), NUMBER_OF_TABS));

        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                getSupportActionBar().setSelectedNavigationItem(position);
            }
        });
    }

    private void setupActionBar() {
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            }

            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
            }
        };

        for (int i = 0; i < NUMBER_OF_TABS; i++) {
            supportActionBar.addTab(supportActionBar.newTab().setText("Tab " + (i + 1)).setTabListener(tabListener));
        }
    }
}
