package com.example.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText editTextPeso, editTextAltura;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularIMC();
            }
        });
    }

    public void calcularIMC(){
        Float peso = Float.parseFloat(  editTextPeso.getText().toString()   );
        Float altura = Float.parseFloat(  editTextAltura.getText().toString()   );
        Float imc = peso / (altura*altura);

        // Assim seria para mostrar na mesma tela usando TOAST:
        // Toast.makeText(this, imc.toString(), Toast.LENGTH_SHORT).show();

        //Outra forma de mostrar o resultado seria abrir uma nota tela:
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("imcresult",imc);
        startActivity(intent);

    }

}