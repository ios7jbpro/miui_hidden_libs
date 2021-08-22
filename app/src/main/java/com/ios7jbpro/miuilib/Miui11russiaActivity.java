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
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class Miui11russiaActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private TextView languagetext;
	private ImageView imageview1;
	private TextView textview1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private TextView textview2;
	private LinearLayout linear4;
	private TextView textview3;
	private LinearLayout linear6;
	private TextView textview6;
	private LinearLayout linear7;
	private TextView textview7;
	private LinearLayout linear8;
	private TextView textview8;
	private LinearLayout linear9;
	private TextView textview9;
	private LinearLayout linear10;
	private TextView textview10;
	private LinearLayout linear11;
	private TextView textview11;
	private LinearLayout linear12;
	private TextView textview12;
	private LinearLayout linear13;
	private TextView textview13;
	private LinearLayout linear14;
	private TextView textview14;
	private LinearLayout linear15;
	private TextView textview15;
	private LinearLayout linear16;
	private TextView textview16;
	private LinearLayout linear17;
	private TextView textview17;
	private LinearLayout linear18;
	private TextView textview18;
	private LinearLayout linear19;
	private TextView textview19;
	private LinearLayout linear20;
	private TextView textview20;
	private LinearLayout linear21;
	private TextView textview21;
	private LinearLayout linear22;
	private TextView textview22;
	private LinearLayout linear23;
	private TextView textview23;
	private LinearLayout linear24;
	private TextView textview24;
	private LinearLayout linear25;
	private TextView textview25;
	private LinearLayout linear26;
	private TextView textview26;
	private LinearLayout linear27;
	private TextView textview27;
	private LinearLayout linear30;
	private TextView textview30;
	private LinearLayout linear31;
	private TextView textview31;
	private LinearLayout linear32;
	private TextView textview32;
	private LinearLayout linear33;
	private TextView textview33;
	private LinearLayout linear34;
	private TextView textview34;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.miui11russia);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		languagetext = (TextView) findViewById(R.id.languagetext);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview15 = (TextView) findViewById(R.id.textview15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview16 = (TextView) findViewById(R.id.textview16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview17 = (TextView) findViewById(R.id.textview17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview18 = (TextView) findViewById(R.id.textview18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		textview19 = (TextView) findViewById(R.id.textview19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview20 = (TextView) findViewById(R.id.textview20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview21 = (TextView) findViewById(R.id.textview21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview22 = (TextView) findViewById(R.id.textview22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		textview23 = (TextView) findViewById(R.id.textview23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview24 = (TextView) findViewById(R.id.textview24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview25 = (TextView) findViewById(R.id.textview25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		textview26 = (TextView) findViewById(R.id.textview26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		textview27 = (TextView) findViewById(R.id.textview27);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview30 = (TextView) findViewById(R.id.textview30);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		textview31 = (TextView) findViewById(R.id.textview31);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		textview32 = (TextView) findViewById(R.id.textview32);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		textview33 = (TextView) findViewById(R.id.textview33);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textview34 = (TextView) findViewById(R.id.textview34);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$StatusBarSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$DreamSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.fuelgauge.PowerModeSettings");
				startActivity(intent);
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$AccessibilityDaltonizerSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$UserSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.BatteryInfo");
				startActivity(intent);
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.FallbackHome");
				startActivity(intent);
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.MonitoringCertInfoActivity");
				startActivity(intent);
			}
		});
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenZoomActivity");
				startActivity(intent);
			}
		});
		
		linear22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$ConfigureNotificationSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.miui.securitycenter", "com.miui.gamebooster.ui.QuickReplySettingsActivity");
				startActivity(intent);
			}
		});
		
		linear26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.UsageStatsActivity");
				startActivity(intent);
			}
		});
		
		linear30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings.intelligence", "com.android.settings.intelligence.search.SearchActivity");
				startActivity(intent);
			}
		});
		
		linear32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.miui.securityadd", "com.miui.permcenter.RootManagerNote");
				startActivity(intent);
			}
		});
	}
	
	private void initializeLogic() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =Miui11russiaActivity.this.getWindow();
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