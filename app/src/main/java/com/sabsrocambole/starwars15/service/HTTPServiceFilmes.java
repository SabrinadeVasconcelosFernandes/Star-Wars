package com.sabsrocambole.starwars15.service;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.sabsrocambole.starwars15.model.Filmes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class HTTPServiceFilmes extends AsyncTask<Void, Void, Filmes> {

    private final String filmesID;

    public HTTPServiceFilmes(String filmesID) {
        this.filmesID = filmesID;
    }

    @Override
    protected Filmes doInBackground(Void... voids) {

        StringBuilder respostaFilmes = new StringBuilder();

        if (this.filmesID != null && this.filmesID.length() == 1){
            try {
                URL url = new URL("https://swapi.dev/api/films/"+this.filmesID+"/");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setDoOutput(true);
                connection.setConnectTimeout(5000);
                connection.connect();

                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    respostaFilmes.append(scanner.next());
                }


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new Gson().fromJson(respostaFilmes.toString(), Filmes.class);
    }
}
