package com.example.codeview.binding_adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.example.codeview.R;

public class ClickLikeComment {


    @BindingAdapter({"clickLikeComment"})
    public static void setImage(ImageView view1, int a) {

        final int[] b = {0};
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b[0] == 0) {
                    view1.setImageResource(R.drawable.shape);
                   b[0] = 1;
                } else {

                    view1.setImageResource(R.drawable.shapechecked);
                   b[0] =0;


                }


            }
        });

    }


}
