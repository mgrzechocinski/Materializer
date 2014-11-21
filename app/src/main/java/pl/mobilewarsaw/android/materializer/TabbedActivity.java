package pl.mobilewarsaw.android.materializer;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import pl.mobilewarsaw.android.materializer.tabs.SlidingTabLayout;
import roboguice.activity.RoboActionBarActivity;
import roboguice.inject.InjectView;

/**
 * @author Mateusz Grzechociński <mateusz.grzechocinski@polidea.com>
 */
public class TabbedActivity extends RoboActionBarActivity {

    public static final int NUMBER_OF_TABS = 20;

    @InjectView(R.id.m_if_vp_tabs)
    private ViewPager viewPager;

    @InjectView(R.id.m_id_toolbar)
    private Toolbar toolbar;

    @InjectView(R.id.m_id_tab_layout)
    private SlidingTabLayout slidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_activity_tabbed);

        viewPager.setAdapter(new MaterializerTabAdapter(getSupportFragmentManager(), NUMBER_OF_TABS));
        slidingTabLayout.setCustomTabView(R.layout.m_component_tab, R.id.m_id_tv_tab_title);

        slidingTabLayout.setViewPager(viewPager);

        toolbar.setTitle(R.string.app_name);

        slidingTabLayout.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                viewPager.setCurrentItem(position);
            }
        });
    }


}
