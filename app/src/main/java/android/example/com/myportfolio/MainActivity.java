package android.example.com.myportfolio;

import android.example.com.myportfolio.controller.DevPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // no need to cast since AS 3.0.1
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new DevPagerAdapter(getSupportFragmentManager()));

    }
}
