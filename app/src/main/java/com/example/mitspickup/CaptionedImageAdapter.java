package com.example.mitspickup;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class CaptionedImageAdapter extends RecyclerView.Adapter<CaptionedImageAdapter.ViewHolder> {
    private String[] captions;
    private int[] imageIds;
    private Listener listener;
    interface Listener{
        void onClick(int position);
    }

    @NonNull
    @Override
    public CaptionedImageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv=((CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.food_card_view_adapter,parent,false));
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder,final int position) {
        CardView cardView=holder.cardView;
        ImageView imageView=cardView.findViewById(R.id.food_item_list_image);
        Drawable drawable= ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);

        TextView textView=cardView.findViewById(R.id.food_item_list_name);
        textView.setText(captions[position]);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener!=null){
                    listener.onClick(position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public void setListener(Listener listener){
        this.listener=listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView v){
            super(v);
            cardView=v;
        }
    }

    public CaptionedImageAdapter(String[] captions,int[] imageIds){
        this.captions=captions;
        this.imageIds=imageIds;
    }
}
