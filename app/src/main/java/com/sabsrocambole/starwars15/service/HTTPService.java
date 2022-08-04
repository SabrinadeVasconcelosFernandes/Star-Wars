package com.sabsrocambole.starwars15.service;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.sabsrocambole.starwars15.model.Pessoas;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HTTPService extends AsyncTask<Void, Void, Pessoas> {

    private final String pessoasID;

    public HTTPService(String pessoasID) {
        this.pessoasID = pessoasID;
    }

    @Override
    protected Pessoas doInBackground(Void... voids) {

        StringBuilder resposta = new StringBuilder();

        if (this.pessoasID != null && this.pessoasID.length() > 0 && this.pessoasID.length() <= 2) {
            try {

                URL url = new URL("https://swapi.dev/api/people/" + this.pessoasID + "/");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setDoOutput(true);
                connection.setConnectTimeout(5000);
                //faz a conexão:

                connection.connect();


                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    resposta.append(scanner.next());
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new Gson().fromJson(resposta.toString(), Pessoas.class);
    }
}
