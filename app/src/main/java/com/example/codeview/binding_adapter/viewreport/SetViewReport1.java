package com.example.codeview.binding_adapter.viewreport;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class SetViewReport1 {

    @BindingAdapter("setViewReport1")
    public static void setViewReport1(View view, int d) {
        if (d == 1) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }

    }
}
