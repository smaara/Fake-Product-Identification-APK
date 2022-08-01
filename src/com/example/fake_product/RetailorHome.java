package com.example.fake_product;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RetailorHome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_retailor_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.retailor_home, menu);
		return true;
	}

}
