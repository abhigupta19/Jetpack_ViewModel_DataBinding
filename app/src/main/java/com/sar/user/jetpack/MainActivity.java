package com.sar.user.jetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;

import android.graphics.ColorSpace;
import android.os.Bundle;

import com.sar.user.jetpack.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =DataBindingUtil.setContentView(this,R.layout.activity_main);
        Viewmod viewModel=new ViewModelProvider(this).get(Viewmod.class);
        ViewModelStore viewModelStore=getViewModelStore();
        binding.setViewModel(viewModel);
        viewModel.setName("kaka");

    }
}
