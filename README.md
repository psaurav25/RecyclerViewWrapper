# RecyclerViewWrapper
Utility to simplify the complexities associated with handling recyclerview, and present the user 
with a simple and clean mechanism to use recyclerview, to handle the onItemClick, and to provide 
users a chance to update the row view, before it is rendered

Usage :-

Pass the index of recycler view from xml to the ListWrapper instance :

RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
ListWrapper wrapper = new ListWrapper(recyclerView , R.layout.recycler_view_row_layout , rowItemCount , new LinearLayoutManager(getApplicationContext()) , this);
        
To start processing, call :
wrapper.populateRecyclerView();


To get a callback to update the rowItemView before its rendered , Implement the interface ListItemUICallback, and implement its populateView method :-

@Override
public void populateView(View view, int position) {
        //update your item view here
}

To get row click event of recycler view, implement the onItemClick method of ListItemUICallback :

 @Override
 public void onItemClick(View view, int position) {
        //handle view item click here

 }
