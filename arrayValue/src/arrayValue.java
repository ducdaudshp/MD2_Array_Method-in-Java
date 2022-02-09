import java.util.Scanner;

public class arrayValue {
    public static void main(String[] args) {
        String[] student={"Duong","Duc","Giang","Bach"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Chọn tên: ");
        String input_name=scanner.nextLine();
        boolean isExist=false;
        for (int i=0;i<student.length;i++){
            if (student[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên trong danh sách "+input_name +" là: "+(i+1));
                isExist=true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không tìm tháy "+input_name+" trong danh sách");
        }
    }

}
