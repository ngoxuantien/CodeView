package com.example.codeview.binding_adapter;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;


public class TextTime {
    @BindingAdapter({"app:TextTime"})
    public static void TextTime(TextView view, String imageUrl) {
      //  Glide.with(view.getContext()).load(imageUrl).into(view);
    }
}
