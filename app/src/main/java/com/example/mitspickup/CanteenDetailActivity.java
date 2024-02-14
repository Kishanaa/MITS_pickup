package com.example.mitspickup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CanteenDetailActivity extends AppCompatActivity {

    public static final String EXTRA_CANTEEN_ID="canteenId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_detail);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int itemId=(Integer)getIntent().getExtras().get(EXTRA_CANTEEN_ID);
        String foodName=CanteenReso.canteen[itemId].getCanteen_name();
        String foodRate=CanteenReso.canteen[itemId].getCanteen_rate();
        String foodDetail=CanteenReso.canteen[itemId].getCanteen_description();
        int foodImage=CanteenReso.canteen[itemId].getCanteen_image();

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