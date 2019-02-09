package com.dev.pengyang.eatwhat;


import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class TestLongClickListener implements View.OnLongClickListener {
    @Override
    public boolean onLongClick(View v) {
        Toast toast = Toast.makeText(v.getContext(),"longinusb!"+v.getContext(),Toast.LENGTH_SHORT);
        Log.e(v.toString(),"msg");
        toast.show();
        return true;
    }
}
