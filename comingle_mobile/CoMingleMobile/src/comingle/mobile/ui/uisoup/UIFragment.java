package comingle.mobile.ui;

import java.util.List;

import android.support.v4.app.ListFragment;

import comingle.facts.Fact;

public class UIFragment<F extends Fact> extends ListFragment {

	public String getName() { return "Null"; }

	public void refresh() { }

	public List<F> toList() { return null; }

}
