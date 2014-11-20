package pl.mobilewarsaw.android.materializer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * @author Mateusz Grzechociński <mateusz.grzechocinski@polidea.com>
 */
public class MaterializerTabAdapter extends FragmentStatePagerAdapter{

    private int numberOfTabs;

    public MaterializerTabAdapter(FragmentManager supportFragmentManager, int numberOfTabs) {
        super(supportFragmentManager);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
