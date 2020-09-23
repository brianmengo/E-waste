package com.ewaste.collection.fragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;


import com.ewaste.collection.R;
import com.ewaste.collection.constants.BaseApp;
import com.ewaste.collection.item.FavouriteItem;
import com.ewaste.collection.models.FavouriteModel;
import com.ewaste.collection.models.User;
import com.ewaste.collection.utils.DatabaseHelper;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class FavouriteFragment extends Fragment {

    public FavouriteFragment(){

    }
    View getView;
    Context context;
    ArrayList<FavouriteModel> listItem;
    public RecyclerView recyclerView;
    FavouriteItem adapter;
    DatabaseHelper databaseHelper;
    RelativeLayout notFound;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getView = inflater.inflate(R.layout.fragment_recycle, container, false);
        String[] myServices = { "E-waste Collection",
                                "E-Waste Management",
                                "E-Waste Recycling",
                                "Data Destruction"};
        ListView listView =getView.findViewById(R.id.listviewservice);
        ArrayAdapter<String> serviceAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                myServices

        );
        listView.setAdapter(serviceAdapter);


        return getView;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void displayData() {
        }


}
