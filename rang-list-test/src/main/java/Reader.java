import models.Kategory;
import models.Result;
import models.Runner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reader {
    public List<Result> saveAllResults(String path) {
        List<Result> resultsList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            List<String> results = new BufferedReader(fileReader)
                    .lines()
                    .collect(Collectors.toList());
            results.forEach(line -> {
                String[] result = line.split(" ");
                List<String> values = Arrays.stream(result).filter(value-> !value.isEmpty()).collect(Collectors.toList());
                if (values.size() == 2) {
                    resultsList.add(new Result(Integer.parseInt(values.get(0)), values.get(1)));
                }
            });
            return resultsList;
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return resultsList;
    }

    public List<Runner> saveAllRunners(String path, List<Result> resultsList) {
        List<Runner> runnersList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            List<String> runners = new BufferedReader(fileReader)
                    .lines()
                    .collect(Collectors.toList());

            runners.forEach(line -> {
                String correctLine = " " + line;
                String[] result = correctLine.split(" ");
                List<String> values = Arrays.stream(result).filter(value-> !value.isEmpty()).collect(Collectors.toList());
                String[] bigResult = values.get(0).split("\t");
                List<String> valuesDone = Arrays.stream(bigResult).filter(value-> !value.isEmpty()).collect(Collectors.toList());
                if (valuesDone.size() == 3) {
                    Optional<Result> runnerResult = resultsList.stream().filter(x -> x.getNumber() == Integer.parseInt(valuesDone.get(0)))
                            .findFirst();
                    runnerResult.ifPresent(value -> runnersList.add(new Runner(Integer.parseInt(valuesDone.get(0)), Kategory.values()[Integer.parseInt(valuesDone.get(1)) - 1], valuesDone.get(2), value.getTime())));
                }
            });
            return runnersList;
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return runnersList;
    }



}
