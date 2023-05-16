package WARSZTATY.MOJE_PROGRAMY.Drewno_calculate_Volume;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Wood> woodList = new ArrayList<>();
        woodList.add(new Wood(8, 2.5, 6));
        woodList.add(new Wood(9, 2.5, 5));
        woodList.add(new Wood(10, 2.5, 6));
        woodList.add(new Wood(11, 2.5, 10));
        woodList.add(new Wood(12, 2.5, 11));
        woodList.add(new Wood(13, 2.5, 16));
        woodList.add(new Wood(14, 2.5, 8));
        woodList.add(new Wood(15, 2.5, 11));
        woodList.add(new Wood(16, 2.5, 10));
        woodList.add(new Wood(17, 2.5, 6));
        woodList.add(new Wood(18, 2.5, 4));
        woodList.add(new Wood(19, 2.5, 3));
        woodList.add(new Wood(20, 2.5, 1));
        woodList.add(new Wood(23, 2.5, 1));

        Double sumOfVolume = 0.0;
        Integer sumOfAmount = 0;
        Integer sumOfDiameter = 0;

        for (Wood wood : woodList) {
            sumOfVolume += wood.getObjetosc();
            sumOfAmount += wood.getAmount();
            sumOfDiameter += wood.getDiameter() * wood.getAmount();
            System.out.println(wood);
        }
        System.out.println();
        printResult(sumOfAmount, sumOfVolume, sumOfDiameter);
    }

    private static void printResult(Integer sumOfAmount, Double sumOfVolume, Integer sumOfDIameter) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String roundedVolume = decimalFormat.format(sumOfVolume);
        System.out.println("Całkowita objętość drewna wynosi: " + roundedVolume + " m3");
        System.out.println("Całkowita ilość pniaków na stercie to: : " + sumOfAmount + " sztuk");
        double averageDiameter = (double) sumOfDIameter / sumOfAmount;
        String roundedDiameter = decimalFormat.format(averageDiameter);
        System.out.println("Średnia średnica pniaczków to: " + roundedDiameter + " cm");
    }


}
