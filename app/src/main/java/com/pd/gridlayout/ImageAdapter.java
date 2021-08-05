package com.pd.gridlayout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mcon;
    public ImageAdapter(Context c) {
       mcon = c;

    }

    public Integer[] mthumb_Ids = {

            R.drawable.pink2,
            R.drawable.purplerose,
            R.drawable.rose1,
            R.drawable.white,
            R.drawable.babu,
            R.drawable.babu2
    };

    @Override
    public int getCount() {
        //return 0;
        return mthumb_Ids.length ;

    }

    @Override
    public Object getItem(int i) {
        return mthumb_Ids[i];
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mcon);
        imageView.setImageResource(mthumb_Ids[i]);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(400,400));
        return imageView;
    }
}
