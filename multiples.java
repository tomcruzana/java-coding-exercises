class App {
    public static void main(String[] args) {
        for(int i=1; i<=12; i++){
            multiples(i, 10);
        }
    }
    
    public static void multiples(int n, int range){
        for(int i=1; i <= range; i++){
            System.out.printf("%d x %d = %d %n", n, i, (n * i));
        }
        
    }
}