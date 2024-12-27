

import java.util.Scanner;


abstract class Series {
 
 public abstract int nextTerm();
}


class GeometricSeries extends Series {
 private int currentResource; 
 private int ratio; 

 
 public GeometricSeries(int initialTerm, int ratio) {
     this.currentResource = initialTerm;
     this.ratio = ratio;
 }

 
 public int nextTerm() {
     int next = currentResource;
     currentResource *= ratio;
     return next;
 }
}

public class ResourceCollectionGame {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     
     int initialResource = scanner.nextInt();
     
     
     int growthRatio = scanner.nextInt();

     
     int numberOfPlanets = scanner.nextInt();

     
     GeometricSeries series = new GeometricSeries(initialResource, growthRatio);

     
     for (int i = 0; i < numberOfPlanets; i++) {
         System.out.print(series.nextTerm());
         if (i < numberOfPlanets - 1) {
             System.out.print(" ");
         }
     }

 }
}

