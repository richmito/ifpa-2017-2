package com.example.aluno.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button botaoPedra,botaoPapel,botaoTesoura;
    ImageView ImagemAcima,ImagemAbaixo,ImagemResultado;
    Random aleatorio;



    int resultado(int escolhaUsuario,int escolhaComputador) {
        // 0 vale pedra, 1 vale papel, 2 vale tesoura
        // se retorna 3, empate, 2, perdeu, 1, ganhou

        switch (escolhaUsuario) {
            case 1: // se o usuario escolher pedra
                switch (escolhaComputador) {
                    case 1:
                        return 3; // pedra com pedra dá empate

                    case 2:
                        return 2; // pedra com papel, usuário perdeu

                    case 3:
                        return 1; // pedra com tesoura, o usuário ganhou

                }
                break;

            case 2: // se o usuario escolher papel
                switch (escolhaComputador) {
                    case 1:
                        return 1; // papel com pedra, o usuário ganhou

                    case 2:
                        return 3; // papel com papel, dá empate

                    case 3:
                        return 2; // papel com tesoura, o usuário perdeu

                }
                break;

            case 3: // se o usuario escolher tesoura
                switch (escolhaComputador) {
                    case 1:
                        return 2; // tesoura com pedra, o usuário perdeu

                    case 2:
                        return 1; // tesoura com papel, ganhou

                    case 3:
                        return 3; // tesoura com tesoura dá empate

                }
        }
        return 999;
    }



    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoPedra = (Button) findViewById(R.id.idButtonPedra);
        botaoPapel = (Button) findViewById(R.id.idButtonPapel);
        botaoTesoura = (Button) findViewById(R.id.idButtonTesoura);
        ImagemAcima = (ImageView) findViewById(R.id.idImagemCima);
        ImagemAbaixo = (ImageView) findViewById(R.id.idImagemBaixo);
        ImagemResultado = (ImageView) findViewById(R.id.idImagemResultado);
        aleatorio = new Random();




        botaoPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escolhaCPU = aleatorio.nextInt(3);
                ImagemAbaixo.setImageResource(R.drawable.pedra); // define a imagem do usuário como pedra

                switch (escolhaCPU) {
                    case 0:
                        //CPU escolheu pedra
                        ImagemAcima.setImageResource(R.drawable.pedra);
                        //empate
                        ImagemResultado.setImageResource(R.drawable.empate);
                        break;


                    case 1:
                        // CPU escolheu papel
                        ImagemAcima.setImageResource(R.drawable.papel);
                        //perdeu
                        ImagemResultado.setImageResource(R.drawable.derrota);
                        break;

                    case 2: // CPU escolheu tesoura
                        ImagemAcima.setImageResource(R.drawable.tesoura);
                        //vitória
                        ImagemResultado.setImageResource(R.drawable.vitoria);
                        break;



                }
                }


            });




        botaoTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escolhaCPU = aleatorio.nextInt(3);
                ImagemAbaixo.setImageResource(R.drawable.tesoura); // define a imagem do usuário como pedra

                switch (escolhaCPU) {
                    case 0:
                        //CPU escolheu pedra
                        ImagemAcima.setImageResource(R.drawable.pedra);
                        // derrota
                        ImagemResultado.setImageResource(R.drawable.derrota);
                        break;


                    case 1:
                        // CPU escolheu papel
                        ImagemAcima.setImageResource(R.drawable.papel);
                        // vitoria
                        ImagemResultado.setImageResource(R.drawable.vitoria);
                        break;

                    case 2: // CPU escolheu tesoura
                        ImagemAcima.setImageResource(R.drawable.tesoura);
                        //empate
                        ImagemResultado.setImageResource(R.drawable.empate);
                        break;



                }
            }


        });


        botaoPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escolhaCPU = aleatorio.nextInt(3);
                ImagemAbaixo.setImageResource(R.drawable.papel); // define a imagem do usuário como pedra

                switch (escolhaCPU) {
                    case 0:
                        //CPU escolheu pedra
                        ImagemAcima.setImageResource(R.drawable.pedra);
                        //vitoria
                        ImagemResultado.setImageResource(R.drawable.vitoria);
                        break;


                    case 1:
                        // CPU escolheu papel
                        ImagemAcima.setImageResource(R.drawable.papel);
                        //empate
                        ImagemResultado.setImageResource(R.drawable.empate);
                        break;

                    case 2: // CPU escolheu tesoura
                        ImagemAcima.setImageResource(R.drawable.tesoura);
                        //derrota
                        ImagemResultado.setImageResource(R.drawable.derrota);
                        break;

                    /*default:
                        ImagemAcima.setImageResource(R.drawable.branco);*/

                }
            }


        });



        }
}