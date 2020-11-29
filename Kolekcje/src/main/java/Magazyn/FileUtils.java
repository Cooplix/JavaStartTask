package Magazyn;

import java.io.*;
import java.util.*;

public class FileUtils {
    private String fileName;


    public FileUtils(String fileName) {
        this.fileName = fileName;
    }


    private  List<String> readFile(String fileName) throws FileNotFoundException {
        List<String> allLines = new ArrayList<String>();
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            allLines.add(line);
        }

        return allLines;
    }

    public Map<String, Integer> readProducts() throws FileNotFoundException {
        List<String> contentFile = readFile(fileName);
        Map<String, Integer> result = new HashMap<String, Integer>();

        for(String row :contentFile) {
            String  [] elements = row.split(";");
            result.put(elements[0], Integer.valueOf(elements[1]));
        }
        return result;
    }

    public void writeToFile(String fileName, String name, int quantity)  {
        String writeStringToFile = name + ";" + quantity;

        File file = new File(fileName);
        FileWriter fr = null;
        if(name != null && quantity >= 1) {
            try {
                fr = new FileWriter(file, true);
                fr.write("\n");
                fr.append(writeStringToFile);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public String getFileName() {
        return fileName;
    }
}
