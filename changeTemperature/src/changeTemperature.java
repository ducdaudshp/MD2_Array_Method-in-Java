import java.util.Scanner;

public class changeTemperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice =-1;
        double celsius;
        double fahrenheit;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Độ F sang độ C");
            System.out.println("2. Độ C sang độ F");
            System.out.println("0. Thoát");
            System.out.println("--------------------");
            System.out.println("Mời nhập lựa chọn!!!");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Nhập độ F: ");
                    fahrenheit= scanner.nextDouble();
                    System.out.println("Nhiệt độ đổi từ độ F sang độ C là: "+fToC(fahrenheit));
                    break;
                case 2:
                    System.out.print("Nhiệt độ C: ");
                    celsius= scanner.nextDouble();
                    System.out.println("Nhiệt độ đổi từ độ C sang độ F là: "+cToF(celsius));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn");
            }
        }
    }
    public static double cToF(double celsius){
        double F=(9.0/5)*celsius+32;
        return F;
    }
    public static double fToC(double fahrenheit){
        double C=(5.0/9)*(fahrenheit-32);
        return C;
    }
}
