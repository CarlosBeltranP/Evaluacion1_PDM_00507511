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
    private Button shareBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        usuarioTV = findViewById(R.id.tv_usuario);
        correoTV = findViewById(R.id.tv_email);
        shareBT = findViewById(R.id.bt_share);


        Intent mIntent = this.getIntent();
        if (mIntent != null){
            usuarioTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_USERNAME));
            correoTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_EMAIL));

        }

        shareBT.setOnClickListener(v->{
            ShareInfo();
        });


    }

    private void ShareInfo(){

        Intent m2Intent = new Intent ();
        m2Intent.setAction((Intent.ACTION_SEND));
        m2Intent.setType("text/plain");
        m2Intent.putExtra(Intent.EXTRA_TEXT, usuarioTV.getText().toString() +
                "\nPassword:  " + correoTV.getText().toString());

        startActivity(m2Intent);

    }

}






