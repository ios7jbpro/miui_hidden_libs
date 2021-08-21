package com.ios7jbpro.miuilib;

import android.app.Activity;
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
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class MainActivity extends Activity {
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private LinearLayout linear9;
	private LinearLayout linear11;
	private LinearLayout linear13;
	private LinearLayout linear15;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private LinearLayout linear25;
	private LinearLayout linear27;
	private LinearLayout linear29;
	private LinearLayout linear31;
	private LinearLayout linear33;
	private LinearLayout linear35;
	private LinearLayout linear37;
	private LinearLayout linear39;
	private LinearLayout linear41;
	private LinearLayout linear43;
	private LinearLayout linear45;
	private LinearLayout linear47;
	private LinearLayout linear49;
	private LinearLayout linear51;
	private LinearLayout linear53;
	private LinearLayout linear55;
	private LinearLayout linear57;
	private LinearLayout linear59;
	private LinearLayout linear61;
	private TextView textview2;
	private LinearLayout linear4;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout linear6;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear8;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout linear10;
	private TextView textview9;
	private TextView textview10;
	private LinearLayout linear12;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout linear14;
	private TextView textview13;
	private TextView textview14;
	private LinearLayout linear16;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear18;
	private TextView textview17;
	private TextView textview18;
	private LinearLayout linear20;
	private TextView textview19;
	private TextView textview20;
	private LinearLayout linear22;
	private TextView textview21;
	private TextView textview22;
	private LinearLayout linear24;
	private TextView textview23;
	private TextView textview24;
	private LinearLayout linear26;
	private TextView textview25;
	private TextView textview26;
	private LinearLayout linear28;
	private TextView textview27;
	private TextView textview28;
	private LinearLayout linear30;
	private TextView textview29;
	private TextView textview30;
	private LinearLayout linear32;
	private TextView textview31;
	private TextView textview32;
	private LinearLayout linear34;
	private TextView textview33;
	private TextView textview34;
	private LinearLayout linear36;
	private TextView textview35;
	private TextView textview36;
	private LinearLayout linear38;
	private TextView textview37;
	private TextView textview38;
	private LinearLayout linear40;
	private TextView textview39;
	private TextView textview40;
	private LinearLayout linear42;
	private TextView textview41;
	private TextView textview42;
	private LinearLayout linear44;
	private TextView textview43;
	private TextView textview44;
	private LinearLayout linear46;
	private TextView textview45;
	private TextView textview46;
	private LinearLayout linear48;
	private TextView textview47;
	private TextView textview48;
	private LinearLayout linear50;
	private TextView textview49;
	private TextView textview50;
	private LinearLayout linear52;
	private TextView textview51;
	private TextView textview52;
	private LinearLayout linear54;
	private TextView textview53;
	private TextView textview54;
	private LinearLayout linear56;
	private TextView textview55;
	private TextView textview56;
	private LinearLayout linear58;
	private TextView textview57;
	private TextView textview58;
	private LinearLayout linear60;
	private TextView textview59;
	private TextView textview60;
	private LinearLayout linear62;
	private TextView textview61;
	private TextView textview62;
	private TextView textview63;
	private TextView textview64;
	private TextView textview65;
	private TextView textview66;
	private TextView textview67;
	private TextView textview68;
	private TextView textview69;
	private TextView textview70;
	private TextView textview71;
	private TextView textview72;
	private TextView textview73;
	private TextView textview74;
	private TextView textview75;
	private TextView textview76;
	private TextView textview77;
	
	private AlertDialog.Builder is;
	private Intent jdjd = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		linear59 = (LinearLayout) findViewById(R.id.linear59);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview22 = (TextView) findViewById(R.id.textview22);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview26 = (TextView) findViewById(R.id.textview26);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview28 = (TextView) findViewById(R.id.textview28);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview30 = (TextView) findViewById(R.id.textview30);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview32 = (TextView) findViewById(R.id.textview32);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textview33 = (TextView) findViewById(R.id.textview33);
		textview34 = (TextView) findViewById(R.id.textview34);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		textview35 = (TextView) findViewById(R.id.textview35);
		textview36 = (TextView) findViewById(R.id.textview36);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview38 = (TextView) findViewById(R.id.textview38);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview40 = (TextView) findViewById(R.id.textview40);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		textview41 = (TextView) findViewById(R.id.textview41);
		textview42 = (TextView) findViewById(R.id.textview42);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview44 = (TextView) findViewById(R.id.textview44);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview46 = (TextView) findViewById(R.id.textview46);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		textview47 = (TextView) findViewById(R.id.textview47);
		textview48 = (TextView) findViewById(R.id.textview48);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview50 = (TextView) findViewById(R.id.textview50);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview52 = (TextView) findViewById(R.id.textview52);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview54 = (TextView) findViewById(R.id.textview54);
		linear56 = (LinearLayout) findViewById(R.id.linear56);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview56 = (TextView) findViewById(R.id.textview56);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		textview57 = (TextView) findViewById(R.id.textview57);
		textview58 = (TextView) findViewById(R.id.textview58);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		textview59 = (TextView) findViewById(R.id.textview59);
		textview60 = (TextView) findViewById(R.id.textview60);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		textview61 = (TextView) findViewById(R.id.textview61);
		textview62 = (TextView) findViewById(R.id.textview62);
		textview63 = (TextView) findViewById(R.id.textview63);
		textview64 = (TextView) findViewById(R.id.textview64);
		textview65 = (TextView) findViewById(R.id.textview65);
		textview66 = (TextView) findViewById(R.id.textview66);
		textview67 = (TextView) findViewById(R.id.textview67);
		textview68 = (TextView) findViewById(R.id.textview68);
		textview69 = (TextView) findViewById(R.id.textview69);
		textview70 = (TextView) findViewById(R.id.textview70);
		textview71 = (TextView) findViewById(R.id.textview71);
		textview72 = (TextView) findViewById(R.id.textview72);
		textview73 = (TextView) findViewById(R.id.textview73);
		textview74 = (TextView) findViewById(R.id.textview74);
		textview75 = (TextView) findViewById(R.id.textview75);
		textview76 = (TextView) findViewById(R.id.textview76);
		textview77 = (TextView) findViewById(R.id.textview77);
		is = new AlertDialog.Builder(this);
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenEnhanceEngineMemcActivity");
				startActivity(intent);
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenEnhanceEngineS2hActivity");
				startActivity(intent);
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenEnhanceEngineActivity");
				startActivity(intent);
			}
		});
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenEnhanceEngineAiActivity");
				startActivity(intent);
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.AgpsSettings");
				startActivity(intent);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$AssistGestureSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$SystemDashboardActivity");
				startActivity(intent);
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$StatusBarSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.PaperProtectionActivity");
				startActivity(intent);
			}
		});
		
		linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$PrivacyDashboardActivity");
				startActivity(intent);
			}
		});
		
		linear23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$DreamSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenEnhanceEngineSrActivity");
				startActivity(intent);
			}
		});
		
		linear27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.fuelgauge.PowerModeSettings");
				startActivity(intent);
			}
		});
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.miui.aod", "com.miui.aod.settings.AodStyleCategoriesActivity");
				startActivity(intent);
			}
		});
		
		linear31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.notification.zen.ZenOnboardingActivity");
				startActivity(intent);
			}
		});
		
		linear33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$AccessibilityDaltonizerSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$NightDisplaySuggestionActivity");
				startActivity(intent);
			}
		});
		
		linear37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$UserSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ClassicProtectionActivity");
				startActivity(intent);
			}
		});
		
		linear41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.BatteryInfo");
				startActivity(intent);
			}
		});
		
		linear43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$NotificationAssistantSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.FallbackHome");
				startActivity(intent);
			}
		});
		
		linear47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.MonitoringCertInfoActivity");
				startActivity(intent);
			}
		});
		
		linear49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.ActivityPicker");
				startActivity(intent);
			}
		});
		
		linear51.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.display.ScreenZoomActivity");
				startActivity(intent);
			}
		});
		
		linear53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$ConfigureNotificationSettingsActivity");
				startActivity(intent);
			}
		});
		
		linear55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.settingspanel.MiuiSettingsPanelActivity");
				startActivity(intent);
			}
		});
		
		linear57.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.FontSizeSettingsForSetupWizardActivity");
				startActivity(intent);
			}
		});
		
		linear59.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.mediatek.engineermode", "com.mediatek.engineermode.EngineerMode");
				startActivity(intent);
			}
		});
		
		linear61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.setClassName("com.android.settings", "com.android.settings.Settings$SpeakerSettingsActivity");
				startActivity(intent);
			}
		});
	}
	
	private void initializeLogic() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
		}
		is.setTitle("⚠️⚠️READ THIS WARNING!⚠️⚠️");
		is.setMessage("The app is designed to work on miui ONLY. Do not complain me about not working on aosp.\n\nALSO IM NOT RESPONSIBLE FOR ANY ISSUE!\n\n- ios7jbpro");
		is.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		is.setNegativeButton("PM Me on Telegram", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				jdjd.setAction(Intent.ACTION_VIEW);
				jdjd.setData(Uri.parse("https://t.me/ios7jbpro"));
				startActivity(jdjd);
			}
		});
		is.create().show();
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