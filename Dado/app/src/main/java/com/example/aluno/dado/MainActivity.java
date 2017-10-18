package com.example.aluno.dado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button botaoDado;
    ImageView ImagemDado;
    Random aleatorio;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoDado = (Button) findViewById(R.id.idBotao);
        ImagemDado = (ImageView) findViewById(R.id.idImagemDado);
        aleatorio = new Random();
        botaoDado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = aleatorio.nextInt(6);

                switch(resultado){
                    case 1:
                        ImagemDado.setImageResource(R.drawable.dado1);
                        break;
                    case 2:
                        ImagemDado.setImageResource(R.drawable.dado2);
                        break;
                    case 3:
                        ImagemDado.setImageResource(R.drawable.dado3);
                        break;
                    case 4:
                        ImagemDado.setImageResource(R.drawable.dado4);
                        break;
                    case 5:
                        ImagemDado.setImageResource(R.drawable.dado5);
                        break;
                    case 6:
                        ImagemDado.setImageResource(R.drawable.dado6);
                        break;

                }
                RotateAnimation rolarDado = new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rolarDado.setDuration(500);
                ImagemDado.startAnimation(rolarDado);




            }
        });


    }
}
