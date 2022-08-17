package com.changefontssize.bigfont.view.activity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.SeekBar;

import androidx.databinding.DataBindingUtil;

import com.changefontssize.bigfont.R;
import com.changefontssize.bigfont.base.BaseActivity;
import com.changefontssize.bigfont.databinding.ActivitySlashBinding;

public class SplashActivity extends BaseActivity {
    private ActivitySlashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_slash);

        binding.seekbar.setMax(9);
        binding.seekbar.setProgress(0);

        binding.seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Handler().postDelayed(() -> {
            MainActivity.start(this);
            },3000);
    }
}