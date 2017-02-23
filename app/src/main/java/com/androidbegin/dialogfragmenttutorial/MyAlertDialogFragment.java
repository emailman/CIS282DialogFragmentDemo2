package com.androidbegin.dialogfragmenttutorial;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class MyAlertDialogFragment extends DialogFragment {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		return new AlertDialog.Builder(getActivity())
				// Set Dialog Icon
				.setIcon(R.drawable.androidhappy)
				// Set Dialog Title
				.setTitle("Alert Dialog Fragment")
				// Set Dialog Message
				.setMessage("Alert Dialog Fragments Have More Features")
				
				// Positive button
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Do something else
					}
				})
				
				// Negative Button
				.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,	int which) {
						// Do something else
					}
				}).create();
	}
}