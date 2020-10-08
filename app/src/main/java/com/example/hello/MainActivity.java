package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao, botaoToast;
    private TextView cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.botao);
        botaoToast = findViewById(R.id.botaoToast);
        cont = findViewById(R.id.cont);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer contador = Integer.parseInt(cont.getText().toString()) + 1;

                cont.setText(contador.toString());
            }
        });

        botaoToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello toast", Toast.LENGTH_LONG).show();
            }
        });
    }
}