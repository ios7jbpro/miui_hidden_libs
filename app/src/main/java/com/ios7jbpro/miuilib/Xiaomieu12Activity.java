package com.ios7jbpro.miuilib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import com.tuyenmonkey.mkloader.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class Xiaomieu12Activity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView languagetext;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear8;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private LinearLayout linear16;
	private LinearLayout linear18;
	private LinearLayout linear20;
	private TextView textview20;
	private LinearLayout linear22;
	private TextView textview2;
	private LinearLayout linear5;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout linear7;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear9;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout linear11;
	private TextView textview9;
	private TextView textview10;
	private LinearLayout linear13;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout linear15;
	private TextView textview13;
	private TextView textview14;
	private LinearLayout linear17;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear19;
	private TextView textview17;
	private TextView textview18;
	private LinearLayout linear21;
	private TextView textview19;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.xiaomieu12);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		languagetext = (TextView) findViewById(R.id.languagetext);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview20 = (TextView) findViewById(R.id.textview20);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview19 = (TextView) findViewById(R.id.textview19);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenEnhanceEngineMemcActivity");
				startActivity(intent);
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenEnhanceEngineS2hActivity");
				startActivity(intent);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenEnhanceEngineAiActivity");
				startActivity(intent);
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$SystemDashboardActivity");
				startActivity(intent);
			}
		});
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$StatusBarSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.PaperProtectionActivity");
				startActivity(intent);
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$PrivacyDashboardActivity");
				startActivity(intent);
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$DreamSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.fuelgauge.PowerModeSettings");
				startActivity(intent);
			}
		});
	}
	
	private void initializeLogic() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =Xiaomieu12Activity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}