// STUDENT SUPPORT
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import lewis.acenapiermobile.R;

public class StudentSupport extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_support);
	     // BUTTON TO MOVE TO ACADEMIC SKILLS WINDOW
		Button AcademicSkills = (Button) findViewById(R.id.button1);
        AcademicSkills.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoAcademicSkills = new Intent(StudentSupport.this, AcademicSkills.class); // once clicked on move user to academic skills window
    			
    			startActivity(movetoAcademicSkills);
    		}
        });
        // BUTTON TO MOVE TO CAREERS WINDOW
        Button Careers = (Button) findViewById(R.id.btnCareers);
        Careers.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoCareers = new Intent(StudentSupport.this, Careers.class); // once clicked on move user to careers window
    			
    			startActivity(movetoCareers);
    		}
        });
        // BUTTON TO MOVE TO CONFIDENT FUTURES WINDOW
        Button ConfidentFutures = (Button) findViewById(R.id.Button02);
        ConfidentFutures.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoConfidentFutures = new Intent(StudentSupport.this, ConfidentFutures.class); // once clicked on move user to confident futures window
    			
    			startActivity(movetoConfidentFutures);
    		}
        });
        // BUTTON TO MOVE TO CONSUELLING AND WELLBEING WINDOW
        Button CandMWB = (Button) findViewById(R.id.Button03);
        CandMWB.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoCandMWB = new Intent(StudentSupport.this, CandMWellbeing.class); // once clicked on move user to consuelling and wellbeing window
    			
    			startActivity(movetoCandMWB);
    		}
        });
        // BUTTON TO MOVE TO DISABILITY AND INCLUSION WINDOW
        Button DisAndIns = (Button) findViewById(R.id.Button04);
        DisAndIns.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoDisAndIns = new Intent(StudentSupport.this, DisAndIns.class); // once clicked on move user to disability and inclusion window
    			
    			startActivity(movetoDisAndIns);
    		}
        });
        // BUTTON TO MOVE TO EXCHANGES WINDOW
        Button Exchanges = (Button) findViewById(R.id.Button05);
        Exchanges.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoExchanges = new Intent(StudentSupport.this, Exchanges.class); // once clicked on move user to exchanges window
    			
    			startActivity(movetoExchanges);
    		}
        });
        // BUTTON TO MOVE TO IT WINDOW
        Button IT = (Button) findViewById(R.id.Button12);
        IT.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoIT = new Intent(StudentSupport.this, IT.class); // once clicked on move user to it window
    			
    			startActivity(movetoIT);
    		}
        });
        // BUTTON TO MOVE TO LIBRARY WINDOW
        Button Library = (Button) findViewById(R.id.Button11);
        Library.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoLibrary = new Intent(StudentSupport.this, Library.class); // once clicked on move user to library window
    			
    			startActivity(movetoLibrary);
    		}
        });
        // BUTTON TO MOVE TO MENTORING WINDOW
        Button Mentoring = (Button) findViewById(R.id.Button06);
        Mentoring.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoMentoring = new Intent(StudentSupport.this, Mentoring.class); // once clicked on move user to mentoring window
    			
    			startActivity(movetoMentoring);
    		}
        });
        // BUTTON TO MOVE TO MONEY WINDOW
        Button Money = (Button) findViewById(R.id.Button07);
        Money.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoMoney = new Intent(StudentSupport.this, Money.class); // once clicked on move user to money window
    			
    			startActivity(movetoMoney);
    		}
        });
        // BUTTON TO MOVE TO NSA WINDOW
        Button NSA = (Button) findViewById(R.id.Button08);
        NSA.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoNSA = new Intent(StudentSupport.this, NSA.class); // once clicked on move user to nsa window
    			
    			startActivity(movetoNSA);
    		}
        });
        // BUTTON TO MOVE TO PDT WINDOW
        Button PDT = (Button) findViewById(R.id.Button09);
        PDT.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoPDT = new Intent(StudentSupport.this, PDT.class); // once clicked on move user to pdt window
    			
    			startActivity(movetoPDT);
    		}
        });
        // BUTTON TO MOVE TO STUDENT HUB WINDOW
        Button StudentHub = (Button) findViewById(R.id.btnSHub);
        StudentHub.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoStudentHub = new Intent(StudentSupport.this, StudentHub.class); // once clicked on move user to student hub window
    			
    			startActivity(movetoStudentHub);
    		}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_student_support, menu);
		return true;
	}

}
