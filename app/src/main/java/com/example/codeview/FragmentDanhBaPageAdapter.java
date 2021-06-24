package com.example.codeview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentDanhBaPageAdapter extends FragmentStatePagerAdapter {
    private int number=3;
    public FragmentDanhBaPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new LayoutReport1();
            case 1: return new LayoutReport2();
            case 2: return  new LayoutReport3();
            default:return  new LayoutReport1();

        }
    }

    @Override
    public int getCount() {
        return number;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
      switch (position){
          case 0:return  "DANH BA";
          case 1:return  "OFICIAL ACCOUNT";
          case 2: return "layout report 3"
;          default: return "DANH BẠ";
      }
    }
}
