package com.recycler.listwrapper.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.recycler.listwrapper.listener.ListItemUICallback;

/**
 * Created by saurav on 05/03/17.
 */
public class ListWrapperViewHolder extends RecyclerView.ViewHolder {

    private final RecyclerView mRecyclerView;
    private final ListItemUICallback mCallback;

    private View mView;

    public ListWrapperViewHolder(final View itemView , RecyclerView recyclerView , ListItemUICallback callback) {
        super(itemView);
        mView = itemView;
        mRecyclerView = recyclerView;
        mCallback = callback;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mRecyclerView == null || mCallback == null ) {
                    return;
                }
                int position = mRecyclerView.getChildAdapterPosition(view);
                mCallback.onItemClick(view , position);

            }
        });
    }

    public View getView() {
        return mView;
    }
}
