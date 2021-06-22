package com.example.codeview.binding_adapter.viewreport;

import android.view.View;
import android.widget.LinearLayout;

import androidx.databinding.BindingAdapter;

public class SetViewReport2 {
    @BindingAdapter({"setViewReport2"})
    public static void setViewReport2(View view, int d) {
        if (d == 2) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }
}
