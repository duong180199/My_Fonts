package com.changefontssize.bigfont.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.changefontssize.bigfont.base.BaseFragment;
import com.changefontssize.bigfont.databinding.FragmentDetailBinding;
import com.changefontssize.bigfont.databinding.FragmentHomeBinding;

public class DetailFragment extends BaseFragment {
    private FragmentDetailBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
