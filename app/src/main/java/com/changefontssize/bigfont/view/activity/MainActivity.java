package com.changefontssize.bigfont.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.changefontssize.bigfont.R;
import com.changefontssize.bigfont.base.BaseActivity;
import com.changefontssize.bigfont.databinding.ActivityMainBinding;


public class MainActivity extends BaseActivity {
    private ActivityMainBinding binding;

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }
}