package com.example.weatherapp.ui.fragment;

import android.widget.MediaController;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weatherapp.R;
import com.example.weatherapp.base.BaseFragment;
import com.example.weatherapp.databinding.FragmentProfileBinding;


public class ProfileFragment extends BaseFragment {

    private FragmentProfileBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRawVideo();
    }

    private void setupRawVideo() {
        String videoPath = "android.resource://" + requireActivity().getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        binding.video.setVideoURI(uri);
        MediaController mediaController = new MediaController(getActivity());
        binding.video.setMediaController(mediaController);
        mediaController.setAnchorView(binding.video);
    }
}