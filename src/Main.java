public class Main {

  public static void main(String[] args) {
    method2();


  }

 public static void  method () {
   int[] number = new int[] {1,2,3,4};

   // 判断 number 长度不能为空,或者小于1.
   //最大长度不能大于 1000

   int[] ints = runningSum(number);
   for (int j = 0; j < ints.length; j++) {
     System.out.print(ints[j] + " ," );
   }

   runningSum(number);
  }

  public static int [] runningSum(int [] numes) {

    if(numes == null || numes.length < 1) {
      return null;
    }
    if(numes.length == 1) {
      return numes;
    }

    int count = 1;
    int[] outNumbers = new int[numes.length];
    outNumbers[0] = numes[0];

    while(numes.length != count) {
      outNumbers = recursion(numes, outNumbers, count);
      count++;
    }

    // 如果集合总和在 10^6 ~ 10^6次方之间

    return outNumbers;
  }


  public static int[] recursion (int[] srcNumber,  int[] outNumber, int count) {
     if(count > 0 || count == srcNumber.length) {
       outNumber[count] = outNumber[count - 1] + srcNumber[count];
     }

    return outNumber;
  }


  public static void  method2() {
    int maxNumber = 4;
    int countNumber = 0;

    for (int i = 1; i <=maxNumber; i++) {
      countNumber = countNumber + i;
      System.out.print(countNumber + ",");
    }

  }
}