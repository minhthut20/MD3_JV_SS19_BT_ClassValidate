import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassValidate classValidate = new ClassValidate();
        System.out.print("Nhập vào tên lớp : ");
        String className = scanner.nextLine();
        System.out.println(className + " là " + classValidate.validate(className));
    }
}
