package com.softs.mt.fragmentrcchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CarManAdapter.ItemClick{

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    Button btnOwnerInfo, btnCarInfo;
    TextView tvInfoName, tvInfoTel;

    private ArrayList<CarMan> mCarManufacturersList;

    CarManAdapter.ItemClick activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOwnerInfo = findViewById(R.id.btnOwnerInfo);
        btnCarInfo = findViewById(R.id.btnCarInfo);
        tvInfoName = findViewById(R.id.tvInfoName);
        tvInfoTel = findViewById(R.id.tvInfoTel);

        mRecyclerView = findViewById(R.id.list);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mCarManufacturersList = new ArrayList<>();
        mCarManufacturersList.add(new CarMan(R.drawable.volkswagen, "POLO", "Chuck Nottis", "0987654321"));
        mCarManufacturersList.add(new CarMan(R.drawable.mercedes, "E200", "Idris Elba","0987654321"));
        mCarManufacturersList.add(new CarMan(R.drawable.nissan, "Almera", "Trevor Noah","0987654321"));
        mCarManufacturersList.add(new CarMan(R.drawable.mercedes, "E180", "Ali Wong","0987654321"));
        mCarManufacturersList.add(new CarMan(R.drawable.volkswagen, "GOLF", "Kathrne Ryan", "0987654321"));
        mCarManufacturersList.add(new CarMan(R.drawable.nissan, "Prius", "Ryan", "0987654321"));

        mAdapter = new CarManAdapter(this , mCarManufacturersList);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public void onItemClicked(int index) {

    }
}
