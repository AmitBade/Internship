package assessment.assignment;

import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

class InvalidValueException extends Exception {
    InvalidValueException(String exceptionMsg) {
        System.out.println(exceptionMsg);
    }
}
public class Problem1 {
    /**
     this method reads the file at specific location stores/convert in string
     */
    static String readFileFromLocation(String loc) {
        try {
            FileReader fr = new FileReader(loc);
            int i;
            char c;
            String str = "";
            while ((i = fr.read()) != -1) {
                c = (char) i;
                str = str + c;
            }
            fr.close();
            return str;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    /**
     This method stores the data read in TreeMap and throws a custom exception if the value in the given file
     is empty , handles the exception and replace the empty value by "DEFAULT_VALUE" ,returns the updated TreeMap
     */
    public static TreeMap<String, String> storeFromFile(String str)
    {
        String sar[] = str.split("\n");


        TreeMap<String, String> toStoreData = new TreeMap<String, String>();

        for (int t = 0; t < sar.length; t++) {
            String[] st = sar[t].split("=");
            toStoreData.put(st[0], st[1]);
        }
        for (Map.Entry<String, String> data : toStoreData.entrySet()) {
            try {
                if (data.getValue().isBlank()) {
                    String km = data.getKey();
                    String p = String.format("the value of %s key is empty ", km);
                    System.out.println(p);
                    throw new InvalidValueException("this is empty");
                }
            }
            catch (InvalidValueException e) {
                System.out.println(e);
                String key = data.getKey();
                String def = "DEFAULT_VALUE";
                toStoreData.put(key, def);
            }
        }
        System.out.println(toStoreData);
        return toStoreData;

    }
    /**
     This method prints the data in key value format
     */
    public static void toPrint(TreeMap<String, String> smap)
    {
        System.out.println("KEY \t\t" + "VALUE");
        for (Map.Entry<String, String> m : smap.entrySet()) {
            if (m.getKey().length() > 7) {
                System.out.println(m.getKey() + "\t" + m.getValue());
            }
            if (m.getKey().length() <= 7) {
                System.out.println(m.getKey() + "\t\t" + m.getValue());
            }
        }
    }
    public static void main(String[] args) {
        String location = "//Users//apple//Desktop//sampleFile (1).txt";
        String fileInfo = readFileFromLocation(location);
        TreeMap<String, String> dataMap = storeFromFile(fileInfo);
        toPrint(dataMap);
    }
}
