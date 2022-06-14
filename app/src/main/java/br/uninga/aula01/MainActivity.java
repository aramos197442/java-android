package br.uninga.aula01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnClientes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClientes = findViewById(R.id.btnClientes);

        btnClientes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent( MainActivity.this, ListaClientesActivity.class);
                //startActivity(intent);

                AlertDialog alerta;
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Testando Alert");
                builder.setMessage("Selecione uma opção!" );


                builder.setPositiveButton("Opção 01".toString(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Log.e("Opção: ", "01");
                    }
                });

                builder.setNeutralButton("Opção 02".toString(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Log.e("Opção: ", "02");
                    }
                });

                alerta = builder.create();
                alerta.show();

            }
        });
    }


}

