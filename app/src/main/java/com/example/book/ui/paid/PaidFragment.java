package com.example.book.ui.paid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.book.databinding.FragmentPaidBinding;

public class PaidFragment extends Fragment {

    private PaidViewModel paidViewModel;
    private FragmentPaidBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        paidViewModel =
                new ViewModelProvider(this).get(PaidViewModel.class);

        binding = FragmentPaidBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}