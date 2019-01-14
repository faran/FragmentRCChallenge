package com.softs.mt.fragmentrcchallenge;

/**
 * Created by fkha0003 on 11/01/2019.
 */

public class CarMan {
    private String carLogo;
    private String carModel;
    private String ownerName;
    private String ownerTel;

    public CarMan(String carLogo, String carModel, String ownerName, String ownderTel) {
        this.carLogo = carLogo;
        this.carModel = carModel;
        this.ownerName = ownerName;
        this.ownerTel = ownderTel;

    }

    public String getCarLogo() {
        return carLogo;
    }

    public void setCarLogo(String carLogo) {
        this.carLogo = carLogo;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }
}
