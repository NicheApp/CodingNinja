package com.example.codingninja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.codingninja.fragments.attendence;
import com.example.codingninja.fragments.blank;
import com.example.codingninja.fragments.timetable;
import com.example.codingninja.fragments.wall;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedfragment =null;
                switch (menuItem.getItemId())
                {

                    case R.id.wall:

                     selectedfragment=new wall();
                     break;
                    case R.id.timetable:
                        selectedfragment=new timetable();
                        break;
                    case R.id.attendance:
                        selectedfragment=new attendence();
                        break;
                    case R.id.blank:
                        selectedfragment=new blank();
                        break;
 }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedfragment).commit();
                return true;
            }
        });







    }
}
