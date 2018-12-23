package cn.itcast.Test_7_19;

//1.定义一个int类型数组,包含以下数据,12,25,36,45,78,96,121,456,0,7
//        2.定义print方法,传递数组,打印数组内所有元素,打印格式如下:
//        数组元素:[12,25,36,45,78,96,121,456,0,7]
//        3.定义getSum方法,传递数组,计算数组内元素和,并将结果返回
//        4.定义getAvg方法,传递数组及总和,计算平均值并返回
//        5.定义findNum方法,传递数字及平均值,打印小于平均值的元素.

public class t02 {
    public static void main(String[] args) {
        int[] array = new int[]{12, 25, 36, 45, 78, 96, 121, 456, 0, 7};
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1){
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ",");
        }
//        System.out.println();
        print(array);
        System.out.println("和是：" + getSum(array));
        System.out.println("平均值是：" + getAvg(array,getSum(array)));
        System.out.println("小于平均值的元素：");
        findNum(array, getAvg(array,getSum(array)));
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
                break;
            }
            System.out.print(array[i] + ",");
        }
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static double getAvg(int[] array , int sum){
        double avg;
        return avg = sum/(array.length + 0.0);
    }
    public static void findNum(int[] array, double avg){
//        int[] array2 = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<avg)
                System.out.print(array[i] +" ");
        }

    }
}
