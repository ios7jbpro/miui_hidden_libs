package com.ios7jbpro.miuilib;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.io.InputStream;

public class DebugActivity extends Activity {

	private String[] exceptionTypes = {
		"StringIndexOutOfBoundsException",
		"IndexOutOfBoundsException",
		"ArithmeticException",
		"NumberFormatException",
		"ActivityNotFoundException"
	};

	private String[] exceptionMessages = {
		"Invalid string operation\n",
		"Invalid list operation\n",
		"Invalid arithmetical operation\n",
		"Invalid toNumber block operation\n",
		"Invalid intent operation"
	};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = getIntent();
		String errorMessage = "";
		String madeErrorMessage = "";

		if (intent != null) {
			errorMessage = intent.getStringExtra("error");

			String[] split = errorMessage.split("\n");
			//errorMessage = split[0];
			try {
				for (int j = 0; j < exceptionTypes.length; j++) {
					if (split[0].contains(exceptionTypes[j])) {
						madeErrorMessage = exceptionMessages[j];

						int addIndex = split[0].indexOf(exceptionTypes[j]) + exceptionTypes[j].length();

						madeErrorMessage += split[0].substring(addIndex, split[0].length());
						madeErrorMessage += "\n\nFull stack trace:\n" + errorMessage;
						break;
					}
				}

				if (madeErrorMessage.isEmpty()) {
					madeErrorMessage = errorMessage;
				}
			} catch (Exception e) {
				madeErrorMessage = madeErrorMessage + "\n\nError while getting error: " + Log.getStackTraceString(e);
			}
		}

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("An error occured");
		builder.setMessage(madeErrorMessage);
		builder.setPositiveButton("End Application", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		});
		builder.create().show();
	}
}
