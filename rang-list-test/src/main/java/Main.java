import models.Kategory;
import models.Result;
import models.Runner;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();
        Writer writer = new Writer();
        List<Result> resultsList = new ArrayList<>();
        List<Runner> finalList = new ArrayList<>();
        resultsList = reader.saveAllResults("rang-list-test\\src\\main\\resources\\messresultate.txt");
        finalList = reader.saveAllRunners("rang-list-test\\src\\main\\resources\\startliste.txt", resultsList);
        finalList.forEach(run-> System.out.println(run.toString()));
        writer.createListSortedByName(finalList);
    }
}
