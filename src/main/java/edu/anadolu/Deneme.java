package edu.anadolu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deneme {

    ArrayList<Integer> cities;

    ArrayList<Integer> hubs = new ArrayList<>();

    private Map<Integer, ArrayList<ArrayList<Integer>>> depots = new HashMap<>();

    public Deneme() {
        this.cities = new ArrayList<>();
        }

    public void initializeCity (){
        int[] cityNumbers = new int[81];

        for (int i = 0; i < cityNumbers.length; i++) {
            cityNumbers[i] = i;
        }

        for (int i = 0; i < cityNumbers.length; i++) {
            int rand = (int) (81 * Math.random());
            int temp;

            temp = cityNumbers[i];
            cityNumbers[i] = cityNumbers[rand];
            cityNumbers[rand] = temp;
        }

        for (int i = 0; i < cityNumbers.length ; i++) {
            cities.add(cityNumbers[i]);
        }
    }


    public void chooseHub(int numberOfHub){

        for (int i = 0; i < numberOfHub ; i++) {

            int rand = (int)(Math.random()*80);

            hubs.add(cities.get(rand));
            cities.remove(rand);

        }
    }

    public List<Integer> calculateClosest(int hubNumber, int howMany) {

        int[][] distances = TurkishNetwork.distance;

        ArrayList<Integer> distancesToHub = new ArrayList<>();

        for (int i = 0; i < distances.length; i++) {
            distancesToHub.add(distances[hubNumber][i]);
        }

        distancesToHub.sort(Integer::compareTo);

        for (int i = 0; i < howMany; i++) {


        }

        return distancesToHub.subList(0,howMany);

    }

}
