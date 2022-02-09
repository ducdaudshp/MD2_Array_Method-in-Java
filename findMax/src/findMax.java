import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int [] array;
        int size;
        do {
            System.out.println("Nhập số lượng phần tử");
            size= inputValue.nextInt();
            if (size<2)
                System.out.println("Số phần tử phải lớn hơn 2");
        } while (size<2);
        array = new int[size];
        for (int i=0;i< array.length;i++){
            Scanner newValue=new Scanner(System.in);
            System.out.println("Phần tử thứ "+(i+1)+" là: ");
            array[i]=newValue.nextInt();
        }
        System.out.printf("%-20s%s","Mảng phần tử: ","");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.printf("\n %-20s%s","Phần tử lớn nhất của mảng là: ", "");
        int max=array[0];
        for (int i=0;i< array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.print(max);
    }
}
