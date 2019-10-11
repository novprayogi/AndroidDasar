package com.example.testapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<Integer> mNilai=new MutableLiveData<>();

    public MainViewModel(){
        mNilai.setValue(0);
    }

    public LiveData<Integer> getNilai(){
        return mNilai;
    }

    public void incrementNilai(){
        mNilai.setValue(mNilai.getValue()+1);
    }

}
