package com.sabsrocambole.starwars15.model;

import com.sabsrocambole.starwars15.service.HTTPServiceFilmes;

import java.util.concurrent.ExecutionException;

public class ListaFilmes {

    private String filmesID;

    private String filme1;
    private String filme2;
    private String filme3;
    private String filme4;
    private String filme5;
    private String filme6;

    private String[] ListaFilmes;

    public ListaFilmes(String filmesID) {
        this.filmesID = filmesID;
        this.filme1 = filme1;
        this.filme2 = filme2;
        this.filme3 = filme3;
        this.filme4 = filme4;
        this.filme5 = filme5;
        this.filme6 = filme6;

    }

    public String getFilmesID() {
        return filmesID;
    }

    public void setFilmesID(String filmesID) {
        this.filmesID = filmesID;
    }

    public String getFilme1() {
        filmesID = "1";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme1 = retorno.toString();
        } catch (
                ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return filme1;
    }

    public void setFilme1(String filme1) {
        this.filme1 = filme1;
    }

    public String getFilme2() {
        filmesID = "2";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme2 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return filme2;
    }

    public void setFilme2(String filme2) {
        this.filme2 = filme2;
    }

    public String getFilme3() {
        filmesID = "3";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme3 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return filme3;
    }

    public void setFilme3(String filme3) {
        this.filme3 = filme3;
    }

    public String getFilme4() {
        filmesID = "4";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme4 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return filme4;
    }

    public void setFilme4(String filme4) {
        this.filme4 = filme4;
    }

    public String getFilme5() {
        filmesID = "5";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme5 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return filme5;
    }

    public void setFilme5(String filme5) {
        this.filme5 = filme5;
    }

    public String getFilme6() {
        filmesID = "6";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme6 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return filme6;
    }

    public void setFilme6(String filme6) {
        this.filme6 = filme6;
    }

    public String[] getListaFilmes() {
        return ListaFilmes;
    }

    public void setListaFilmes(String[] listaFilmes) {
        ListaFilmes = new String[]{"null", filme1, filme2, filme3, filme4, filme5, filme6};
    }

    @Override
    public String toString() {
        return String.valueOf(ListaFilmes);
    }
}
