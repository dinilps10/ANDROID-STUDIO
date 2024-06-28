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

public class subDelete extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub_delete);
     
        ed1=(EditText) findViewById(R.id.deTitle);
        b1=(AppCompatButton) findViewById(R.id.deDeletebutton);
        b2=(AppCompatButton) findViewById(R.id.deBtmm);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rec=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),rec+" deleted",Toast.LENGTH_LONG).show();
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