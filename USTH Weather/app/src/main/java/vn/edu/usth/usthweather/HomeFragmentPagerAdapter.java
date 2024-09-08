package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import vn.edu.usth.usthweather.weather.WeatherAndForecastFragment;
import vn.edu.usth.usthweather.weather.WeatherAndForecastFragment1;
import vn.edu.usth.usthweather.weather.WeatherAndForecastFragment2;

public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private final String[] titles = new String[]{"Hanoi, Vietnam", "Paris, France","Tokyo, Japan"};
    public HomeFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0 : return new WeatherAndForecastFragment();
           case 1 : return new WeatherAndForecastFragment1();
           case 2 : return new WeatherAndForecastFragment2();
       }
       return new Fragment();
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
