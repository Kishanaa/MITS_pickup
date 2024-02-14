package com.example.mitspickup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodDetailActivity extends AppCompatActivity {

//    private double itemRate;
    public static final String EXTRA_FOOD_ID="foodId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int itemId=(Integer)getIntent().getExtras().get(EXTRA_FOOD_ID);
        String foodName=FastFoodReso.fastFood[itemId].getFood_name();
        String foodRate=FastFoodReso.fastFood[itemId].getFood_rate();
        String foodDetail=FastFoodReso.fastFood[itemId].getFood_description();
        int foodImage=FastFoodReso.fastFood[itemId].getFood_image();

        TextView itemName=findViewById(R.id.item_name);
        TextView itemRateTextView=findViewById(R.id.item_price);
        TextView itemDetail=findViewById(R.id.item_description);
        ImageView itemImage=findViewById(R.id.item_image);

        itemName.setText(foodName);
        itemRateTextView.setText(foodRate);
        itemDetail.setText(foodDetail);
        itemImage.setImageDrawable(ContextCompat.getDrawable(this,foodImage));
        itemImage.setContentDescription(foodName);

//        Initialize the itemRate variable with the value of the foodRate string, converted to a double
//        itemRate=Double.parseDouble(foodRate);
    }
//    private void onClickPlus(View view){
////        Increment
//        itemRate+=itemRate;
////        Update the itemRate TextView with the new value, formatted as a string
//        TextView itemRateTextView=findViewById(R.id.item_price);
//
//    }
}