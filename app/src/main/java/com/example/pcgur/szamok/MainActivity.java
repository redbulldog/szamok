package com.example.pcgur.szamok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button novekvo;
    private TextView kiiras;
    private Button csokkeno;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        novekvo = (Button)findViewById(R.id.button);
        kiiras = (TextView)findViewById(R.id.textView);
        csokkeno = (Button)findViewById(R.id.button2);

        novekvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                kiiras.setText(String.valueOf(i));
            }
        });
        csokkeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                kiiras.setText(String.valueOf(i));
            }
        });
    }
}
