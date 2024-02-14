package com.example.mitspickup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        Attach sectionPagerAdapter to viewpager2
        SectionPagerAdapter pagerAdapter=new SectionPagerAdapter(getSupportFragmentManager(),getLifecycle());
        ViewPager2 viewPager2=(ViewPager2) findViewById(R.id.pager);
        viewPager2.setAdapter(pagerAdapter);

//        Attach the ViewPager to TabLayout using tabLayout.setupWithViewPager(pager);
        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);

        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("Fast food");
                    break;
                case 1:
                    tab.setText("Stationery");
                    break;
                case 2:
                    tab.setText("Canteen");
            }
        }
        ).attach();
    }

//    set the action in appbar
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
//    if item click method
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id==R.id.rate_us_menu){
//            code we want to perform
            message_me();
        }
        return super.onOptionsItemSelected(item);
    }
//    Open Whatsapp for rating
    private void message_me(){
        String phoneNumber="91+9340505837";
        String message="Rate my app from 1 to 5";
        Intent intent=new Intent(Intent.ACTION_VIEW);

        intent.setData(Uri.parse("https://api.whatsapp.com/send?phone="+phoneNumber+"&text="+message));

        PackageManager packageManager=getPackageManager();
        if (intent.resolveActivity(packageManager)!=null){
            startActivity(intent);
        }else {
            Log.d("MainActivity","WhatsApp not installed");
        }
    }
    public class SectionPagerAdapter extends FragmentStateAdapter{
        public SectionPagerAdapter(FragmentManager fm, Lifecycle lifecycle) {
            super(fm,lifecycle);
        }

        @Override
        public int getItemCount() {
            return 3;
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new FoodFragment();
                case 1:
                    return new StationeryFragment();
                case 2:
                    return new CanteenFragment();
            }
            return null;
        }
    }
}