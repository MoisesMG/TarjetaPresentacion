package com.example.moises.tarjetapresentacion;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mConoceMas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConoceMas = (Button) findViewById(R.id.btnConoceMas);
    }//fin del metodo

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnConoceMas:

                startActivity(new Intent("com.example.moises.AboutMe"));
                break;
            case R.id.facebook:
                Intent intent1 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/menagonzalezmoises"));
                startActivity(intent1);
                break;
            case R.id.github:
                Intent intent2 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/MoisesMG"));
                startActivity(intent2);
            default:
                break;
        }//fin del switch
    }//fin del metodo

}//fin de la clase
