package pl.mobilewarsaw.android.materializer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import roboguice.fragment.RoboFragment;
import roboguice.inject.InjectExtra;
import roboguice.inject.InjectView;

/**
 * @author Mateusz Grzechociński <mateusz.grzechocinski@polidea.com>
 */
public class TabFragment extends RoboFragment {

    private static final String KEY_TAB_INDEX = "KEY_TAB_INDEX";

    @InjectView(R.id.m_id_tv_tabname)
    private TextView tabNameTextView;

    public static TabFragment newInstance(int index){
        TabFragment tabFragment = new TabFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_TAB_INDEX, index);
        tabFragment.setArguments(bundle);
        return tabFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.m_fragment_tabbed, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int index = getArguments().getInt(KEY_TAB_INDEX);
        tabNameTextView.setText("Tab " + (index + 1));

    }
}
