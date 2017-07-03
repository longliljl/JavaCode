package com.ztesoft.test;

public class DateType {

	public static final Double CM_PER_INCH = 2.54;

	public static  void main(String[] args) {
		String x = "1";
		char y = 65;
		System.out.println(Double.isNaN(Double.parseDouble(x)));
		System.out.println(2.0-1.8);
		System.out.println('\u0023');
		System.out.println(y);
		System.out.println(Character.isJavaIdentifierPart('@'));
		int n = 11;
		int i=-10;
		System.out.println(Integer.MAX_VALUE);
        System.out.println((2147483647+3)/2);
		System.out.println(getAvg(2147483647,3));
		System.out.println(i>>2);
		int a=12;
		int b=-18;
		exchangeNum(a,b);

	}

    /**
     * 通过位运算判断数字位奇数还是偶数
     * @param num
     * @return
     */
	public static String isOddOrEven(int num){
	    int flag = num&1;
	    String str = "";
	    if(flag==1){
            str = "奇数";
        }else if(flag==0){
            str = "偶数";
        }
        return str;
    }

    /**
     * 取平均值，防止a+b的值超出int最大值
     * @param a
     * @param b
     * @return
     */
    public static int getAvg(int a,int b){
    	return (a&b)+((a^b)>>1);
    }

	/**
	 * 对于一个大于0的整数，判断它是不是2的几次方
	 * @param x
	 * @return
	 */
	public static boolean is2n(int x){
    	return ((x&(x-1))==0)&&(x!=0);
	}

	/**
	 * 比如有两个int类型变量x、y,要求两者数字交换，位运算的实现方法：性能绝对高效
	 * @param x
	 * @param y
	 */
	public static void exchangeNum(int x,int y){
		x ^= y;
		y ^= x;
		x ^= y;
		System.out.println("x = [" + x + "], y = [" + y + "]");
	}

	/**
	 * 求绝对值
	 * @param x
	 * @return
	 */
	public static int abs(int x){
		int y ;
		y = x >> 31 ;
		return (x^y)-y ;        //or: (x+y)^y
	}

	/**
	 * 6.  取模运算，采用位运算实现：
	 * a % (2^n) 等价于 a & (2^n - 1)
	 * 7.  乘法运算   采用位运算实现
	 * a * (2^n) 等价于 a << n
	 * 8.   除法运算转化成位运算
	 * a / (2^n) 等价于 a>> n
	 * 9.   求相反数
	 * (~x+1)
	 * 10  a % 2 等价于 a & 1
	 */
}
