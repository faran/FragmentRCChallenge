package com.softs.mt.fragmentrcchallenge;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fkha0003 on 11/01/2019.
 */

public class CarManAdapter extends RecyclerView.Adapter<CarManAdapter.ViewHolder>{

    private ArrayList<CarMan> car;
    ItemClick activity;

    public interface ItemClick{
        void onItemClicked(int index);
    }

    public CarManAdapter(Context context, ArrayList<CarMan> list){
        car = list;
        activity = (ItemClick) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivLogo;
        TextView tvModel, tvOwner, tvTel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivLogo = itemView.findViewById(R.id.ivLogo);
            tvModel = itemView.findViewById(R.id.tvModel);
            tvOwner = itemView.findViewById(R.id.tvOwner);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onItemClicked(car.indexOf(view.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public CarManAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarManAdapter.ViewHolder viewHolder, int i) {

        viewHolder.itemView.setTag(car.get(i));
        viewHolder.tvModel.setText(car.get(i).getCarModel());
        viewHolder.tvOwner.setText(car.get(i).getOwnerName());

        if(car.get(i).getCarLogo().equals("Volkswagen")){
            viewHolder.ivLogo.setImageResource(R.drawable.volkswagen);
        }else if(car.get(i).getCarLogo().equals("Mercedes")){
            viewHolder.ivLogo.setImageResource(R.drawable.mercedes);
        }else {
            viewHolder.ivLogo.setImageResource(R.drawable.nissan);
        }
    }

    @Override
    public int getItemCount() {
        return car.size();
    }
}
