package com.example.codeview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.codeview.R;
import com.example.codeview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setItemClick(this);

        //  setContentView(R.layout.activity_main);

        Button buttonOpenBottomSheet = findViewById(R.id.bottomsheet);
        buttonOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  clickOpenBottomSheetDialogFragment();
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                startActivity(intent);
            }


        });

    }

    private void clickOpenBottomSheetDialogFragment() {
        MyBottonSheetDialogFragment sheetDialogFragment = MyBottonSheetDialogFragment.newInstance();
        sheetDialogFragment.show(getSupportFragmentManager(), sheetDialogFragment.getTag());

    }

    public void setClickbutton() {
        Intent intent = new Intent(this, VideoActivity.class);
        startActivity(intent);

    }
}