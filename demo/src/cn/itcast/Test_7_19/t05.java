package cn.itcast.Test_7_19;

//定义整数类型数组,数组内存储如下元素:0,1,2,3,4,5,6,7,8,9
//        将数组内元素进行交换,交换规则如下:1索引元素和0索引元素进行交换,2索引元素和1索引元素进行交换...9索引元素和8索引元素进行交换(不允许直接手动给出索引进行交换)
//        结果如下:
//        原数组:[0,1,2,3,4,5,6,7,8,9]
//        交换后数组:[1,2,3,4,5,6,7,8,9,0]

public class t05 {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int temp = 0;
        for (int i = 0,j = 1 ; i < 9;i++,j++){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
