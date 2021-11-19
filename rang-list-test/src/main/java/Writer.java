import models.Runner;

import java.io.*;
import java.util.List;

public class Writer {
    public void createListSortedByName(List<Runner> runnerList) {
        try {
        File file = new File("rang-list-test\\src\\main\\resources\\namen.ref.txt");
        FileOutputStream fos = new FileOutputStream(file);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fos));

        runnerList.forEach(
                runner -> {

                    try {
                        bufferedWriter.write(runner.getNumber() + " " + runner.getName() + " " + runner.getKategory() + " " + runner.getTime());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bufferedWriter.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );

        bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
