package models;

import java.util.ArrayList;

public class BusinessList {

    ArrayList<Business> list;

    public BusinessList() {
        list = new ArrayList();
    }

    public String getAll() {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += ("id: " + i + " " + list.get(i).name + "\n");
        }
        return (result);
    }

    public void addBusiness(Business business) {
        list.add(business);
        updateIndex();
    }

    public String getBusiness(int index) {
        String result = "";
        result += ("ID: " + list.get(index).id + "\n");
        result += ("Name: " + list.get(index).name + "\n");
        result += ("Address: " + list.get(index).address + "\n");
        result += ("City: " + list.get(index).city + "\n");
        result += ("State: " + list.get(index).state + "\n");
        result += ("ZipCode: " + list.get(index).zipCode + "\n");
        return (result);
    }

    public void updateBusiness(int index, String name, String address, String city, String state, int zipCode) {
        list.get(index).name = name;
        list.get(index).address = address;
        list.get(index).city = city;
        list.get(index).state = state;
        list.get(index).zipCode = zipCode;
    }

    public void deleteBusiness(int index) {
        list.remove(index);
        updateIndex();
    }

    public void updateIndex() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).id = i;
        }
    }
}
