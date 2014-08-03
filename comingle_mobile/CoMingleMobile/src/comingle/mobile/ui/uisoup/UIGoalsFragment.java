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

import comingle.goals.Goals;
import comingle.facts.Fact;

public class UIGoalsFragment<F extends Fact> extends UIFragment<F> {

	protected Goals<F> goals;
	protected ArrayAdapter<F> adapter;

	public UIGoalsFragment(Goals<F> goals) { this.goals = goals; }
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			
		adapter = new ArrayAdapter<F>(getActivity(), android.R.layout.simple_list_item_1, goals.toList());
		setListAdapter( adapter );
	}
		
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list_fragment, container, false);
	}
		
	@Override
	public void onListItemClick(ListView list, View v, int position, long id) { }
		
	@Override
	public String getName() { return "Goals"; }

	@Override
	public void refresh() {
		if(adapter != null) {
			adapter.notifyDataSetChanged();
			adapter.notifyDataSetInvalidated();		
		}
	}

	@Override
	public List<F> toList() { return goals.toList(); }

}
