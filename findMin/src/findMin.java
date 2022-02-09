import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] arr;
        int size;
        System.out.println("Nhập mảng n phần tử");
        size=input.nextInt();
        arr =new int[size];
        for (int i=0;i< arr.length;i++){
            System.out.print("Phần tử "+(i+1)+ ": ");
            arr[i]=input.nextInt();
        }
        System.out.println("Mảng phần tử: ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        int index=minValue(arr);
        System.out.println("\nPhần tử nhỏ nhất của mảng là: "+arr[index]);
    }
    public static int minValue(int [] array){
        int index=0;
        for (int i=0;i< array.length;i++){
            if (array[i]<array[index])
                index=i;
        }
        return  index;
    }
}
