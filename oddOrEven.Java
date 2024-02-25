class App {
    public static void main(String[] args) {
        System.out.println(isEven(1));
        System.out.println(isEven(2));
        System.out.println(isEven(4));
        System.out.println(isEven(8));
        System.out.println(isEven(11));
    }
    
    public static boolean isEven(int n){
        return (n % 2 == 0);
    }
}