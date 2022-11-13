package file.handling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadContent {
    public static void removeDuplicate(String loc) throws IOException {
        FileReader file = new FileReader(loc);
        int i;
        char c;
        String str = "";
        while ((i = file.read()) != -1)
        {
            System.out.print((char)i);
            c = (char)i;
            str = str + String.valueOf(c);
        }
        str = str.replaceAll(" ", "");
        String arr[] = str.split(",");
        System.out.println("\n" + str);
        int len = arr.length;
        System.out.println("length of existing array :"+len);
        Arrays.sort(arr);

        System.out.println("Remove duplicate names");
        for (int k = 0; k < len - 1; k++) {
            for (int j = k + 1; j < len; j++) {
                if (arr[k].equalsIgnoreCase(arr[j])) {
                    arr[j] = arr[len - 1];
                    len--;
                }
            }
        }
        for (int q = 0; q < len; q++) {
            System.out.print(arr[q] + ",");
        }
        System.out.println("");
        System.out.println("length of new array :"+len);

    }
    public static void main(String[] args) throws IOException {
        String location = "//Users//apple//Documents//amit//filehandling//FruitsName.txt";
        removeDuplicate(location);
    }
}
