package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.evaluacion1.utils.AppConstants;

public class NewActivity extends AppCompatActivity {
    private TextView usuarioTV;
    private TextView correoTV;
    private TextView totalTV;
    private Button shareBT;

    private TextView p1,p2,p3,p4,p5,p6,p7,p8,p9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        usuarioTV = findViewById(R.id.tv_usuario);
        correoTV = findViewById(R.id.tv_email);
        totalTV = findViewById(R.id.tv_total1);
        shareBT = findViewById(R.id.bt_share);

        p1 = findViewById(R.id.tv_1);
        p2 = findViewById(R.id.tv_2);
        p3 = findViewById(R.id.tv_3);
        p4 = findViewById(R.id.tv_4);
        p5 = findViewById(R.id.tv_5);
        p6 = findViewById(R.id.tv_6);
        p7 = findViewById(R.id.tv_7);
        p8 = findViewById(R.id.tv_8);
        p9 = findViewById(R.id.tv_9);



        Intent mIntent = this.getIntent();
        if (mIntent != null){
            usuarioTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_USERNAME));
            correoTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_EMAIL));
            totalTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_TOTAL));

            p1.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_1));
            p2.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_2));
            p3.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_3));
            p4.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_4));
            p5.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_5));
            p6.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_6));
            p7.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_7));
            p8.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_8));
            p9.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_9));

        }

        shareBT.setOnClickListener(v->{
            ShareInfo();
        });


    }

    private void ShareInfo(){

        Intent m2Intent = new Intent ();
        m2Intent.setAction((Intent.ACTION_SEND));
        m2Intent.setType("text/plain");
        m2Intent.putExtra(Intent.EXTRA_TEXT, "Usuario: " + usuarioTV.getText().toString() +
                "\nCorreo:  " + correoTV.getText().toString() + "\nTotal de productos: " + totalTV.getText().toString());

        startActivity(m2Intent);

    }

}






