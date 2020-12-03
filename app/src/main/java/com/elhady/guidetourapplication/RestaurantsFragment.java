package com.elhady.guidetourapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsFragment extends Fragment {

    private Adapter adapter;
    private List<ModelList> list;

    public RestaurantsFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        list = new ArrayList<>();
        adapter = new Adapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        prepareView();
        return rootView;
    }

    private void prepareView() {
        int[] images = {R.drawable.breakfast,
                R.drawable.bullona,
                R.drawable.burgers,
                R.drawable.lebanese,
                R.drawable.leonardo,
                R.drawable.riva,
                R.drawable.royal,
                R.drawable.santoku,
                R.drawable.hilton};
        list.add(new ModelList("Breakfast", images[0],
                "Breakfast is known as North India's first Haveli known for its multi cuisine food, cultural celebrations, vents,"));
        list.add(new ModelList("Bullona", images[1],
                "Bullona Star is a Stylish & Simple 24x7 happening place to come & enjoy with family based on National Highway "));
        list.add(new ModelList("Burgers", images[2],
                "Daana Paani is a one-stop food destination, offering the tempting flavours of street foods"));
        list.add(new ModelList("Lebanese", images[3],
                "Burgers is Fast-food chain known for its buckets of fried chicken, plus wings & sides."));
        list.add(new ModelList("Riva", images[4],
                "Fast-food chain known for its buckets of fried chicken, plus wings & sides."));
        list.add(new ModelList("Leonardo", images[5],
                "Riva isFast-food chain known for its buckets of fried chicken, plus wings & sides."));
        list.add(new ModelList("Royal", images[6],
                "Leonardo is Fast-food chain known for its buckets of fried chicken, plus wings & sides."));
        list.add(new ModelList("Santoku", images[7],
                " Santoku Fast-food chain known for its buckets of fried chicken, plus wings & sides."));
        list.add(new ModelList("Hilton", images[8],
                " Hilton Fast-food chain known for its buckets of fried chicken, plus wings"));
        adapter.notifyDataSetChanged();

    }
}
