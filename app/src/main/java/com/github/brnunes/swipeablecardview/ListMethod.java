package com.github.brnunes.swipeablecardview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rattanapol on 2/16/2017 AD.
 */

public class ListMethod {
    List <String> ListKhwang = new ArrayList<>();
    List <String> ListAQI = new ArrayList<>();

    public List getListKhwang(){
        return ListKhwang;
    }
    public List getListAQI(){
        return ListAQI;
    }
    public void addListKhwang(String newList){
        ListKhwang.add(newList);
    }
    public void addListAQI(String newList){
        ListAQI.add(newList);
    }




}
