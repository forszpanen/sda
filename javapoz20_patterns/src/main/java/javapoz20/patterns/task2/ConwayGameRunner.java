package javapoz20.patterns.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConwayGameRunner {
    public static void main(String[] args) throws IOException {

//        ConwayGame.getInstance().init();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        main:
        do {
            line = br.readLine();
            switch (line.toLowerCase().trim()) {
                case "x": {
                    break main;
                }

                case "": {
//                    ConwayGame.getInstance().nextStep();
                }
            }
        } while (true);
    }

}
