package prg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Map {
  private char[][] tiles;

  public Map(String path, Option option) throws IOException {
    BufferedReader reader = null;
    Scanner scanner = null;

    try {
      if (option == Option.BUFFER) {
        reader = new BufferedReader(new FileReader(path));
        String[] dimensions = reader.readLine().split(" ");
        int x = Integer.parseInt(dimensions[0]);
        int y = Integer.parseInt(dimensions[1]);
        tiles = new char[x][y];
        for (int i = 0; i < x; i++) {
          System.out.println("x = " + x + ", i = " + i);
          String[] row = reader.readLine().split(" ");
          for (int j = 0; j < y; j++) {
            tiles[i][j] = row[j].charAt(0);
            System.out.println("tiles["+i+"]" + "["+j+"] = "+tiles[i][j]);
          }
        }
      } else if (option == Option.SCANNER) {
        scanner = new Scanner(new File(path));
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        tiles = new char[x][y];
        for (int i = 0; i < x; i++) {
          for (int j = 0; j < y; j++) {
            tiles[i][j] = scanner.next().charAt(0);
          }
        }
      }
    } finally {
      if (reader != null) reader.close();
      if (scanner != null) scanner.close();
    }
  }
}