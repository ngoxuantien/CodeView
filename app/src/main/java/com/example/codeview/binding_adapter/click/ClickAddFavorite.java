package com.example.codeview.binding_adapter.click;

import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.example.codeview.R;

public class ClickAddFavorite {
    @BindingAdapter({"clickaddfavorite"})
    public static void clickAdd(ImageView viewIm, int k) {
        final int[] a = {1};

        viewIm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[0] ==1){
                    viewIm.setImageResource(R.drawable.marcador1);
                    a[0] =0;
                }else {
                    viewIm.setImageResource(R.drawable.marcador);
                    a[0]=1;
                }

            }
        });
    }
}
