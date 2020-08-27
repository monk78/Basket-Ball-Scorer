package com.example.basketcourt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=0,b=0;
    public void reset(View view){
        a=0;
        b=0;
        IncA(a);
        incB(b);
    }
    public void incr3a(View view){
        a=a+3;
        IncA(a);
    }
    public void incr2a(View view){
        a=a+2;
        IncA(a);
    }
    public void incr1a(View view){
        a=a+1;
        IncA(a);
    }
    public void incr1b(View view){
        b=b+1;
        incB(a);
    }
    public void incr3b(View view){
        b=b+3;
        incB(a);
    }
    public void incr2b(View view){
        b=b+2;
        incB(a);
    }

    void IncA(int number){
        TextView x=(TextView)findViewById(R.id.pointsa);
        x.setText(""+a);
    }
    void incB(int number){
        TextView y=(TextView)findViewById(R.id.pointsb);
        y.setText(""+b);
    }

}