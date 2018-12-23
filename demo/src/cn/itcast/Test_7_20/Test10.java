package cn.itcast.Test_7_20;

//主方法中给定数组int[] arr= {10,20,30,40,50,60};这个数组没有重复元素.定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值

public class Test10 {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        int inderx = getindex(arr);
        System.out.println("最大元素的索引是 :" + inderx );
    }

    public static int getindex(int[] arr) {
        int k = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                k = i;
        }
        return k;
    }
}
