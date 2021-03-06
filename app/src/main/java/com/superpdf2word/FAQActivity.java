package com.superpdf2word;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.view.MenuItem;

public class FAQActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fqa);
		ActionBar actionbar = getActionBar();
		actionbar.setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {  
	    switch (item.getItemId()) {  
	    case android.R.id.home:  
	        Intent upIntent = NavUtils.getParentActivityIntent(this);  
	        if (NavUtils.shouldUpRecreateTask(this, upIntent)) {  
	            TaskStackBuilder.create(this)  
	                    .addNextIntentWithParentStack(upIntent)  
	                    .startActivities();  
	        } else {  
	            upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  
	            NavUtils.navigateUpTo(this, upIntent);  
	        }  
	        return true; 
	        default:
	        	return true;
	    }  
	}
}