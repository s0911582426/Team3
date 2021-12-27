package com.example.book.ui.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import com.example.book.R;
import com.example.book.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_detail,container,false);

        Button button = view.findViewById(R.id.btm_detail);
        button.setOnClickListener(new View.OnClickListener() { //點擊按鈕後執行fragment切換
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                //呼叫getFragmentManager()的方法來取得FragmentManager

                fm.beginTransaction().replace(R.id.frameLayout,new DetailFragment()).commit();
                //使用beginTransaction()方法
                //放置我寫好的另一個畫面Search()
                //最後記得按下commit()方法，送出以上建立的處理流程才會成功
            }
        });
        return view;
    }
}