package com.a0519.willson.test_cafe2.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.a0519.willson.test_cafe2.Interface.ItemClickListener;
import com.a0519.willson.test_cafe2.R;

/**
 * Created by Willson Leow on 24/11/2017.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView food_name;
    public ImageView food_image;
    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public FoodViewHolder(View itemView) {
        super(itemView);

        food_name = (TextView)itemView.findViewById(R.id.food_name);
        food_image = (ImageView)itemView.findViewById(R.id.food_image);
        itemView.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
