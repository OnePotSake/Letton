/**
 * @author OnePotSake
 * @version 1.0
 * @project Letton
 * @description
 * @date 5/1/23 23:56:15
 */
public class ChangeNumbe {
  public static void main(String[] args) {

    getChange(14);


  }

  private static void getChange(int num) {
    if(num == 0) {
      System.out.println("第一次,这个树,不是奇数 也不是偶数!!!");
    }

    boolean flat = true;
    while (flat) {

      if(num <=0) {
        flat = false;
      }

      if(num%2  ==0 && (num - 1) > -1) {
        System.out.println(num + "是偶数,除2得到" + (num >>1) );
        num= (num/2) ;
        continue;
      }
      if (num%2 !=0 && (num - 1) > -1) {
        System.out.println(num + "是奇数,减去1得到" + (num - 1) );
        num--;
      }

    }


  }

/*  private static void getChange2(int num) {
    int set = 0;
    while (num > 0) {
      set += (num > 1 ? 1 : 0) + (num & 0x01);

      num >>= 1;
    }

    System.out.println(set);

    while (true) {

      if (set == 0) {
       break;
      }
      getChange2(set);
    }
  }*/

}
