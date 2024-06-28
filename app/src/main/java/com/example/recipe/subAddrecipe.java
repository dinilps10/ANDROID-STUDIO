package com.example.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class subAddrecipe extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub_addrecipe);
       ed1=(EditText) findViewById(R.id.arTitle);
       ed2=(EditText) findViewById(R.id.arDescription);
        ed3=(EditText) findViewById(R.id.arPreparedby);
        b1=(AppCompatButton) findViewById(R.id.arSubmit);
        b2=(AppCompatButton) findViewById(R.id.arBtmm);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strAddrec=ed1.getText().toString();
                String strDescription=ed2.getText().toString();
                String strPrepare=ed3.getText().toString();

                Toast.makeText(getApplicationContext(),strAddrec+" "+strDescription+" "+strPrepare,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}