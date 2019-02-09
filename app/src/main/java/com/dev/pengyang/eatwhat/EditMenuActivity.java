package com.dev.pengyang.eatwhat;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EditMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_menu);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        TextView textView=(TextView) findViewById(R.id.tvintent);
        textView.setText(bundle.getString("message")+" id="+bundle.getInt("id"));
    }

    public void onBackButtonClick(View view) {
        Intent intent =new Intent();
        Bundle bundle=new Bundle();
        bundle.putString("message","back msg");
        bundle.putInt("id",21);

        Date dt=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        bundle.putString("time", sdf.format(dt));
        intent.putExtras(bundle);
        setResult(Activity.RESULT_OK,intent);

        finish();
    }

    public void onTestButtonClick(View view) {
        Toast toast = Toast.makeText(this,"press!!!!test2!",Toast.LENGTH_LONG);
        toast.show();
    }


}
