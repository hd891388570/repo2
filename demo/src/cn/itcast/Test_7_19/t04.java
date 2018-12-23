package cn.itcast.Test_7_19;

//1.定义数组,存储1-100(包括1和100)之间所有能被7整除的数字
//        2.定义方法,传递数组,计算数组元素最大值并将结果返回
//        3.定义方法,传递数组,计算数组元素最小值并将结果返回
//        3.定义方法,传递数组及最大值,最小值,将最大值和最小值进行交换,并打印交换后的数组


public class t04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i%7==0)
                count++;
        }
        int[] array = new int[count];
        int j = 0 ;
        for (int i = 1; i < 100; i++) {
            if (i%7==0){
                array[j] = i;
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("数组最大值为：" + max(array));
        System.out.println("数组最小值为：" + min(array));
        replace(array,max(array),min(array));
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    public static int min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static void replace(int[] array,int max,int min){
        int t = 0 , maxi = 0,mini = 0;
        for (int i = 0; i < array.length; i++) {
            if (max == array[i])
                maxi = i;
            if (min == array[i])
                mini = i;
        }
        t = array[maxi];
        array[maxi] = array[mini];
        array[mini] = t;
        System.out.println("最大值和最小值交换后的数组为:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
