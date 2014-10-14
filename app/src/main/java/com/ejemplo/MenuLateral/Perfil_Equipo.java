package com.elpoeta.menulateralslide;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejemplo.MenuLateral.fragmentPageAdapter;

/**
 * Created by user on 26/08/2014.
 */
public class Perfil_Equipo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.perfilequipo, container, false);

        return rootView;
    }

    class datos extends FragmentActivity implements ActionBar.TabListener{
       ActionBar actionBar;
       ViewPager viewPager;
       FragmentPagerAdapter fp;

        protected  void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.datos_activity);
            viewPager = (ViewPager) findViewById(R.id.pager);
            fp = new fragmentPageAdapter(getSupportFragmentManager());

            actionBar = getActionBar();
            viewPager.setAdapter(fp);
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            actionBar.addTab(actionBar.newTab().setText("Datos").setTabListener(this));
            actionBar.addTab(actionBar.newTab().setText("Miembros").setTabListener(this));
            actionBar.addTab(actionBar.newTab().setText("Favoritos").setTabListener(this));
            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener(){
                @Override
                public void onPageScrolled(int i, float v, int i2) {
                    actionBar.setSelectedNavigationItem(i);
                }

                @Override
                public void onPageSelected(int i) {

                }

                @Override
                public void onPageScrollStateChanged(int i) {

                }
            });

        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            viewPager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }
    }
        }
