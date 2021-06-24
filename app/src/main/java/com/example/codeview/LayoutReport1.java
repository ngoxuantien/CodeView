package com.example.codeview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.example.codeview.databinding.LayoutReport1Binding;

public class LayoutReport1 extends Fragment {
  private LayoutReport1Binding layoutReport1Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutReport1Binding= DataBindingUtil.inflate(LayoutInflater.from(getContext()),R.layout.layout_report1,null,false);
       layoutReport1Binding.setReport1(this);
        return layoutReport1Binding.getRoot();
    }

    public void movieOn(){
        Fragment newFragment= new LayoutReport2();
        getFragmentManager().beginTransaction().replace(R.id.fragment,newFragment).addToBackStack(null).commit();
    }
}
