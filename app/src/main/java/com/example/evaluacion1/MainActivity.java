package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evaluacion1.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    private EditText usuarioET;
    private EditText correoET;
    private Button enviarBT;

    private TextView bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    private int cont1,cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9;
    private int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.et_1);
        bt2 = findViewById(R.id.et_2);
        bt3 = findViewById(R.id.et_3);
        bt4 = findViewById(R.id.et_4);
        bt5 = findViewById(R.id.et_5);
        bt6 = findViewById(R.id.et_6);
        bt7 = findViewById(R.id.et_7);
        bt8 = findViewById(R.id.et_8);
        bt9 = findViewById(R.id.et_9);



        bt1.setOnClickListener(v->{
            cont1++;
            total++;
            bt1.setText(cont1 + "");

                });

        bt2.setOnClickListener(v->{
            cont2++;

            bt2.setText(cont2 + "");

        });

        bt3.setOnClickListener(v->{
            cont3++;

            bt3.setText(cont3 + "");

        });

        bt4.setOnClickListener(v->{
            cont4++;
            bt4.setText(cont4 + "");

        });

        bt5.setOnClickListener(v->{
            cont5++;
            bt5.setText(cont5 + "");

        });
        bt6.setOnClickListener(v->{
            cont6++;
            bt6.setText(cont6 + "");

        });

        bt7.setOnClickListener(v->{
            cont7++;
            bt7.setText(cont7 + "");

        });

        bt8.setOnClickListener(v->{
            cont8++;
            bt8.setText(cont8 + "");

        });

        bt9.setOnClickListener(v->{
            cont9++;
            bt9.setText(cont9 + "");

        });




        usuarioET = (EditText) findViewById(R.id.et_usuario);
        correoET = (EditText) findViewById(R.id.et_correo);
        enviarBT = (Button) findViewById(R.id.btn_enviar);

        enviarBT.setOnClickListener(v->{
            SendInfo();
        });
    }

    private void SendInfo(){
        Intent mIntent = new Intent (MainActivity.this, NewActivity.class);
        mIntent.putExtra(AppConstants.TEXT_KEY_USERNAME, usuarioET.getText().toString());
        mIntent.putExtra(AppConstants.TEXT_KEY_EMAIL, correoET.getText().toString());


        startActivity(mIntent);

    }
}
