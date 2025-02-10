package prg;

import java.io.IOException;

public class Game {
   public static void main(String[] args) {

      try {
         Map map = new Map("map.txt", Option.BUFFER);
         System.out.println("Map-ը հաջողությամբ կարդացվել է:");
         System.out.println("Քարտեզի բովանդակությունը՝");
      } catch (IOException e) {
         System.out.println("Սխալ տեղի ունեցավ ֆայլի կարդալիս: " + e.getMessage());
      }
   }
}