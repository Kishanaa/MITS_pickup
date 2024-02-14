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

public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        View root use karna pda kyuki coordinator layout recycler view ki id ni de rha tha
        View root= inflater.inflate(R.layout.fragment_food,container,false);
        RecyclerView foodRecycler=root.findViewById(R.id.fast_food_recycler);
//        set names
        String[] foodName=new String[FastFoodReso.fastFood.length];
        for (int i =0;i<FastFoodReso.fastFood.length;i++){
            foodName[i]=FastFoodReso.fastFood[i].getFood_name();
        }
//        set image
        int[] foodImage= new int[FastFoodReso.fastFood.length];
        for (int i=0;i<FastFoodReso.fastFood.length;i++){
            foodImage[i]=FastFoodReso.fastFood[i].getFood_image();
        }
//        pass the array to adapter
        CaptionedImageAdapter adapter=new CaptionedImageAdapter(foodName,foodImage);
        foodRecycler.setAdapter(adapter);

//        We’re going to display the CardViews in a grid with two columns, so we’re using a GridLayoutManager.
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        foodRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImageAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent=new Intent(getActivity(), FoodDetailActivity.class);
                intent.putExtra(FoodDetailActivity.EXTRA_FOOD_ID,position);
                getActivity().startActivity(intent);
            }
        });

        return root;
//        return inflater.inflate(R.layout.fragment_stationery, container, false);
    }
}