package com.example.my_farming.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button,submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.bt1);
        submit=(Button)findViewById(R.id.bt2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                BlankFragment blankFragment=new BlankFragment();            //making blankfragment1's object
                fragmentTransaction.add(R.id.fragment,blankFragment,null);
                fragmentTransaction.commit();                   //it is use to call blankfragment;
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                BlankFragment2 blankFragment2=new BlankFragment2();        //making blankfragment2's object
                fragmentTransaction.replace(R.id.fragment,blankFragment2,null);
                fragmentTransaction.commit();                   //it is use to call blankfragment2;

            }
        });

    }
}
