package fi.tamk.testo;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.ProtocolException;

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
        URL url = new URL("http://free.currencyconverterapi.com/api/v5/convert?q=EUR_USD&compact=y");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setDoOutput(true);
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        System.out.println(inputLine);
    }
}