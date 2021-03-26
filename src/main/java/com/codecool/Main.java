package com.codecool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    static Player parsePlayer(String line) {
        Player result = new Player();
        String[] sarr = line.split(",");
        result.name = sarr[0];
        for (int i = 1; i < sarr.length; i++) {
            result.score += Integer.parseInt(sarr[i]);
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"));
        List<Player> result = new ArrayList<>(lines.size());
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            result.add(i, parsePlayer(line));
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
