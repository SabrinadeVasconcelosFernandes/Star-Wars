package com.sabsrocambole.starwars15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class infoPage extends AppCompatActivity {

    TextView tvNome;
    TextView tvFilmes;
    ImageView ivFoto;
    String nome;
    String filmes;
    String foto;
    int fotoNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);

        tvNome = findViewById(R.id.txtNome);
        tvFilmes = findViewById(R.id.txtFilmes);
        ivFoto = findViewById(R.id.imgFoto);

        nome = getIntent().getExtras().getString("Value");
        filmes = getIntent().getExtras().getString("Value2");
        foto = getIntent().getExtras().getString("Value3");


        tvNome.setText(nome);
        tvFilmes.setText(filmes);


        fotoNum = Integer.parseInt(foto);

        switch (fotoNum){
            case 1:
                ivFoto.setImageResource(R.drawable.i_1);
                break;

            case 2:
                ivFoto.setImageResource(R.drawable.i_2);
                break;

            case 3:
                ivFoto.setImageResource(R.drawable.i_3);
                break;

            case 4:
                ivFoto.setImageResource(R.drawable.i_4);
                break;

            case 5:
                ivFoto.setImageResource(R.drawable.i_5);
                break;

            case 6:
                ivFoto.setImageResource(R.drawable.i_6);
                break;

            case 7:
                ivFoto.setImageResource(R.drawable.i_7);
                break;

            case 8:
                ivFoto.setImageResource(R.drawable.i_8);
                break;

            case 9:
                ivFoto.setImageResource(R.drawable.i_9);
                break;

            case 10:
                ivFoto.setImageResource(R.drawable.i_10);
                break;

            case 11:
                ivFoto.setImageResource(R.drawable.i_11);
                break;

            case 12:
                ivFoto.setImageResource(R.drawable.i_12);
                break;

            case 13:
                ivFoto.setImageResource(R.drawable.i_13);
                break;

            case 14:
                ivFoto.setImageResource(R.drawable.i_14);
                break;

            case 15:
                ivFoto.setImageResource(R.drawable.i_15);
                break;

            case 16:
                ivFoto.setImageResource(R.drawable.i_16);
                break;

            case 17:
                ivFoto.setImageResource(R.drawable.i_17);
                break;

            case 18:
                ivFoto.setImageResource(R.drawable.i_18);
                break;

            case 19:
                ivFoto.setImageResource(R.drawable.i_19);
                break;

            case 20:
                ivFoto.setImageResource(R.drawable.i_20);
                break;

            default:
                ivFoto.setImageResource(R.drawable.perfil);
                break;
        }
    }

    public void MainPage(View view){
        Intent irMainPage = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irMainPage);
    }


}