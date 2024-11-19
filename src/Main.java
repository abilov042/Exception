import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Process process = new Process();

        while (true){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            try {
                process.process(a);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

        }



        //System.out.println("Salam");
    }
}