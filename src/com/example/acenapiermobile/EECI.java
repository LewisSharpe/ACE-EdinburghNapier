// ENGINEERING COMPUTING AND CREATIVE INDUSTRIES
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import lewis.acenapiermobile.R;

public class EECI extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eeci);
		// BUTTON TO MOVE TO SCHOOL OF COMPUTING WINDOW
		Button Soc = (Button) findViewById(R.id.btnSoc);
        Soc.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoSoc = new Intent(EECI.this, Soc.class); // once clicked on move user to SOC window
    			
    			startActivity(movetoSoc);
    		}
        });
        // BUTTON TO MOVE TO SCHOOL OF ENGINEERING WINDOW
        Button Soe = (Button) findViewById(R.id.btnSoe);
        Soe.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoSoe = new Intent(EECI.this, Soe.class); // once clicked on move user to SOE window
    			
    			startActivity(movetoSoe);
    		}
        });
        // BUTTON TO MOVE TO SCHOOL OF CREATIVE INDUSTRIES WINDOW
        Button Soci = (Button) findViewById(R.id.btnSoci);
        Soci.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoSoci = new Intent(EECI.this, Soci.class); // once clicked on move user to CI window
    			
    			startActivity(movetoSoci);
    		}
        });
     // BUTTON TO MOVE TO MERCHISTON CAMPUS PICTURE GALLERY WINDOW
        Button MCampusPictureGallery = (Button) findViewById(R.id.btnMCampusPictureGallery);
        MCampusPictureGallery.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoMCampusPictureGallery = new Intent(EECI.this, MCampusPictureGallery.class); // once clicked on move user to merchiston campus pg window
    			
    			startActivity(movetoMCampusPictureGallery);
    		}
        });
  
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_eeci, menu);
		return true;
	}

}
