package cn.itcast.Test_7_20;

//有如下数组int[] arr={10,20,30,40,60,80};
//        定义一个方法求出数组这元素相加的结果并打印

public class Test09 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,60,80};
        int sum = sum(arr);
        System.out.println("和是：" + sum);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
