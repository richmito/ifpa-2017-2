package com.example.richelmy.palitinhos;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button botao;
    TextView escolhaCPU,resultado;
    EditText escolhaUsuario;
    Random aleatorio;
    int intEscolhaCPU,intEscolhaUsuario,intResultado;
    String StrEscolhaUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        escolhaCPU = (TextView) findViewById(R.id.idEscolhaCPU);
        resultado = (TextView) findViewById(R.id.idResultado);
        escolhaUsuario = (EditText) findViewById(R.id.idEscolhaUsuario);
        botao = (Button) findViewById(R.id.idBtn);
        aleatorio = new Random();

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // recebe o número escolhido pelo usuário
                StrEscolhaUsuario = escolhaUsuario.getText().toString();
                intEscolhaUsuario = Integer.parseInt(StrEscolhaUsuario);

                // recebe o valor aleatório da escolha da CPU
                intEscolhaCPU = aleatorio.nextInt(4);
                //exibe o valor escolhido na tela
                escolhaCPU.setText(""+intEscolhaCPU);


                //soma os dois valores
                intResultado = intEscolhaCPU + intEscolhaUsuario;

                //exibe o resultado no textview
                resultado.setText(""+intResultado);





            }
        });


    }
}
