package com.mohammedalsamawi.fabe;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mohammedalsamawi on 4/5/2016.
 */
public class swipe extends PagerAdapter {

    private int[] civil_Gallary ={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public swipe(Context ctx)
    {

        this.ctx = ctx;
    }

    @Override
    public int getCount(){

        return civil_Gallary.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object o) {
        return (view==(LinearLayout)o);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater =(LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view =layoutInflater.inflate(R.layout.activity_swipe,container,false);
        ImageView imageView =(ImageView)item_view.findViewById(R.id.image);
        TextView textView = (TextView)item_view.findViewById(R.id.image_count);
        imageView.setImageResource(civil_Gallary[position]);
        textView.setText("    Civil Engineering Gallary  ");
        container.addView(item_view);
        return item_view;



    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);

    }
}
