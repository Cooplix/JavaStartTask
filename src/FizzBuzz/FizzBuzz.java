package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            String iterI = String.valueOf(i);
            String fizz = "Fizz";
            String buzz = "Buzz";

            if(i % 3 != 0)
                fizz = "";
            else
                iterI = "";

            if(i % 5 != 0)
                buzz = "";
            else
                iterI = "";

            System.out.println(iterI + "" + fizz + "" + buzz);
        }
    }
}
