package pl.mobilewarsaw.android.materializer;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pl.mobilewarsaw.android.materializer.tabs.SlidingTabLayout;
import roboguice.activity.RoboActionBarActivity;
import roboguice.inject.InjectView;

/**
 * @author Mateusz Grzechociński <mateusz.grzechocinski@polidea.com>
 */
public class TabbedActivity extends RoboActionBarActivity {

    public static final int NUMBER_OF_TABS = 6;

    @InjectView(R.id.m_if_vp_tabs)
    private ViewPager viewPager;

    @InjectView(R.id.m_id_toolbar)
    private Toolbar toolbar;

    @InjectView(R.id.m_id_tab_layout)
    private SlidingTabLayout slidingTabLayout;

    private class TabColor{
        public final int indicatorColor;
        public final int dividerColor;

        TabColor(int indicatorColor, int dividerColor) {
            this.indicatorColor = indicatorColor;
            this.dividerColor = dividerColor;
        }
    }

    private List<TabColor> colors = new ArrayList<TabColor>(Arrays.asList(
            new TabColor(Color.MAGENTA, Color.WHITE), new TabColor(Color.CYAN, Color.WHITE), new TabColor(Color.RED, Color.WHITE))){
        @Override
        public TabColor get(int index) {
            return super.get(index % size());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_activity_tabbed);

        viewPager.setAdapter(new MaterializerTabAdapter(getSupportFragmentManager(), NUMBER_OF_TABS));
        slidingTabLayout.setCustomTabView(R.layout.m_component_tab, R.id.m_id_tv_tab_title);

        slidingTabLayout.setViewPager(viewPager);
        slidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return colors.get(position).indicatorColor;
            }

            @Override
            public int getDividerColor(int position) {
                return colors.get(position).dividerColor;
            }
        });

        toolbar.setTitle(R.string.app_name);

        slidingTabLayout.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                viewPager.setCurrentItem(position);
            }
        });
    }


}
