package android.example.com.myportfolio;

import android.content.Intent;
import android.content.res.Resources;
import android.example.com.myportfolio.controller.DevPagerAdapter;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TextView getInTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getInTouch = findViewById(R.id.get_in_touch);
        getInTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("onclicklistener", "before it gets messy");
                // here you got errors because you did not use the app context.
                // String pippo = getResources().getString(R.string.phoneNo);
                String dial = "tel: " + getResources().getString(R.string.phoneNo);
                Log.d("onclicklistener", "dial string: " + String.valueOf(dial));
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
            }
        });

        // no need to cast since AS 3.0.1
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new DevPagerAdapter(getSupportFragmentManager()));

        // connect the tablayout with the viewpager
        TabLayout tabs = findViewById(R.id.tabLayoutId);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabTextColors(Color.GRAY,Color.parseColor("white"));
    }
}
