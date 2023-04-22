package WARSZTATY.MOJ_NOTATNIK.Kursy_Walut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WczytajKursNBP_DlaPodanejDaty {

    private LocalDate podanaData;
    private LocalDate datePierwszegoKursu;
    private String szukany_kurs;
    private BigDecimal kursW_BD;
    private static int counter = 0;

    public WczytajKursNBP_DlaPodanejDaty(LocalDate podanaData) {
        this.podanaData = podanaData;
        szukany_kurs = wczytajKursNBP(podanaData);
        kursW_BD = kursDouble();
        datePierwszegoKursu = podanaData.plusDays(counter);
    }

    private static String wczytajKursNBP(LocalDate localDate) {

        String responseData = "";
        String tabel = "a";
        String code = "isk";
        LocalDate dateObject = localDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        boolean checker = true;
        while (checker) {
            String date = formatter.format(dateObject);
//            System.out.println(date);
            try {
                String url = "http://api.nbp.pl/api/exchangerates/rates/" + tabel + "/" + code + "/" + date + "/?format=json";
                HttpURLConnection connection = null;


                connection = (HttpURLConnection) new URL(url).openConnection();

                connection.setRequestMethod("GET");
                connection.setRequestProperty("Accept", "application/json");

                BufferedReader responseReader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));


                String line;
                while ((line = responseReader.readLine()) != null) {
                    responseData += line;
                }
                responseReader.close();
//                System.out.println(responseData);
                checker = false;

            } catch (IOException e) {
                dateObject = dateObject.plusDays(1);
                counter++;
                if (counter > 10) {
                    throw new RuntimeException("Podałeś błędną datę lub w tym okresie NBP nie podaje średnich walut");
                }
            }
        }
        return responseData;
    }

    private BigDecimal kursDouble() {

        String jsonString = szukany_kurs;
        Pattern pattern = Pattern.compile("\"mid\":(\\d+\\.\\d+)");
        Matcher matcher = pattern.matcher(jsonString);
        String midValue = "0.0";
        if (matcher.find()) {
            midValue = matcher.group(1);
        }
        return new BigDecimal(midValue);
    }

    public LocalDate getPodanaData() {
        return podanaData;
    }

    public LocalDate getDatePierwszegoKursu() {
        return datePierwszegoKursu;
    }

    public String getSzukany_kurs() {
        return szukany_kurs;
    }

    public BigDecimal getKursWBigDecimal() {
        return kursW_BD;
    }

}


