package com.recycler.listwrapper;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.recycler.listwrapper.adapter.ListWrapperAdapter;
import com.recycler.listwrapper.listener.ListItemUICallback;

public class ListWrapper {

    private final int mItemCount;
    private final RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;
    @LayoutRes
    private int mListItemLayout;
    private ListWrapperAdapter mListWrapperAdapter;
    private ListItemUICallback mListItemUICallback;

    public ListWrapper(RecyclerView recyclerView , @LayoutRes int listItemLayout , int itemCount ,
                       RecyclerView.LayoutManager layoutManager , ListItemUICallback uiCallback ) {
        mRecyclerView = recyclerView;
        mListItemLayout = listItemLayout;
        mItemCount = itemCount;
        mLayoutManager = layoutManager;
        mListItemUICallback = uiCallback;
    }


    public void populateRecyclerView() {
        mListWrapperAdapter = new ListWrapperAdapter(mListItemLayout ,mItemCount , mRecyclerView , mListItemUICallback);
        mRecyclerView.setAdapter(mListWrapperAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }

}