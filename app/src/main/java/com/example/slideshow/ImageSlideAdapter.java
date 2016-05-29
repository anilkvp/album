package com.example.slideshow;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class ImageSlideAdapter extends PagerAdapter {

	private int[] images;
	private Context context;
	private LayoutInflater layoutInflater;
	private TouchImageView imageView;

	public ImageSlideAdapter(int[] images, Context context) {
		super();
		this.images = images;
		this.context = context;
	}

	@Override
	public int getCount() {
		return images.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object obj) {
		return view == (RelativeLayout) obj;
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {

		layoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View viewItem = layoutInflater.inflate(R.layout.view_item, container,
				false);

		imageView = (TouchImageView) viewItem.findViewById(R.id.image);
		imageView.setImageResource(images[position]);

		((ViewPager) container).addView(viewItem);

		return viewItem;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		((ViewPager) container).removeView((RelativeLayout) object);
	}

}
