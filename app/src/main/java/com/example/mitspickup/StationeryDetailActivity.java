package com.example.mitspickup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StationeryDetailActivity extends AppCompatActivity {

    public static final String EXTRA_STATIONERY_ID="stationeryId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stationery_detail);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int itemId=(Integer)getIntent().getExtras().get(EXTRA_STATIONERY_ID);
        String foodName=StationeryReso.stationery[itemId].getStationery_name();
        String foodRate=StationeryReso.stationery[itemId].getStationery_rate();
        String foodDetail=StationeryReso.stationery[itemId].getStationery_description();
        int foodImage=StationeryReso.stationery[itemId].getStationery_image();

        TextView itemName=findViewById(R.id.item_name);
        TextView itemRate=findViewById(R.id.item_price);
        TextView itemDetail=findViewById(R.id.item_description);
        ImageView itemImage=findViewById(R.id.item_image);

        itemName.setText(foodName);
        itemRate.setText(foodRate);
        itemDetail.setText(foodDetail);
        itemImage.setImageDrawable(ContextCompat.getDrawable(this,foodImage));
        itemImage.setContentDescription(foodName);
    }
}