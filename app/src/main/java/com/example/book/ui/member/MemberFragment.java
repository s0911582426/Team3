package com.example.book.ui.member;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.book.R;
import com.example.book.databinding.FragmentMemberBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MemberFragment extends Fragment {

    private MemberViewModel memberViewModel;
    private FragmentMemberBinding binding;
    DatePickerDialog.OnDateSetListener datePicker;
    Calendar calendar = Calendar.getInstance();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        memberViewModel =
                new ViewModelProvider(this).get(MemberViewModel.class);

        binding = FragmentMemberBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button member_btbirthday = root.findViewById(R.id.member_btbirthday);
        TextView member_textbirthday = root.findViewById(R.id.member_textbirthday);

        datePicker = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                String myFormat = "yyyy年MM月dd日";
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.TAIWAN);
                member_textbirthday.setText(sdf.format(calendar.getTime()));
            }
        };
        member_btbirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(getActivity(),
                        datePicker,
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH));
                dialog.show();
            }
        });

        Button member_save = (Button) root.findViewById(R.id.member_save);
        member_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"已儲存",Toast.LENGTH_LONG).show();
            }
        });

        Button member_clear = (Button) root.findViewById(R.id.member_clear);
        member_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 = root.findViewById(R.id.member_textname);
                et1.setText("");
                EditText et3 = root.findViewById(R.id.member_textemail);
                et3.setText("");
                EditText et4 = root.findViewById(R.id.member_textphone);
                et4.setText(null);
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