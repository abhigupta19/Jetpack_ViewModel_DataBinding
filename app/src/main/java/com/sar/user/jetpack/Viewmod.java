package com.sar.user.jetpack;

import android.view.View;

import androidx.lifecycle.ViewModel;

public class Viewmod extends ViewModel {
    String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void add(View view)
    {
        setName("pp");
    }

}
