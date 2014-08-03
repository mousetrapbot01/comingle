package comingle.mobile.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ExpandableListView;

import comingle.facts.Fact;

//view to show all objects present in different tabs

public class AlternativeView extends Fragment {

	private UISoup<Fact> uisoup;
	private SavedTabsListAdapter tab_list_adpt;	

	public AlternativeView(UISoup<Fact> uisoup){
		this.uisoup = uisoup;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		tab_list_adpt = new SavedTabsListAdapter(getActivity(), uisoup);
		View v = inflater.inflate(R.layout.list_expand, null);
		ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.lvExp);
		elv.setAdapter( tab_list_adpt );
		return v;
	}

	public void refresh() {
		if(tab_list_adpt != null) {
			tab_list_adpt.notifyDataSetChanged();
			tab_list_adpt.notifyDataSetInvalidated();
		}
	}

}
