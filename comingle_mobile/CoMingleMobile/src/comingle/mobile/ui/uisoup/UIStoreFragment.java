package comingle.mobile.ui;

import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import comingle.store.Store;
import comingle.facts.Fact;

public class UIStoreFragment<F extends Fact> extends UIFragment<F> {

	protected Store<F> store;
	protected ArrayAdapter<F> adapter;

	public UIStoreFragment(Store<F> store) { this.store = store; }
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			
		adapter = new ArrayAdapter<F>(getActivity(), android.R.layout.simple_list_item_1, store.toList());
		setListAdapter( adapter );
		/*		
		ListAdapter listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, arr);
		adapter = (ArrayAdapter<String>) listAdapter;
		setListAdapter(listAdapter);    
		*/
	}
		
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list_fragment, container, false);
	}
		
	@Override
	public void onListItemClick(ListView list, View v, int position, long id) {
		this.removeItemFromList(position);   
	}
		
	@Override
	public String getName() { return store.get_name(); }

	// method to remove list item
	protected void removeItemFromList(int position) {
		final int deletePosition = position;
	        AlertDialog.Builder alert = new AlertDialog.Builder(this.getActivity());
	    
		alert.setTitle("Delete");
		alert.setMessage("Do you want delete this item?");
		alert.setPositiveButton("YES", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				store.remove(deletePosition);
				store.purge();
				adapter.notifyDataSetChanged();
				adapter.notifyDataSetInvalidated();
			}
		});
		alert.setNegativeButton("CANCEL", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});      
		alert.show();	      
	}

	@Override
	public void refresh() {
		store.purge();
		if(adapter != null) {
			adapter.notifyDataSetChanged();
			adapter.notifyDataSetInvalidated();		
		}
	}

	@Override
	public List<F> toList() { return store.toList(); }

}
