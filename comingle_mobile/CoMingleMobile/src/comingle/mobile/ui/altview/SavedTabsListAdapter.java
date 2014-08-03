package comingle.mobile.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import comingle.facts.Fact;

public class SavedTabsListAdapter extends BaseExpandableListAdapter {
	//private Context context;
	private Context context;
	
	private List<String> listDataHeader; // header titles
	// item data in format of item title, header title
	private HashMap<String, List<Fact>> listDataChild;
	
	

	public SavedTabsListAdapter(Context c,UISoup<Fact> uisoup) {
		
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<Fact>>();
		context = c;

		// Adding header and item data data
		for(int i=0; i<uisoup.size(); i++) {
			String cat = uisoup.getCategory(i);
			listDataHeader.add( cat );
			listDataChild.put(cat, uisoup.getFragment(i).toList() );
		}

	}

	@Override
	public Object getChild(int groupPosition, int childPosititon) {
		return listDataChild.get(this.listDataHeader.get(groupPosition)).get(childPosititon);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}
	
	@Override
	public View getChildView(int groupPosition, final int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {

		final Fact fact = (Fact) getChild(groupPosition, childPosition);

		if (convertView == null) {
			LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(R.layout.child_item, null);
		}

		TextView txtListChild = (TextView) convertView.findViewById(R.id.laptop);

		txtListChild.setText(fact.toString());
		return convertView;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return listDataChild.get(this.listDataHeader.get(groupPosition)).size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return listDataHeader.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return listDataHeader.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		String headerTitle = (String) getGroup(groupPosition);
		if (convertView == null) {
			LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(R.layout.group_item, null);
		}

		TextView lblListHeader = (TextView) convertView.findViewById(R.id.laptop);
		lblListHeader.setTypeface(null, Typeface.BOLD);
		lblListHeader.setText(headerTitle);

		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}


}
