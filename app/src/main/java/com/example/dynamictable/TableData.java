package com.example.dynamictable;

public class TableData {

    private String mName;
    private String mPhone;
    private String mAddress;
    public TableData() {    }//default constructor

    // Argument Constructor
    public TableData(String name, String phone, String address) {
        mName = name;
        mPhone = phone;
        mAddress = address;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmName() {
        return mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
