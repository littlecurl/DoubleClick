package com.liys.doubleclickdemo.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liys.doubleclickdemo.R;

/**
 * @Description:
 * @Author: liys
 * @CreateDate: 2019/8/28 13:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/28 13:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyFragment2 extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my2, container, false);
        view.findViewById(R.id.btn_fragment).setOnClickListener((View.OnClickListener)getActivity());
        return view;
    }

}
