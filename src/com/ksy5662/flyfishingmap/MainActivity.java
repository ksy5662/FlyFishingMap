package com.ksy5662.flyfishingmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.ksy5662.flyfishingmap.R;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setTitle("Android Daum Map Library Sample");
        setContentView(R.layout.main);
        
        Button button1 = (Button)findViewById(R.id.button_start);
        button1.setOnClickListener(buttonClickListener1);
        
        Button button2 = (Button)findViewById(R.id.button_start_layout_xml);
        button2.setOnClickListener(buttonClickListener2);
    }
    
    private OnClickListener buttonClickListener1 = new OnClickListener() {
        public void onClick(View v) {
			Intent intent = new Intent(MainActivity.this, DaumMapSampleActivity.class);
			startActivity(intent);
        }
    };
    
    private OnClickListener buttonClickListener2 = new OnClickListener() {
        public void onClick(View v) {
        	Intent intent = new Intent(MainActivity.this, DaumMapSampleActivityLayoutXML.class);
			startActivity(intent);
        }
    };
}
