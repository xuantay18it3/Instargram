package com.dev.kd1412.instargram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.dev.kd1412.instargram.Adapter.NewsfeedAdapter;
import com.dev.kd1412.instargram.Fragment.HomeFragment;
import com.dev.kd1412.instargram.Fragment.SearchFragment;
import com.dev.kd1412.instargram.Model.Newsfeed;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvNewsfeed;
    private NewsfeedAdapter newsfeedAdapter;
    private List<Newsfeed> arr_newsfeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setWidget();
    }

    private void setWidget() {
        rcvNewsfeed = findViewById(R.id.rcvNewsfeed);
        arr_newsfeed = new ArrayList<>();
        Newsfeed newsfeed = new Newsfeed("avt", "content", "_minminn_", "Chao em co gai thang tu");
        arr_newsfeed.add(newsfeed);
        arr_newsfeed.add(newsfeed);
        arr_newsfeed.add(newsfeed);
        arr_newsfeed.add(newsfeed);
        arr_newsfeed.add(newsfeed);
        arr_newsfeed.add(newsfeed);

        rcvNewsfeed.setHasFixedSize(true);
        rcvNewsfeed.setLayoutManager(new LinearLayoutManager(this));

        newsfeedAdapter = new NewsfeedAdapter(arr_newsfeed, this);

        rcvNewsfeed.setAdapter(newsfeedAdapter);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment = null;
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    fragment = new HomeFragment();
                    break;
                case R.id.nav_search:
                    fragment = new SearchFragment();
                    break;
                default:
                    fragment = new HomeFragment();
            }
            getFragmentManager().beginTransaction().replace(R.id.nav_content, fragment).addToBackStack(null).setBreadCrumbShortTitle("").commit();
            return true;
        }
    };
}
