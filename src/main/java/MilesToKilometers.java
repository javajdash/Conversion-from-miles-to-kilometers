/* (Conversion from miles to kilometers) Write a program that displays the following table (note that 1 mile is 1.609 kilometers):

--------------------------------------------------------------------

Miles           Kilometers
1                   1.609
2                   3.218
...
9                   14.481
10                16.090
*/

public class MilesToKilometers {
  public static void main(String[] args) {
    // Display table header
    System.out.printf("%-10s%-10s\n", "Miles", "Kilometers");
    // Display table body
    for (int miles = 1; miles <= 10; miles++) {
      System.out.println(miles + "\t\t" + miles * 1.609);
    }
  }
}