package com.softs.mt.fragmentrcchallenge;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CarManAdapter.ItemClick{


    ArrayList<CarMan> cars;
    Button btnOwnerInfo, btnCarInfo;
    TextView tvInfoModel, tvName, tvTel;
    ImageView ivMake;
    FragmentManager mFragmentManager;
    Fragment btnFrag, logolistFrag, infoFrag, ownerFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOwnerInfo = findViewById(R.id.btnOwnerInfo);
        btnCarInfo = findViewById(R.id.btnCarInfo);
        ivMake = findViewById(R.id.ivMake);
        tvInfoModel = findViewById(R.id.tvInfoModel);
        tvName = findViewById(R.id.tvName);
        tvTel = findViewById(R.id.tvTel);

        mFragmentManager = getSupportFragmentManager();

        logolistFrag = mFragmentManager.findFragmentById(R.id.logolistFrag);
        btnFrag = mFragmentManager.findFragmentById(R.id.btnFrag);
        infoFrag = mFragmentManager.findFragmentById(R.id.infoFrag);
        ownerFrag = mFragmentManager.findFragmentById(R.id.detailFrag);

        mFragmentManager.beginTransaction()
                .show(btnFrag)
                .show(logolistFrag)
                .show(infoFrag)
                .hide(ownerFrag)
                .commit();

        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragmentManager.beginTransaction()
                        .hide(infoFrag)
                        .show(ownerFrag)
                        .commit();

            }
        });

        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragmentManager.beginTransaction()
                        .show(infoFrag)
                        .hide(ownerFrag)
                        .commit();
            }
        });

        onItemClicked(0);

    }

    @Override
    public void onItemClicked(int index) {
        tvName.setText(ApplicationClass.cars.get(index).getOwnerName());
        tvTel.setText(ApplicationClass.cars.get(index).getOwnerTel());
        tvInfoModel.setText(ApplicationClass.cars.get(index).getCarModel());

        if(ApplicationClass.cars.get(index).getCarLogo().equals("Volkswagen")){
            ivMake.setImageResource(R.drawable.volkswagen);
        }else if (ApplicationClass.cars.get(index).getCarLogo().equals("Mercedes")){
            ivMake.setImageResource(R.drawable.mercedes);
        }else{
            ivMake.setImageResource(R.drawable.nissan);
        }
    }
}
