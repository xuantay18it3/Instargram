package com.dev.kd1412.instargram.Fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.kd1412.instargram.Adapter.NewsfeedAdapter;
import com.dev.kd1412.instargram.Model.Newsfeed;
import com.dev.kd1412.instargram.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView rcvList;
    List<Newsfeed> arrList;
    NewsfeedAdapter newsfeedAdapter;
    private Context context = this.getActivity();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        rcvList = view.findViewById(R.id.rcvList);
        arrList = new ArrayList<>();
        Newsfeed newsfeed = new Newsfeed("avt", "content", "nana",
                "Chao thang tu");
        arrList.add(newsfeed);
        arrList.add(newsfeed);
        arrList.add(newsfeed);
        arrList.add(newsfeed);
        arrList.add(newsfeed);
        arrList.add(newsfeed);

        rcvList.setHasFixedSize(true);
        rcvList.setLayoutManager(new LinearLayoutManager(context));

        newsfeedAdapter = new NewsfeedAdapter(arrList, context);

        rcvList.setAdapter(newsfeedAdapter);
        return view;

    }
}


