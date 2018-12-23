package cn.itcast.Test_7_20;

//分析以下需求并用代码实现：
//        1.统计整数1-100（包括1和100）之间能同时被3和7整除的数字的个数
//        2.使用步骤1统计的个数创建该长度的数组
//        3.使用该数组存储整数1-100（包括1和100）之间能同时被3和7整除的数字
//        4.遍历数组，打印数组内元素，格式示例如下：
//        [元素1,元素2，元素3...]

public class Test08 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        int count = 0, j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println("整数1-100（包括1和100）之间能同时被3和7整除的数字的个数：" + count);
        int[] array1 = new int[count];
        for (int i = 0; i < 100; i++) {
            if (array[i] % 3 == 0 && array[i] % 5 == 0) {
                array1[j] = array[i];
                j++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < array1.length; i++) {
            if (i != array1.length-1)
            System.out.print(array1[i] + ",");
            else
                System.out.print(array1[i] + "]");
        }
    }

}
