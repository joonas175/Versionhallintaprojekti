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
            test();
        } catch (IOException e){
            System.out.println(e);
        } 
        
    }

    public static void convert(){

    }

    public static void test() throws IOException, ProtocolException{
        
        URL yahoo = new URL("http://free.currencyconverterapi.com/api/v5/convert?q=EUR_USD&compact=y");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
        
    }
}