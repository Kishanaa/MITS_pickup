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

public class CanteenFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_canteen,container,false);
        RecyclerView canteenRecycler=root.findViewById(R.id.canteen_recycler);

        String[] name=new String[CanteenReso.canteen.length];
        for (int i=0;i<CanteenReso.canteen.length;i++){
            name[i]=CanteenReso.canteen[i].getCanteen_name();
        }
        int[] image=new int[CanteenReso.canteen.length];
        for (int i=0;i<CanteenReso.canteen.length;i++){
            image[i]=CanteenReso.canteen[i].getCanteen_image();
        }

        CaptionedImageAdapter adapter=new CaptionedImageAdapter(name,image);
        canteenRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        canteenRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImageAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent=new Intent(getActivity(), CanteenDetailActivity.class);
                intent.putExtra(CanteenDetailActivity.EXTRA_CANTEEN_ID,position);
                getActivity().startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return root;
    }
}