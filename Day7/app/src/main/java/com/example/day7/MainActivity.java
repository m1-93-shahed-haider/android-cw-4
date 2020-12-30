package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager vp = findViewById(R.id.vp);
        TabLayout tb = findViewById(R.id.tb);
        tb.setupWithViewPager(vp);

        tb.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        tb.getTabAt(1).setIcon(R.drawable.ic_baseline_grade_24);
        tb.getTabAt(2).setIcon(R.drawable.ic_baseline_import_contacts_24);

        FragAdapt adapter = new FragAdapt(getSupportFragmentManager());
        vp.setAdapter(adapter);




       // tb.getTabAt(0).getIcon(R.drawable.ic_baseline_home_24);



    }

}