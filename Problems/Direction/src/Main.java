import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){
            int number = scanner.nextInt();
            String result;
            switch(number){
                case 1:
                    result = "move up";
                    break;
                case 2:
                    result = "move down";
                    break;
                case 3:
                    result = "move left";
                    break;
                case 4:
                    result = "move right";
                    break;
                case 0:
                    result = "do not move";
                    break;
                default:
                    result = "error!";
                    break;
            }
            System.out.println(result);
        }
    }
}