package com.example.mitspickup;

public class CanteenReso {
    private String canteen_name;
    private String canteen_description;
    private int canteen_image;

    private String canteen_rate;

    private CanteenReso(String canteen_name,String canteen_description,int canteen_image,String canteen_rate){
        this.canteen_name=canteen_name;
        this.canteen_description=canteen_description;
        this.canteen_image=canteen_image;
        this.canteen_rate=canteen_rate;
    }
    public static final CanteenReso[] canteen={
      new CanteenReso("Pav bhaji","Mumbai street food of vegetable curry and bread rolls.",R.drawable.bhaji_canteen,"₹40"),
      new CanteenReso("Butter masala dosa","Crispy crepe with potato filling and tomato sauce.",R.drawable.dosa_canteen,"₹50"),
      new CanteenReso("Veg roll","Flatbread wrap with spicy vegetable and cheese mixture.",R.drawable.roll_canteen,"₹25"),
      new CanteenReso("Masala Maggi","Instant noodles with spices, vegetables, and sauces.",R.drawable.maggi_canteen,"₹60"),
      new CanteenReso("Samosa","Fried or baked pastry with savory potato filling.",R.drawable.samosa_food,"₹10")
    };

    public String getCanteen_name() {
        return canteen_name;
    }

    public String getCanteen_description() {
        return canteen_description;
    }

    public int getCanteen_image() {
        return canteen_image;
    }

    public String getCanteen_rate() {
        return canteen_rate;
    }
}
