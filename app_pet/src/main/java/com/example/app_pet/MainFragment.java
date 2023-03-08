package com.example.app_pet;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.profileFragment).setOnClickListener(v -> {
            NavController controller = Navigation.findNavController(v);
            Bundle bundle = new Bundle();
            controller.navigate(R.id.action_mainFragment_to_profileFragment);
        });

        view.findViewById(R.id.recordFragment).setOnClickListener(v -> {
            NavController controller = Navigation.findNavController(v);
            Bundle bundle = new Bundle();
            controller.navigate(R.id.action_mainFragment_to_recordFragment);
        });

        view.findViewById(R.id.infoFragment).setOnClickListener(v -> {
            NavController controller = Navigation.findNavController(v);
            Bundle bundle = new Bundle();
            controller.navigate(R.id.action_mainFragment_to_infoFragment);
        });

        view.findViewById(R.id.albumFragment).setOnClickListener(v -> {
            NavController controller = Navigation.findNavController(v);
            Bundle bundle = new Bundle();
            controller.navigate(R.id.action_mainFragment_to_albumFragment);
        });

        view.findViewById(R.id.chatGPTFragment).setOnClickListener(v -> {
            NavController controller = Navigation.findNavController(v);
            Bundle bundle = new Bundle();
            controller.navigate(R.id.action_mainFragment_to_chatGPTFragment);
        });
    }
}