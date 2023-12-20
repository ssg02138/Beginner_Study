public class AuthApp {

    public static void main(String[] args) {


        String id = "min";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];



        System.out.println("Hi.");

        //if(inputId == id) {
//        if(inputId.equals(id)) {
//            if (inputPass.equals(pass)) {
//            System.out.println("Master!");
//        } else {
//            System.out.println("Wrong password!");
//        } else{
//            System.out.println("Who are you?");
//        }
        // && - 논리연산자
        if(inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }

    }
}
