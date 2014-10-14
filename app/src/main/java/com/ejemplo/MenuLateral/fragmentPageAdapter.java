package com.ejemplo.MenuLateral;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ermis Luna on 14/10/2014.
 */
public class fragmentPageAdapter extends FragmentPagerAdapter {
    public fragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
           case 0:
                return new datosFragment();
           case 1:
                return new miembroFragment();
           case 2:
                return new favoritoFragment();

            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

}