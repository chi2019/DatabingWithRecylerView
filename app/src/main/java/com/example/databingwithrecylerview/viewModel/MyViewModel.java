package com.example.databingwithrecylerview.viewModel;

import android.arch.lifecycle.MutableLiveData;

import java.util.List;

public class MyViewModel {

    MutableLiveData<List<String>> data ;

    public void init(){
        data = new MutableLiveData<List<String>>();
    }

}
