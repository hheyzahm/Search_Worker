package com.example.searchworker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.searchworker.Framents.CV_Builder_Fragment;
import com.example.searchworker.Framents.Edit__CV_Fragment;
import com.example.searchworker.Framents.Search_worker_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    // BottomNavigationView
    BottomNavigationView navView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//loading the default fragment
        loadFragment(new CV_Builder_Fragment());
        navView = findViewById(R.id.bottom_nav_view);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            Fragment fragment = null;

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.CV_Builder:
                        fragment = new CV_Builder_Fragment();
                        //  getSupportFragmentManager().beginTransaction().replace(R.id.add_target_details_frame_layout,new add_target_Fragment()).commit();
                        break;
                    case R.id.Edit_CV:
                        fragment = new Edit__CV_Fragment();
                        //  getSupportFragmentManager().beginTransaction().replace(R.id.add_target_details_frame_layout,new add_target_Fragment()).commit();
                        break;
                    case R.id.Search_worker:
                        fragment = new Search_worker_Fragment();

                        //getSupportFragmentManager().beginTransaction().replace(R.id.add_target_details_frame_layout,new Edit_fragment_Fragment()).commit();
                        break;
                }
                return loadFragment(fragment);
            }
        });


    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragment)
                    .commit();
            return true;
        }
        return false;
    }


}