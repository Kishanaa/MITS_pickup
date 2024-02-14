package com.example.mitspickup;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StationeryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root=inflater.inflate(R.layout.fragment_stationery,container,false);
        RecyclerView stationeryRecycler=root.findViewById(R.id.stationery_recycler);

        String[] name=new String[StationeryReso.stationery.length];
        for (int i=0;i<StationeryReso.stationery.length;i++){
            name[i]=StationeryReso.stationery[i].getStationery_name();
        }
        int[] image=new int[StationeryReso.stationery.length];
        for (int i=0;i<StationeryReso.stationery.length;i++){
            image[i]=StationeryReso.stationery[i].getStationery_image();
        }

        CaptionedImageAdapter adapter=new CaptionedImageAdapter(name,image);
        stationeryRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        stationeryRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImageAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent=new Intent(getActivity(), StationeryDetailActivity.class);
                intent.putExtra(StationeryDetailActivity.EXTRA_STATIONERY_ID,position);
                getActivity().startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return root;
    }
}