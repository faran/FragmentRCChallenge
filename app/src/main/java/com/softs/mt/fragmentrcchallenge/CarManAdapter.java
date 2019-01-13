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

    private ArrayList<CarMan> carMan;
    ItemClick activity;

    public interface ItemClick{
        void onItemClicked(int index);
    }

    public CarManAdapter(Context context, ArrayList<CarMan> list){
        carMan = list;
        activity = (ItemClick) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivLogo;
        TextView tvModel, tvOwner;
        ItemClick activity;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivLogo = itemView.findViewById(R.id.ivLogo);
            tvModel = itemView.findViewById(R.id.tvModel);
            tvOwner = itemView.findViewById(R.id.tvOwner);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.ivLogo.setImageResource(carMan.get(i).getCarLogo());
        viewHolder.itemView.setTag(carMan.get(i));
        viewHolder.tvModel.setText(carMan.get(i).getCarModel());
        viewHolder.tvOwner.setText(carMan.get(i).getOwnerName());

    }

    @Override
    public int getItemCount() {
        return carMan.size();
    }
}
