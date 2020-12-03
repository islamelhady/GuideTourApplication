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

public class AirportFragment extends Fragment {

    private Adapter adapter;
    private List<ModelList> list;

    public AirportFragment() {
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
        int[] images = {R.drawable.hamad_international_airport,
                R.drawable.hong,
                R.drawable.seoul_incheon,
                R.drawable.singapore_changi,
                R.drawable.tokyo_haneda,
                R.drawable.kansai_awds};

        list.add(new ModelList("Hamad International Airport", images[0],
                " is the international airport for Doha, capital city of Qatar. The airport has been described as the most architecturally significant terminal complex in the world, as well as being the most luxurious. Hamad was voted the Best Airport in the Middle East,"));
        list.add(new ModelList("Hong", images[1],
                " serves over 100 airlines operating flights to about 180 locations worldwide, including 44 destinations on the Chinese Mainland. It is a former, multiple winner of the Airport of the Year title at the World Airport Awards"));
        list.add(new ModelList("Seoul Incheon", images[2],
                "is an international airport serving the Greater Tokyo Area of Japan. Narita serves as the international hub for Japan Airlines"));
        list.add(new ModelList("Singapore Changi", images[3],
                " in Nagoya, better known as Centrair. The airport has a large domestic traffic percentage, with a number of regional routes operated to Asian cities. Longer haul routes include Helsinki, Frankfurt, Honolulu and Detroit"));
        list.add(new ModelList("Tokyo Haneda", images[4],
                " is the main international airport of the Netherlands. Schiphol Airport is the third-busiest airport in Europe in terms of passenger volume and the busiest in Europe in terms of aircraft movement. Schiphol Airport was voted the Best Airport in Western Europe in 2020."));
        list.add(new ModelList("Kasnsai Awds", images[5],
                "opened in 1994, and has since become an important international hub for Japan, providing one of the largest networks for both domestic and international routes with 24 hour operations. Kansai was named"));

        adapter.notifyDataSetChanged();
    }

}
