package com.example.mitspickup;

public class StationeryReso {
    private String stationery_name;
    private String stationery_description;
    private int stationery_image;
    private String stationery_rate;
    private StationeryReso(String stationery_name,String stationery_description,int stationery_image,String stationery_rate){
        this.stationery_name=stationery_name;
        this.stationery_description=stationery_description;
        this.stationery_image=stationery_image;
        this.stationery_rate=stationery_rate;
    }
    public static final StationeryReso[] stationery={
            new StationeryReso("Stapler","Effortlessly bind your papers together with our quick and efficient stapler!",R.drawable.stapler_stationery,"₹30"),
            new StationeryReso("Push-pin","Pin your ideas to the world, one push-pin at a time!",R.drawable.pin_stationery,"₹10"),
            new StationeryReso("Highlighter","Make important notes stand out with our vibrant highlighters!",R.drawable.highlighter_stationery,"₹15"),
            new StationeryReso("Pencil","Sketch, write, erase, repeat – all with our versatile pencils!",R.drawable.pencil_stationery,"₹10"),
            new StationeryReso("Notebook","Jot down your brightest ideas in our stylish and durable notebooks!",R.drawable.notebook_stationery,"₹30"),
            new StationeryReso("Eraser sharpener","Erase mistakes and sharpen focus with dual-action eraser sharpener!",R.drawable.erasers_stationery,"₹5"),
            new StationeryReso("Fountain pen","Experience smooth and elegant writing with our premium fountain pens!",R.drawable.fountain_stationery,"₹50"),
            new StationeryReso("Marker","Boldly express yourself with our colorful and vivid markers!",R.drawable.marker_stationery,"₹20"),
            new StationeryReso("Scissors","Cut through the ordinary; precision and comfort in every snip!",R.drawable.scissors_stationery,"₹30"),
            new StationeryReso("Paper","Bring your ideas to life on our high-quality paper – clarity in every sheet!",R.drawable.paper_stationery,"₹10")
    };

    public String getStationery_name() {
        return stationery_name;
    }

    public String getStationery_description() {
        return stationery_description;
    }

    public int getStationery_image() {
        return stationery_image;
    }

    public String getStationery_rate() {
        return stationery_rate;
    }
}
