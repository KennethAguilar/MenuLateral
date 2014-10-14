package com.ejemplo.MenuLateral;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elpoeta.menulateralslide.R;

/**
 * Created by Ermis Luna on 14/10/2014.
 */
public class miembroFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.miembro_ly, container, false);
    }
}
