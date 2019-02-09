package com.dev.pengyang.eatwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.btnfirst);
        btn.setOnLongClickListener(new TestLongClickListener());//git
    }

    public void onFirstButtonClick(View source)
    {
        //Toast toast = Toast.makeText(this,"press!!!!!"+source.toString(),Toast.LENGTH_SHORT);
        //toast.show();
        Intent intent =new Intent(this,EditMenuActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("message","current msg");
        bundle.putInt("id",55);
        intent.putExtras(bundle);
        startActivityForResult(intent,0);//git del 2

    }

    @Override
    public void onActivityResult(int request,int result,Intent data){
        Intent intent=data;
        Bundle bundle=intent.getExtras();
        TextView textView=(TextView) findViewById(R.id.tvback);
        textView.setText(bundle.getString("message")+" id="+bundle.getInt("id")+"\ntime:"+bundle.getString("time"));
    }



}
