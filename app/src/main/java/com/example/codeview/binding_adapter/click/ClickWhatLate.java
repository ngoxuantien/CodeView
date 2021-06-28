package com.example.codeview.binding_adapter.click;

import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.example.codeview.R;

public class ClickWhatLate {
    @BindingAdapter({"clickWhatLate"})
    public static void clickAdd(ImageView viewIm, int a) {
        final Boolean[] click = {true};
        if (a == 0) {
            viewIm.setImageResource(R.drawable.marcador1);
            click[0] = false;
        } else {
            viewIm.setImageResource(R.drawable.marcador);
            click[0] = true;
        }

    }
}
