package com.example.corontineapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.corontineapp.databinding.ActivityMainMenuBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainMenuActivity extends AppCompatActivity {
    ActivityMainMenuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //----------default home fragment---------//
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, new HomeFragment());
        transaction.commit();

        binding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId())
                {
                    case R.id.menu_home:
                        transaction.replace(R.id.fragmentContainer, new HomeFragment());
                        transaction.commit();
                        break;
                    case R.id.menu_profile:
                        transaction.replace(R.id.fragmentContainer, new ProfileFragment());
                        transaction.commit();
                        break;
                    case R.id.menu_diagnosis:
                        transaction.replace(R.id.fragmentContainer, new DiagnosisFragment());
                        transaction.commit();
                        break;
                    case R.id.menu_call:
                        transaction.replace(R.id.fragmentContainer, new CallFragment());
                        transaction.commit();
                        break;
                }
                return true;
            }
        });

    }
}