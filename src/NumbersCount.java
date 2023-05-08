/**
 * @author OnePotSake
 * @version 1.0
 * @project Letton
 * @description
 * @date 5/2/23 00:57:13
 */
public class NumbersCount {
  public static void main(String[] args) {
    int[][] ints = {{1, 2}, {3, 4,5}};

    for (int i = 0; i < ints.length; i++) {
      int ccc = 0;
      for (int j = 0; j < ints[i].length; j++) {
         ccc+=ints[i][j];
      }
      System.out.println("第"  + (i+1) + "组和为: " + ccc);
    }

  }
}
