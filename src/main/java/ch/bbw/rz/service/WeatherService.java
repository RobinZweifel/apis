package ch.bbw.rz.service;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class WeatherService {

    public void getWeatherData() throws IOException {
        StringBuilder url = new StringBuilder("http://api.weatherapi.com/v1/current.json?key=41cb50e3dc6e415093b211945213011&q=Zurich&aqi=no");
        HttpURLConnection connection = (HttpURLConnection) new URL(url.toString()).openConnection();
        connection.setRequestProperty("User-Agent", "ApiProject");

        int respCode = connection.getResponseCode();
        if (respCode == HttpURLConnection.HTTP_OK){
            JSONObject jsonObject = new JSONObject(new JSONTokener(connection.getInputStream()));

            System.out.println(jsonObject.get("location"));
        }else {
            System.out.println("Problem occured: " + connection);
        }
    }
}
