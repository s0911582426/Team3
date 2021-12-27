package com.example.book.ui.put;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.book.R;
import com.example.book.databinding.FragmentPutBinding;
import com.example.book.ui.put.PutViewModel;

public class PutFragment extends Fragment {

    private PutViewModel putViewModel;
    private FragmentPutBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        putViewModel =
                new ViewModelProvider(this).get(PutViewModel.class);

        binding = FragmentPutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button put_save = (Button) root.findViewById(R.id.put_send);
        put_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"已儲存",Toast.LENGTH_LONG).show();
            }
        });

        Button put_clear = (Button) root.findViewById(R.id.put_clear);
        put_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 = root.findViewById(R.id.put_textname);
                et1.setText("");
                EditText et2 = root.findViewById(R.id.put_textprice);
                et2.setText(null);
                Toast.makeText(getActivity(),"已清除",Toast.LENGTH_LONG).show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}