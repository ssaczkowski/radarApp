package com.ses.pc.radarapp;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.ExecutionException;


public class ParseJson {

    public String readUrl(String urlString) {

        AsyncTask<String, Void, String> task = new AsyncConector().execute(urlString);

        try {
            return task.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

}

class AsyncConector extends AsyncTask<String, Void, String> {

    String dataJson = new String();


    @Override
    protected String doInBackground(String... urlString) {
        BufferedReader reader = null;

        try {
            URL url = new URL(urlString[0]);

            reader = new BufferedReader(new InputStreamReader(url.openStream()));

            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            dataJson = buffer.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return dataJson;
    }

    public String getData() {
        return dataJson;
    }
}
