public class Calculator {
    private int sum;
    private int product;

    public static void main(String[] args) {
        // Prints "Hello, World" in the terminal window.


        Calculator sasa = new Calculator();
        sasa.printit();
        System.out.println("The sum of tyhe two umbers is " + sasa.addTwoNumbers(4,7));
        System.out.println("The concat of teo strings " + sasa.conctinateString("hanes","Alazar"));
    }

    public int addTwoNumbers(int firstNum, int seconNuber){

        sum =  firstNum+ seconNuber;
        return sum;
    }

    private String conctinateString(String fstring, String sstring){

        String concatinatedString =  fstring.concat(sstring);
        return concatinatedString;
    }

    public void printit(){
        System.out.println("Am only printing not returning ");

    }



}