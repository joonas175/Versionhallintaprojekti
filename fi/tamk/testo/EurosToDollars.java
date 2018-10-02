package fi.tamk.testo;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.URLConnection;

public class EurosToDollars{

    public static void main(String... args){
        try{
            System.out.println(getCourse());
        } catch (IOException e){
            System.out.println(e);
        } 
        
    }

    public static void convert(){

    }

    public static String getCourse() throws IOException, ProtocolException{
        
        URL converter = new URL("http://free.currencyconverterapi.com/api/v5/convert?q=EUR_USD&compact=y");
        URLConnection convcConnection = converter.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                convcConnection.getInputStream()));
        String inputLine = "";

        while(in.ready()){
            inputLine = in.readLine();
        }
        in.close();
        return inputLine;
    }

    public static double parseDoubleFromJSON(String json){
        return 0.0;
    }
}