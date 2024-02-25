import java.util.*;

class App {
    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        System.out.println(f1.find(1024));
    }
}

class Factorial{
    public List<Integer> find(int num){
        List<Integer> factors = new ArrayList<>();
        
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                factors.add(i);
            }
        }
        
        return factors;
    }
}