package com.ksy5662.flyfishingmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.ksy5662.flyfishingmap.R;

public class MapPOIDetailActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setTitle("POI Item Detail");
        
        setContentView(R.layout.poi_detail);
        
        Intent intent = getIntent();
        String poiName = intent.getStringExtra("POIName");

        TextView textView = (TextView)findViewById(R.id.textViewPOIDetail);
        textView.setText("POI Name : " + poiName);
    }
}
