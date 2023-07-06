import java.util.Map;

public class HashMap<S, I extends Number> {
    public static void main(String[] args) {
        Map<String, Integer> forestSpecies = (Map<String, Integer>) new HashMap<String,Integer>();

        forestSpecies.put("Amazon", 30000);
        forestSpecies.put("Congo", 10000);
        forestSpecies.put("Daintree", 15000);
        forestSpecies.put("Amazon", 40000);

        int forestCount = forestSpecies.size();
        System.out.println(forestCount);
    }
}
