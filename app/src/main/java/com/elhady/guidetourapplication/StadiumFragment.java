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

public class StadiumFragment extends Fragment {

    private Adapter adapter;
    private List<ModelList> list;

    public StadiumFragment() {
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

        prepareList();

        return rootView;
    }

    private void prepareList() {
        int[] images = {R.drawable.old_trafford,
                R.drawable.estadio_azteco,
                R.drawable.santiago_bernabeu,
                R.drawable.anfield_road,
                R.drawable.san_siro};

        list.add(new ModelList("Old Trafford", images[0],
                "The Camp Nou is Europe's largest football stadium(Capacity: 98,757) and is home to one of the great football teams. Barcelona's motto “mes que un club” (more than a club) is iconic throughout the footballing world, and their stadium is a huge part of everything Barcelona stands for."));
        list.add(new ModelList("Estadio Azteco", images[1],
                "Located in the middle of the city. One can easily find buses to Delhi or Chandigarh from here."));
        list.add(new ModelList("Anfield Road", images[2],
                "Though not a huge stadium in terms of capacity by any means (Capacity: 45,276), the legendary atmosphere at Anfield known throughout the world makes the home of Liverpool one of the great stadiums."));
        list.add(new ModelList("Santiago Bernabeu", images[2],
                "The Santiago Bernabeu is home to one of Europe's most successful club. With nine European titles to their name, Real Madrid's place in the upper echelons of world football is secure, and there could be no more fitting venue for such a club to play."));
        list.add(new ModelList("San Siro", images[2],
                "Known as the San Siro, the multipurpose stadium is home to two football heavyweights and archrivals AC Milan and Internazionale. It is the country's most famous and largest ground."));

        adapter.notifyDataSetChanged();
    }
}
