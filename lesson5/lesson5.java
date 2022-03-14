package lesson5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lesson5 {

    public static final String path = "src/resources/test.csv";
    public static void main(String[] args) throws IOException {


        File fileCSV = new File(path);
        AppData csv = new AppData(new String[] {"value1","value2","value3"}, new int[][] {{1,2,3}, {4,5,6}});

        writeCSV(csv);
        readCSV(fileCSV);
    }

    public static void writeCSV(AppData csv) throws IOException{

        String[] header = csv.getHeader();
        int[][] data = csv.getData();
        try (FileWriter wr = new FileWriter(path);) {
//            for (String i : header)
                wr.write(header[0] + ";" + header[1] + ";" + header[2] + "\n" +
                        data[0][0] + ";" + data[0][1] + ";" + data[0][2] + "\n" +
                        data[1][0] + ";" + data[1][1] + ";" + data[1][2] + "\n");
        }
    }

    public static void readCSV(File fileCSV) throws IOException{

        try (FileReader fr = new FileReader(path);){
            int length = (int) fileCSV.length();
            char[] a = new char[length];
            fr.read(a);
            for(char c : a)
                System.out.print(c);
        }
    }
}
