import java.util.Arrays;
import java.util.Scanner;

public class AddValueInArray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] arr ={1,2,3,4,5,6,7,8,9};
        System.out.println("Nhap gia tri can chen");
        int num = scanner.nextInt();
        System.out.println("nhap vi tri can chen trong mang:");
        int index = scanner.nextInt();
        while (!(index>=0 && index<arr.length)){
            System.out.println("ban da nhap sai, xin moi nhap lai");
            index=scanner.nextInt();
        }
        System.out.println("Mang khi chua them");
        System.out.println(Arrays.toString(arr));
        int[] arr2 =addValue(arr,index,num);
        System.out.println("Mang sau khi them");
        System.out.println(Arrays.toString(arr2));

    }
    public static int[] addValue(int[] arr, int index, int num){
        for (int i = arr.length-1; i >index ; i--) {
            arr[i]=arr[i-1];
            arr[i-1]=num;
        }
        return arr;
    }
}
