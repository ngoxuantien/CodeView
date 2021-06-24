package com.example.codeview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.codeview.view.BottomSheetReportFragment;

public class LayoutReport1 extends Fragment {
    private RelativeLayout relativeLayoutl;
    private BottomSheetReportFragment bottomSheetReportFragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view= inflater.inflate(R.layout.layout_report1,container,false);
relativeLayoutl = view.findViewById(R.id.iddidiidididid);
relativeLayoutl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
bottomSheetReportFragment.chuyentrang();
    }
});
        return view;
    }
}
