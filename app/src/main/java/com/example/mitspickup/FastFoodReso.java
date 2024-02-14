package com.example.mitspickup;

public class FastFoodReso {
    private String food_name;
    private String food_description;
    private int food_image;
    private String food_rate;
    private FastFoodReso(String food_name,String food_description,int food_image,String food_rate){
        this.food_name=food_name;
        this.food_description=food_description;
        this.food_image=food_image;
        this.food_rate=food_rate;
    }
    public static final FastFoodReso[] fastFood={
     new FastFoodReso("Burger","Soft buns that are served with patty, lettuce, tomato, and onion together.",R.drawable.burger_food,"₹40"),
     new FastFoodReso("Pizza","A thin, flat round bread that is baked with vegetables and cheese on the top.",R.drawable.pizza_food,"₹99"),
     new FastFoodReso("Chowmein","Stir-fried noodles along with vegetables and sometimes meat or tofu.",R.drawable.chowmein_food,"₹60"),
     new FastFoodReso("Patties","A small flat bread-shaped food item that is generally filled with minced or finely chopped potato, vegetables.",R.drawable.patties_food,"₹30"),
     new FastFoodReso("French Fries","These are thinly sliced potato pieces that are deep-fried or air-fried.",R.drawable.fries_food,"₹30"),
     new FastFoodReso("Sandwich","A food item made using bread. You can add cheese, meat or vegetables between them to make them taste delicious.",R.drawable.sandwich_food,"₹30"),
     new FastFoodReso("Soda","A canned beverage or energy soda that is served chilled.",R.drawable.soda_food,"₹15"),
     new FastFoodReso("Waffle","A sweet dish made from semi-hard dough which is cooked between two hot plates that are patterned to give a specific size, shape, and surface impression.",R.drawable.waffle_food,"₹50"),
     new FastFoodReso("Pastry","Edible items made from flour, sugar, and baking agents.",R.drawable.pastry_food,"₹60"),
     new FastFoodReso("TACOS"," Mexican dish of folded tortilla with various fillings.",R.drawable.tocos_food,"₹70")
    };

    public String getFood_name() {
        return food_name;
    }

    public String getFood_description() {
        return food_description;
    }

    public int getFood_image() {
        return food_image;
    }

    public String getFood_rate() {
        return food_rate;
    }
}
