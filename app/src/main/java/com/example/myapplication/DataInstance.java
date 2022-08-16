package com.example.myapplication;

import java.util.ArrayList;

public class DataInstance {
    private ArrayList<String> arrayList;
    private String data;

    public DataInstance(String day) {
        arrayList = new ArrayList<String>();
        data = day;
    }


    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public String getData() {
        return data;
    }

    public void addItems(String item){
        arrayList.add(item);
    }

}
