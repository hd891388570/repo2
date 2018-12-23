package cn.itcast.Test_7_20;

//已知数组int[] nums = {5,10,15},,要求创建一个新数组
//        1.新数组的长度和已知数组相同
//        2.新数组每个元素的值 是已知数组对应位置元素的2倍
//        3.在控制台中打印新数组的所有元素

public class Test05 {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15};
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i] * 2;
            if (i != arr.length - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.println(arr[i]);
        }

    }
}
