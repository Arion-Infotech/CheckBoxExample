package com.arioninfotech.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkAndroid,chkJava,chkPython;

    Button btnShow;

    StringBuffer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkAndroid=findViewById(R.id.chkAndroid);
        chkJava=findViewById(R.id.chkJava);
        chkPython=findViewById(R.id.chkPython);

        btnShow=findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result=new StringBuffer();

                if(chkAndroid.isChecked()){
                    result.append(chkAndroid.getText()+" ");
                }
                if(chkJava.isChecked()){
                    result.append(chkJava.getText());
                }
                if(chkPython.isChecked()){
                    result.append(chkPython.getText());
                }

                Toast.makeText(getApplicationContext(), "Checked Languages : "+result.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
