package com.androidbegin.dialogfragmenttutorial;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyDialogFragment extends DialogFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.dialogfragment, container,
				false);
		getDialog().setTitle("Simple Dialog Fragment");
		// Do something else
		return rootView;
	}
}