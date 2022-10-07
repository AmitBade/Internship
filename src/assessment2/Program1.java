package assessment2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program1 {
    public static  Map<String,String> userInput(){
        Map<String,String> listOfPlayers=new TreeMap<>();
        Scanner inputFromConsole=new Scanner(System.in);
        System.out.println("Please enter hom many records of players you want");
        int noOfPlayers= inputFromConsole.nextInt();
        for(int player=1;player<=noOfPlayers;player++){
            System.out.println(">> Please enter the Country Name for player "+ player);
            String countryName= inputFromConsole.next().toUpperCase();

            System.out.println("Please enter the player "+player+" name");
            String playerName= inputFromConsole.next().toUpperCase();
            listOfPlayers.put(countryName,playerName);
        }

        return listOfPlayers;
    }
    public static void getPlayersBasedOnCountry( Map<String,String>listOfPlayers){
        Map<String,String>listOfPlayer= new TreeMap<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter country name:");
        String country= input.next().toUpperCase();
        if(listOfPlayer.containsKey(country)) {
            for (Map.Entry<String, String> entry : listOfPlayer.entrySet()) {
                if (entry.equals(country)) {
                    System.out.println(entry.getValue());
                } else {
                    System.out.println("No record found for " + country);
                }
            }
        }

    }
    public static void searchPlayersByInitial(Map<String,String>listOfPlayer){
        Map<String,String>playerByInitial=new TreeMap<>();
        Scanner fromConsole=new Scanner(System.in);
        System.out.println("Enter the Initial of the Players you want to search.");
        String initial= String.valueOf(fromConsole.next().toUpperCase().charAt(0));
        for (Map.Entry<String, String> entry : listOfPlayer.entrySet()){
            if(entry.getValue().startsWith(initial)){
                System.out.println("The players starting with "+initial + "are"+entry.getValue());
            }
        }
    }


    public static void main(String[] args) {
        Map<String,String> players=userInput();
        getPlayersBasedOnCountry(players);
        searchPlayersByInitial(players);
    }
}
