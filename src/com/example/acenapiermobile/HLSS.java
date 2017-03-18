// SCHOOL OF HEALTH LIFE SOCIAL SCIENCES
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import lewis.acenapiermobile.R;

public class HLSS extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hlss);
		// BUTTON TO NURSING MIDWIFERY AND SOCIAL CARE
		Button HLSciences = (Button) findViewById(R.id.btnHLSciences);
        HLSciences.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoHLSciences = new Intent(HLSS.this, SocialSciences.class); // once clicked on move user to school of midwifery, nursing and social care window
    			
    			startActivity(movetoHLSciences);
    		}
        });
        // BUTTON TO MOVE TO LIFE SPORT AND SOCIAL SCIENCES
        Button SocialSciences = (Button) findViewById(R.id.btnSocialSciences);
        SocialSciences.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoSocialSciences = new Intent(HLSS.this, HLSciences.class); // once clicked on move user to life sport and social sciences window
    			
    			startActivity(movetoSocialSciences);
    		}
        });
     // BUTTON TO MOVE TO SIGHTHILL CAMPUS PICTURE GALLERY WINDOW
        Button SCampusPictureGallery = (Button) findViewById(R.id.btnSCampusPictureGallery);
        SCampusPictureGallery.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoSCampusPictureGallery = new Intent(HLSS.this, SCampusPictureGallery.class); // once clicked on move user to sighthill campus pg window
    			
    			startActivity(movetoSCampusPictureGallery);
    		}
        });
       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hlss, menu);
		return true;
	}

}
