package com.recycler.listwrapper.adapter;


import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.recycler.listwrapper.listener.ListItemUICallback;
import com.recycler.listwrapper.viewholder.ListWrapperViewHolder;

/**
 * Created by saurav on 05/03/17.
 */
public class ListWrapperAdapter extends RecyclerView.Adapter {

    private final int mItemSize;
    @LayoutRes
    private final int mrowItemLayoutId;
    private final RecyclerView mRecyclerView;
    private final ListItemUICallback mListItemUICallback;
    private LayoutInflater mInflater;


    public ListWrapperAdapter(@LayoutRes int rowItemLayoutId, int itemSize,
                              RecyclerView recyclerView, ListItemUICallback listItemUICallback) {
        mItemSize = itemSize;
        mrowItemLayoutId = rowItemLayoutId;
        mRecyclerView = recyclerView;
        mListItemUICallback = listItemUICallback;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(mInflater == null ) {
            mInflater = LayoutInflater.from(parent.getContext());
        }
        View view = mInflater.inflate(mrowItemLayoutId , parent ,  false);
        ListWrapperViewHolder viewHolder = new ListWrapperViewHolder(view , mRecyclerView , mListItemUICallback);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(mListItemUICallback != null ) {
            View view = ((ListWrapperViewHolder) holder).getView();
            mListItemUICallback.populateView(view , position);
        }
    }

    @Override
    public int getItemCount() {
        return mItemSize;
    }


}
