package com.elhady.guidetourapplication;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new StadiumFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new AirportFragment();
            case 3:
                return new RestaurantsFragment();
            case 4:
                return new FamousFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.stadium_fragment);
            case 1:
                return context.getString(R.string.hotels_fragment);
            case 2:
                return context.getString(R.string.airport_fragment);
            case 3:
                return context.getString(R.string.restaurants_fragment);
            case 4:
                return context.getString(R.string.famous_fragment);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
