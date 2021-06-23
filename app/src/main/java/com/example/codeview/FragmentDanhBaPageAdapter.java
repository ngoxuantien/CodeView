package com.example.codeview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentDanhBaPageAdapter extends FragmentStatePagerAdapter {
    private int number=2;
    public FragmentDanhBaPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new Account();
            case 1: return new DanhBa();
            default:return  new Account();

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
          default: return "DANH BẠ";
      }
    }
}
