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
            System.out.println(convertEURToUSD(50));
            System.out.println(convertUSDToEUR(50));
        } catch (IOException e){
            System.out.println(e);
        } 
        
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
        String tempString = json.replace("{", "");
        tempString = tempString.replace("}", "");
        tempString = tempString.replace("\"", "");
        String[] temp = new String[tempString.split(":").length];
        temp = tempString.split(":");
        double returnVal = -1;
        for(int i = 0; i < temp.length; i++){
            try{
                returnVal = Double.parseDouble(temp[i]);
            } catch (Exception e){
                
            }
        }
        return returnVal;
    }

    public static double convertEURToUSD(double sum) throws IOException, ProtocolException{
        double course = parseDoubleFromJSON(getCourse());
        return sum * course;
    }

    public static double convertUSDToEUR(double sum) throws IOException, ProtocolException{
        double course = parseDoubleFromJSON(getCourse());
        return sum / course;
    }
}