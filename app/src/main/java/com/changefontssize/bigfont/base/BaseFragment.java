package com.changefontssize.bigfont.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class BaseFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /*
     * Area : Function
     */
    public void navigate(int actionId) {
        navigateFragment(actionId, null);
    }

    public void navigate(int actionId, View view) {
        NavController navController = Navigation.findNavController(requireActivity(), view.getId());
        navController.navigate(actionId);
    }

    public void navigateFragment(int actionId, Bundle bundle) {
        NavController navController = NavHostFragment.findNavController(this);
        navController.navigate(actionId, bundle);
    }

    public void backToSpecificFragment(int fragmentId) {
        NavController navController = NavHostFragment.findNavController(this);
        navController.popBackStack(fragmentId, false);
    }

    public void backToPrevious() {
        NavController navController = NavHostFragment.findNavController(this);
        navController.popBackStack();
    }
}
