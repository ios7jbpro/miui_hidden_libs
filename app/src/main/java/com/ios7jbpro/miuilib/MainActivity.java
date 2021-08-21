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
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView languagetext;
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
	private TextView textview62;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout linear6;
	private TextView textview63;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear8;
	private TextView textview64;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout linear10;
	private TextView textview65;
	private TextView textview9;
	private TextView textview10;
	private LinearLayout linear12;
	private TextView textview66;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout linear14;
	private TextView textview67;
	private TextView textview13;
	private TextView textview14;
	private LinearLayout linear16;
	private TextView textview68;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear18;
	private TextView textview69;
	private TextView textview17;
	private TextView textview18;
	private LinearLayout linear20;
	private TextView textview70;
	private TextView textview19;
	private TextView textview20;
	private LinearLayout linear22;
	private TextView textview71;
	private TextView textview21;
	private TextView textview22;
	private LinearLayout linear24;
	private TextView textview72;
	private TextView textview23;
	private TextView textview24;
	private LinearLayout linear26;
	private TextView textview73;
	private TextView textview25;
	private TextView textview26;
	private LinearLayout linear28;
	private TextView textview74;
	private TextView textview27;
	private TextView textview28;
	private LinearLayout linear30;
	private TextView textview75;
	private TextView textview29;
	private TextView textview30;
	private LinearLayout linear32;
	private TextView textview76;
	private TextView textview31;
	private TextView textview32;
	private LinearLayout linear34;
	private TextView textview77;
	private TextView textview33;
	private TextView textview34;
	private LinearLayout linear36;
	private TextView textview78;
	private TextView textview35;
	private TextView textview36;
	private LinearLayout linear38;
	private TextView textview79;
	private TextView textview37;
	private TextView textview38;
	private LinearLayout linear40;
	private TextView textview80;
	private TextView textview39;
	private TextView textview40;
	private LinearLayout linear42;
	private TextView textview81;
	private TextView textview41;
	private TextView textview42;
	private LinearLayout linear44;
	private TextView textview82;
	private TextView textview43;
	private TextView textview44;
	private LinearLayout linear46;
	private TextView textview83;
	private TextView textview45;
	private TextView textview46;
	private LinearLayout linear48;
	private TextView textview84;
	private TextView textview47;
	private TextView textview48;
	private LinearLayout linear50;
	private TextView textview85;
	private TextView textview49;
	private TextView textview50;
	private LinearLayout linear52;
	private TextView textview86;
	private TextView textview51;
	private TextView textview52;
	private LinearLayout linear54;
	private TextView textview87;
	private TextView textview53;
	private TextView textview54;
	private LinearLayout linear56;
	private TextView textview88;
	private TextView textview55;
	private TextView textview56;
	private LinearLayout linear58;
	private TextView textview89;
	private TextView textview57;
	private TextView textview58;
	private LinearLayout linear60;
	private TextView textview90;
	private TextView textview59;
	private TextView textview60;
	private LinearLayout linear62;
	private TextView textview91;
	private TextView textview61;
	
	private AlertDialog.Builder is;
	private Intent jdjd = new Intent();
	private Intent war = new Intent();
	
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
		languagetext = (TextView) findViewById(R.id.languagetext);
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
		textview62 = (TextView) findViewById(R.id.textview62);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview63 = (TextView) findViewById(R.id.textview63);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview64 = (TextView) findViewById(R.id.textview64);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview65 = (TextView) findViewById(R.id.textview65);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview66 = (TextView) findViewById(R.id.textview66);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview67 = (TextView) findViewById(R.id.textview67);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview68 = (TextView) findViewById(R.id.textview68);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview69 = (TextView) findViewById(R.id.textview69);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview70 = (TextView) findViewById(R.id.textview70);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview71 = (TextView) findViewById(R.id.textview71);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview22 = (TextView) findViewById(R.id.textview22);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview72 = (TextView) findViewById(R.id.textview72);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		textview73 = (TextView) findViewById(R.id.textview73);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview26 = (TextView) findViewById(R.id.textview26);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		textview74 = (TextView) findViewById(R.id.textview74);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview28 = (TextView) findViewById(R.id.textview28);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview75 = (TextView) findViewById(R.id.textview75);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview30 = (TextView) findViewById(R.id.textview30);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		textview76 = (TextView) findViewById(R.id.textview76);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview32 = (TextView) findViewById(R.id.textview32);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textview77 = (TextView) findViewById(R.id.textview77);
		textview33 = (TextView) findViewById(R.id.textview33);
		textview34 = (TextView) findViewById(R.id.textview34);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		textview78 = (TextView) findViewById(R.id.textview78);
		textview35 = (TextView) findViewById(R.id.textview35);
		textview36 = (TextView) findViewById(R.id.textview36);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		textview79 = (TextView) findViewById(R.id.textview79);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview38 = (TextView) findViewById(R.id.textview38);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		textview80 = (TextView) findViewById(R.id.textview80);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview40 = (TextView) findViewById(R.id.textview40);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		textview81 = (TextView) findViewById(R.id.textview81);
		textview41 = (TextView) findViewById(R.id.textview41);
		textview42 = (TextView) findViewById(R.id.textview42);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		textview82 = (TextView) findViewById(R.id.textview82);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview44 = (TextView) findViewById(R.id.textview44);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		textview83 = (TextView) findViewById(R.id.textview83);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview46 = (TextView) findViewById(R.id.textview46);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		textview84 = (TextView) findViewById(R.id.textview84);
		textview47 = (TextView) findViewById(R.id.textview47);
		textview48 = (TextView) findViewById(R.id.textview48);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		textview85 = (TextView) findViewById(R.id.textview85);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview50 = (TextView) findViewById(R.id.textview50);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		textview86 = (TextView) findViewById(R.id.textview86);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview52 = (TextView) findViewById(R.id.textview52);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		textview87 = (TextView) findViewById(R.id.textview87);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview54 = (TextView) findViewById(R.id.textview54);
		linear56 = (LinearLayout) findViewById(R.id.linear56);
		textview88 = (TextView) findViewById(R.id.textview88);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview56 = (TextView) findViewById(R.id.textview56);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		textview89 = (TextView) findViewById(R.id.textview89);
		textview57 = (TextView) findViewById(R.id.textview57);
		textview58 = (TextView) findViewById(R.id.textview58);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		textview90 = (TextView) findViewById(R.id.textview90);
		textview59 = (TextView) findViewById(R.id.textview59);
		textview60 = (TextView) findViewById(R.id.textview60);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		textview91 = (TextView) findViewById(R.id.textview91);
		textview61 = (TextView) findViewById(R.id.textview61);
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
		languagetext.setText(Locale.getDefault().getDisplayLanguage());
		_language();
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
		}
		View a = getWindow().getDecorView();
		a.setSystemUiVisibility(0);
		switch (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
			    case Configuration.UI_MODE_NIGHT_YES:
			_night();
			getWindow().getDecorView();
			a.setSystemUiVisibility(0);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =MainActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
			}
			
			        break;
			    case Configuration.UI_MODE_NIGHT_NO:
			_light();
			getWindow().getDecorView();
			a.setSystemUiVisibility(0);
			getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
			getWindow().setStatusBarColor(0xFFFFFFFF);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =MainActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
			}
			break; 
		}
		war.setAction(Intent.ACTION_VIEW);
		war.setClass(getApplicationContext(), WarningActivity.class);
		startActivity(war);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _night () {
		linear1.setBackgroundColor(0xFF000000);
		vscroll1.setBackgroundColor(0xFF000000);
		textview1.setTextColor(0xFFFFFFFF);
		textview2.setTextColor(0xFFFFFFFF);
		textview62.setTextColor(0xFFFFFFFF);
		textview3.setTextColor(0xFFFFFFFF);
		textview4.setTextColor(0xFFFFFFFF);
		textview63.setTextColor(0xFFFFFFFF);
		textview5.setTextColor(0xFFFFFFFF);
		textview6.setTextColor(0xFFFFFFFF);
		textview64.setTextColor(0xFFFFFFFF);
		textview7.setTextColor(0xFFFFFFFF);
		textview8.setTextColor(0xFFFFFFFF);
		textview65.setTextColor(0xFFFFFFFF);
		textview9.setTextColor(0xFFFFFFFF);
		textview10.setTextColor(0xFFFFFFFF);
		textview66.setTextColor(0xFFFFFFFF);
		textview11.setTextColor(0xFFFFFFFF);
		textview12.setTextColor(0xFFFFFFFF);
		textview67.setTextColor(0xFFFFFFFF);
		textview13.setTextColor(0xFFFFFFFF);
		textview14.setTextColor(0xFFFFFFFF);
		textview68.setTextColor(0xFFFFFFFF);
		textview15.setTextColor(0xFFFFFFFF);
		textview16.setTextColor(0xFFFFFFFF);
		textview69.setTextColor(0xFFFFFFFF);
		textview17.setTextColor(0xFFFFFFFF);
		textview18.setTextColor(0xFFFFFFFF);
		textview70.setTextColor(0xFFFFFFFF);
		textview19.setTextColor(0xFFFFFFFF);
		textview20.setTextColor(0xFFFFFFFF);
		textview71.setTextColor(0xFFFFFFFF);
		textview21.setTextColor(0xFFFFFFFF);
		textview22.setTextColor(0xFFFFFFFF);
		textview72.setTextColor(0xFFFFFFFF);
		textview23.setTextColor(0xFFFFFFFF);
		textview24.setTextColor(0xFFFFFFFF);
		textview73.setTextColor(0xFFFFFFFF);
		textview25.setTextColor(0xFFFFFFFF);
		textview26.setTextColor(0xFFFFFFFF);
		textview74.setTextColor(0xFFFFFFFF);
		textview27.setTextColor(0xFFFFFFFF);
		textview28.setTextColor(0xFFFFFFFF);
		textview75.setTextColor(0xFFFFFFFF);
		textview29.setTextColor(0xFFFFFFFF);
		textview30.setTextColor(0xFFFFFFFF);
		textview76.setTextColor(0xFFFFFFFF);
		textview31.setTextColor(0xFFFFFFFF);
		textview32.setTextColor(0xFFFFFFFF);
		textview77.setTextColor(0xFFFFFFFF);
		textview33.setTextColor(0xFFFFFFFF);
		textview34.setTextColor(0xFFFFFFFF);
		textview78.setTextColor(0xFFFFFFFF);
		textview35.setTextColor(0xFFFFFFFF);
		textview36.setTextColor(0xFFFFFFFF);
		textview79.setTextColor(0xFFFFFFFF);
		textview37.setTextColor(0xFFFFFFFF);
		textview38.setTextColor(0xFFFFFFFF);
		textview80.setTextColor(0xFFFFFFFF);
		textview39.setTextColor(0xFFFFFFFF);
		textview40.setTextColor(0xFFFFFFFF);
		textview81.setTextColor(0xFFFFFFFF);
		textview41.setTextColor(0xFFFFFFFF);
		textview42.setTextColor(0xFFFFFFFF);
		textview82.setTextColor(0xFFFFFFFF);
		textview43.setTextColor(0xFFFFFFFF);
		textview44.setTextColor(0xFFFFFFFF);
		textview83.setTextColor(0xFFFFFFFF);
		textview45.setTextColor(0xFFFFFFFF);
		textview46.setTextColor(0xFFFFFFFF);
		textview84.setTextColor(0xFFFFFFFF);
		textview47.setTextColor(0xFFFFFFFF);
		textview48.setTextColor(0xFFFFFFFF);
		textview85.setTextColor(0xFFFFFFFF);
		textview49.setTextColor(0xFFFFFFFF);
		textview50.setTextColor(0xFFFFFFFF);
		textview86.setTextColor(0xFFFFFFFF);
		textview51.setTextColor(0xFFFFFFFF);
		textview52.setTextColor(0xFFFFFFFF);
		textview87.setTextColor(0xFFFFFFFF);
		textview53.setTextColor(0xFFFFFFFF);
		textview54.setTextColor(0xFFFFFFFF);
		textview88.setTextColor(0xFFFFFFFF);
		textview55.setTextColor(0xFFFFFFFF);
		textview56.setTextColor(0xFFFFFFFF);
		textview89.setTextColor(0xFFFFFFFF);
		textview57.setTextColor(0xFFFFFFFF);
		textview58.setTextColor(0xFFFFFFFF);
		textview90.setTextColor(0xFFFFFFFF);
		textview59.setTextColor(0xFFFFFFFF);
		textview60.setTextColor(0xFFFFFFFF);
		textview91.setTextColor(0xFFFFFFFF);
		textview61.setTextColor(0xFFFFFFFF);
	}
	
	
	public void _light () {
		
	}
	
	
	public void _language () {
		if (languagetext.getText().toString().equals("English")) {
			//Descriptions
			textview62.setText("MTK technology to add frames in the video.");
			textview63.setText("Make videos HDR");
			textview64.setText("Make images HDR(old method)");
			textview65.setText("Make images HDR(new)");
			textview66.setText("GPS technology (might not work)");
			textview67.setText("From AOSP, but exist in MIUI");
			textview68.setText("System categ. from AOSP");
			textview69.setText("Old section from MIUI 12");
			textview70.setText("Old section from MIUI 12");
			textview71.setText("From AOSP, but exist in MIUI");
			textview72.setText("Screen Saver from AOSP");
			textview73.setText("ONLY FLAGSHIP DEVICES!");
			textview74.setText("Old switcher from MIUI 9");
			textview75.setText("Always On Display");
			textview76.setText("Actual AOSP DND mode(disabled by MIUI)");
			textview77.setText("From AOSP(probably doesn't work)");
			textview78.setText("NightLight from AOSP");
			textview79.setText("Hidden Multi Users option");
			textview80.setText("Old section from MIUI 12(V2)");
			textview81.setText("Hidden Battery Stats");
			textview82.setText("From MIUI 12");
			textview83.setText("Turns back to home");
			textview84.setText("The name says it");
			textview85.setText("Picker for MIUI used in apps");
			textview86.setText("Hidden size changer from 12");
			textview87.setText("Notif. form AOSP");
			textview88.setText("Dialog used in MIUI");
			textview89.setText("(might not work)");
			textview90.setText("(doesn't work)");
			textview91.setText("Name says it");
		}
		if (languagetext.getText().toString().equals("Türkçe")) {
				//Descriptions
			textview62.setText("Videoya kare ekler(MTK Teknolojisi).");
				textview63.setText("Video'ları HDR yapar");
				textview64.setText("Fotoğraf'ları HDR yapar.(eski yöntem)");
				textview65.setText("Fotoğraf'ları HDR yapar(yeni)");
				textview66.setText("GPS teknolojisi (çalışmayabilir)");
				textview67.setText("AOSP'dan, ancak MIUI'da bulunur.");
				textview68.setText("AOSP'dan sistem kategorisi.");
				textview69.setText("MIUI 12'den eski kısım.");
				textview70.setText("MIUI 12'drn eski kısım.");
				textview71.setText("AOSP'dan, ancak MIUI'da bulunur.");
				textview72.setText("Screen Saver from AOSP");
				textview73.setText("SADECE AMİRAL CIHAZLAR!");
				textview74.setText("MIUI 9'dan eski anahtarlayıcı.");
				textview75.setText("Her zaman açık ekran");
				textview76.setText("Asıl rahatsız etme modu(MIUI tarafından etkisizleştirildi)");
				textview77.setText("AOSP'dan(muhtemelen çalışmayacaktır)");
				textview78.setText("AOSP'dan Gece Işığı");
				textview79.setText("Gizli Çoklu Kullanıcı seçeneği.");
				textview80.setText("MIUI 12'den eski seçenek(V2)");
				textview81.setText("Gizli Pil İstatislikleri");
				textview82.setText("MIUI 12'den");
				textview83.setText("Ana Ekran'a föner");
				textview84.setText("Adına hitaben");
				textview85.setText("MIUI'da uygulamalarda kullanılanılabilen alıcı.");
				textview86.setText("MIUI 12'den gizli boyut ayarlayıcı.");
				textview87.setText("AOSP'dan bildirim");
				textview88.setText("MIUI'da kullanılan diyalog");
				textview89.setText("(çalışmayabilir)");
				textview90.setText("(çalışmaz)");
				textview91.setText("İsim söylüyor");
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