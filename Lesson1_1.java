import java.math.BigInteger;

public class Lesson1_1 {
  
   /**

    * @Description: 十进制转换成二进制
    * @param decimalSource
    * @return String
    */
    public static String decimalToBinary(int decimalSource) {
       BigInteger bi = new BigInteger(String.valueOf(decimalSource)); // 转换成 BigInteger 类型，默认是十进制
       return bi.toString(2); // 参数 2 指定的是转化成二进制
    }

    /**
    * @Description: 二进制转换成十进制
    * @param binarySource
    * @return int
    */
    public static int binaryToDecimal(String binarySource) {
       BigInteger bi = new BigInteger(binarySource, 2);  // 转换为 BigInteger 类型，参数 2 指定的是二进制
       return Integer.parseInt(bi.toString());     // 默认转换成十进制
    }
    public static void main(String[] str) {
        System.out.println(decimalToBinary(10));
        System.out.println(binaryToDecimal("1010"));
    }
}
