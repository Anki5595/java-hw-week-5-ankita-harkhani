package javaprogramme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */

public class Programme_10_TrainStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Station Name: ");
        String stationName = scanner.nextLine();
        Programme_10_TrainStation obj = new Programme_10_TrainStation();
        obj.stationList(stationName);
        scanner.close();
    }

    public void stationList(String stationName) {
        ArrayList<String> stationList = new ArrayList<>();
        stationList.add("West Minister || west minister");
        stationList.add("Oxford Circus");
        stationList.add("Holborn");
        stationList.add("South Kensington");
        stationList.add("Baker Street");
        stationList.add("Bond Street");
        stationList.add("Green Park");
        stationList.add("London Bridge");
        stationList.add("Embankment");
        stationList.add("Victoria");
        //add more station as needed

        //HashMap creation to map stations to lines
        Map<String, String> tubeLine = new HashMap<>();
        tubeLine.put("West Minister", "Jubilee, District, Circle");
        tubeLine.put("Oxford Circus", "Bekarloo, Victoria, Central");
        tubeLine.put("Holborn", "Piccadilly, Central");
        tubeLine.put("South Kensington", "Piccadilly, District, Circle");
        tubeLine.put("Baker Street", "Jubilee, Circle, Metropolitan, Hammersmith & city");
        tubeLine.put("Bond Street", "Jubilee, Central");
        tubeLine.put("Green Park", "Jubilee, Victoria, Piccadilly");
        tubeLine.put("London Bridge", "Jubilee, Northern");
        tubeLine.put("Embankment", "Bakerloo, Northern, District, Circle");
        tubeLine.put("Victoria", "Victoria, District, Circle");

        //Station to find line
        if (stationList.contains(stationName)) {
            String lines = tubeLine.get(stationName);
            System.out.println("Lines passing through " + stationName + " : " + lines);
        } else {
            System.out.println(stationName + " is not in a Zone 1 station");
        }

    }
}
