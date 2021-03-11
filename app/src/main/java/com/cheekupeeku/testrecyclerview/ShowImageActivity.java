package com.cheekupeeku.testrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cheekupeeku.testrecyclerview.databinding.ShowImageBinding;

public class ShowImageActivity extends AppCompatActivity {
    ShowImageBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ShowImageBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        Intent in = getIntent();
        int imageId = in.getIntExtra("image",0);
        binding.iv.setImageResource(imageId);
    }
}
