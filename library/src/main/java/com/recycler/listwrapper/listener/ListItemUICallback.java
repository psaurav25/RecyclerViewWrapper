package com.recycler.listwrapper.listener;

import android.view.View;

/**
 * Created by saurav on 05/03/17.
 */
public interface ListItemUICallback {

    void populateView(View view , int position);

    void onItemClick(View view , int position);

}
