package com.yzzg.facade.reflcet01;

public class BaseRo {
    private String nameString;
    public int ageInt;
    String addressStr;

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public int getAgeInt() {
        return ageInt;
    }

    public void setAgeInt(int ageInt) {
        this.ageInt = ageInt;
    }

    public String getAddressStr() {
        return addressStr;
    }

    public void setAddressStr(String addressStr) {
        this.addressStr = addressStr;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
