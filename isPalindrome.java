class HelloWorld {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("aBBa"));
        System.out.println(isPalindrome("1234"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("o"));
        System.out.println(isPalindrome("99"));
    }
    
    public static boolean isPalindrome(String str){
        String rStr = "";
        for(int i=str.length()-1; i>=0; i--){
            rStr += str.charAt(i);
        }
    
        return (str.equalsIgnoreCase(rStr));
    }
}