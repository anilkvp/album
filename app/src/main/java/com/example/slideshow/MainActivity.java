package com.example.slideshow;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends Activity {

	final String test = null;

	PagerAdapter pagerAdapter = null;

	// TODO Add images here.s
	int[] images = { R.drawable.ax1, R.drawable.ax2};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewPager viewPager = (ViewPager) findViewById(R.id.slide_pane);
		pagerAdapter = new ImageSlideAdapter(images, this);
		viewPager.setAdapter(pagerAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
