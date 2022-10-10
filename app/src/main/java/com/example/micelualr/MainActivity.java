package com.example.micelualr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Button b=findViewById(R.id.boton);

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button mb =(Button) view;
                    mb.setText("va_termine");
                    EditText c1= findViewById(R.id.c1);
                    EditText c2= findViewById(R.id.c2);

                    Integer x= Integer.parseInt(c1.getText().toString());
                    Integer y=Integer.parseInt(c2.getText().toString());
                    Integer z=x+y;
                    TextView r=findViewById(R.id.re);
                    r.setText(z.toString());

                }
            });
    }
}