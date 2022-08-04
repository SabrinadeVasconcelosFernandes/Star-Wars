package com.sabsrocambole.starwars15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sabsrocambole.starwars15.model.ListaFilmes;
import com.sabsrocambole.starwars15.model.ListaPessoas;


public class MainActivity extends AppCompatActivity {

    String nome;
    String filmes;
    String foto;

    ListaPessoas pessoa = new ListaPessoas("1");
    ListaFilmes filme = new ListaFilmes("1");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //Luke
    public void InfoPage1(View view){

        Intent i = new Intent(getApplicationContext(), infoPage.class);

        nome = pessoa.getPessoa1();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "1" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //C-3PO
    public void InfoPage2(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa2();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ", "  + filme.getFilme4() + ", "  + filme.getFilme5() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "2" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //R2-D2
    public void InfoPage3(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa3();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ", "  + filme.getFilme4() + ", "  + filme.getFilme5() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "3" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Darth Vader
    public void InfoPage4(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa4();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "4" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Leia Organa
    public void InfoPage5(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa5();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "5" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Owen Lars
    public void InfoPage6(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa6();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme5() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "6" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Beru Whitesun Lars
    public void InfoPage7(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa7();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ".";
        i.putExtra("Value2",filmes);

        foto = "7" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //R5-D4
    public void InfoPage8(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa8();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ".";
        i.putExtra("Value2",filmes);

        foto = "8" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Biggs Darklighter
    public void InfoPage9(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa9();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ".";
        i.putExtra("Value2",filmes);

        foto = "9" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Obi-Wan Kenobi
    public void InfoPage10(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa10();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ", "  + filme.getFilme4() + ", "  + filme.getFilme5() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "10" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Anakin Skywalker
    public void InfoPage11(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa11();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme4() + ", " + filme.getFilme5() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "11" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Wilhuff Tarkin
    public void InfoPage12(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa12();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "12" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Chewbacca
    public void InfoPage13(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa13();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "13" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Han Solo
    public void InfoPage14(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa14();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ".";
        i.putExtra("Value2",filmes);

        foto = "14" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Greedo
    public void InfoPage15(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa15();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ".";
        i.putExtra("Value2",filmes);

        foto = "15" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Jabba Desilijic Tiure
    public void InfoPage16(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa16();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme3() + ", " + filme.getFilme4() + ".";
        i.putExtra("Value2",filmes);

        foto = "16" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Wedge Antille
    public void InfoPage17(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa17();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ", " + filme.getFilme2() + ", " + filme.getFilme3() + ".";
        i.putExtra("Value2",filmes);

        foto = "17" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Jek Tono Porkins
    public void InfoPage18(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa18();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme1() + ".";
        i.putExtra("Value2",filmes);

        foto = "18" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Yoda
    public void InfoPage19(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa19();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme2() + ", " + filme.getFilme3() + ", " + filme.getFilme4() + ", " + filme.getFilme5() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "19" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Palpatine
    public void InfoPage20(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        nome = pessoa.getPessoa20();
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + filme.getFilme2() + ", " + filme.getFilme3() + ", " + filme.getFilme4() + ", " + filme.getFilme5() + ", " + filme.getFilme6() + ".";
        i.putExtra("Value2",filmes);

        foto = "20" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

//fim de tudo
}