package com.example.day7;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.day7.fragments.Fragment1;
import com.example.day7.fragments.Fragment2;
import com.example.day7.fragments.Fragment3;

public class FragAdapt extends FragmentPagerAdapter {
    public FragAdapt(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new Fragment1();

            case 1:
                return new Fragment2();

            case 2:
                return new Fragment3();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
