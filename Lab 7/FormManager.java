public class FormManager {
    public static void validateInput(String input) throws InvalidInputException{
        if(input == null || input.isEmpty()){
            throw new InvalidInputException("Input cannot be empty or null.");
        }
    }
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter text: ");
        String userInput = scanner.nextLine();

        try{
            validateInput(userInput);
            System.out.println("Valid Input: " + userInput);
        } catch(InvalidInputException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
