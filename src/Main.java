

public class Main {


    public static void main(String[] args) {

        String str = "abc";
        int x = 14;
        int y = 0;

        int[] arr = {2,2,2,1};

        String[] food = {"Pizza","Fries","Pasta","Hamburger","Sushi"};
        String[] order1 = {"PC","Mouse","Keyboard","Screen","Printer"}; // 4800
        String[] order2 = {"PC","Mouse","Keyboard"}; // 3100

        


    }

    public static void breakFunc(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5)
                break;
        }
        System.out.println("after");
    }
    public static void returnFunc(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                return;
            }
        }
        System.out.println("after");
    }

    public static void continueFunc(){
        for (int i = 0; i < 10; i++) {
            if (i == 3){
                continue;
            }
            else{
                System.out.println(i);
            }

        }
    }

    public static void print(){
        System.out.println();
    }

    public static void print(String s){
        System.out.println(s);
    }

    public static void print(int x){
        System.out.println(x);
    }


    public static void print(boolean b){
        System.out.println(b);
    }

    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printString(String s){
        System.out.println(s);
    }

    public static void printSum(int x, int y){
        System.out.println(x + y);
    }

    public static int returnFive(){
        return 5;
    }

    public static int sum(int x, int y){
//        int sum = x + y;
//        return sum;
        return x + y;
    }

    public static int sub(int x, int y){
        return x - y;
    }

    public static int mult(int x, int y){
        return x * y;
    }

    public static int div(int x, int y){
        if(y == 0){
            return 0;
        }else{
            return x / y;
        }
//        int result;
//        if(y == 0){
//            result = 0;
//        }else{
//            result = x / y;
//        }
//        return result;
    }

    public static int sumArr(int[] arr){
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        return sum;
    }

    public static int totalPrice(String[] arr){
        int sum = 0;
        for(String s : arr){
            switch (s){
                case "PC":
                    sum += 2500;
                    break;
                case "Screen":
                    sum += 1200;
                    break;
                case "Mouse":
                    sum += 250;
                    break;
                case "Printer":
                    sum += 500;
                    break;
                case "Keyboard":
                    sum += 350;
                    break;
                default:
                    sum += 0;
            }
        }
        return sum;
    }

    public static void handleOrder(String[] arr, String paymentMethod, boolean isValid){
        int result = totalPrice(arr);
        if (paymentMethod.equals("Cash")){
            System.out.println(String.format("Please give %s shekels to the cashier",result));
        }else if(paymentMethod.equals("Check")){
            System.out.println(String.format("Please write a check for this %s and give it to the cashier",result));
        }else if(paymentMethod.equals("CC")){
            System.out.println(isValid ?
                            String.format("Your credit card was charged with %s shekels, thanks for buying!",result) :
                            "Your credit card is not valid, please try to pay again with a different method");
        }else{
            System.out.println("Please choose a valid payment method");
        }
    }




}


