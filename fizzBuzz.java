class App {
    public static void main(String[] args) {
        int ctr = 0;
        while(ctr <= 30){
            System.out.printf("%d is ", ctr);
            fizzBuzz(ctr);
            System.out.printf("%n");
            ctr++;
        }
        
    }
    
    public static void fizzBuzz(int n){
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (n % 3 == 0){
            System.out.println("Fizz");
        }
        else if(n % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(n);
        }
    }
}