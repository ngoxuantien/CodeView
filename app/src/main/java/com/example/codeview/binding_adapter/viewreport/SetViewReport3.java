package com.example.codeview.binding_adapter.viewreport;

import android.view.View;
import android.widget.LinearLayout;

import androidx.databinding.BindingAdapter;

public class SetViewReport3 {
    @BindingAdapter({"setViewReport3"})
    public static void setViewReport3(LinearLayout view, int d) {
        if (d == 3) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }

}
