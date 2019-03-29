package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.evaluacion1.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    private EditText usuarioET;
    private EditText correoET;
    private Button enviarBT;

    private LinearLayout bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;
    private int cont1,cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9;
    private int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.bt_1);
        bt2 = findViewById(R.id.bt_2);
        bt3 = findViewById(R.id.bt_3);
        bt4 = findViewById(R.id.bt_4);
        bt5 = findViewById(R.id.bt_5);
        bt6 = findViewById(R.id.bt_6);
        bt7 = findViewById(R.id.bt_7);
        bt8 = findViewById(R.id.bt_8);
        bt9 = findViewById(R.id.bt_9);

        tv1 = findViewById(R.id.et_1);
        tv2 = findViewById(R.id.et_2);
        tv3 = findViewById(R.id.et_3);
        tv4 = findViewById(R.id.et_4);
        tv5 = findViewById(R.id.et_5);
        tv6 = findViewById(R.id.et_6);
        tv7 = findViewById(R.id.et_7);
        tv8 = findViewById(R.id.et_8);
        tv9 = findViewById(R.id.et_9);




        bt1.setOnClickListener(v->{
            cont1++;
            total++;
            tv1.setText(cont1 + "");

                });

        bt2.setOnClickListener(v->{
            cont2++;

            tv2.setText(cont2 + "");

        });

        bt3.setOnClickListener(v->{
            cont3++;

            tv3.setText(cont3 + "");

        });

        bt4.setOnClickListener(v->{
            cont4++;
            tv4.setText(cont4 + "");

        });

        bt5.setOnClickListener(v->{
            cont5++;
            tv5.setText(cont5 + "");

        });
        bt6.setOnClickListener(v->{
            cont6++;
            tv6.setText(cont6 + "");

        });

        bt7.setOnClickListener(v->{
            cont7++;
            tv7.setText(cont7 + "");

        });

        bt8.setOnClickListener(v->{
            cont8++;
            tv8.setText(cont8 + "");

        });

        bt9.setOnClickListener(v->{
            cont9++;
            tv9.setText(cont9 + "");

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
