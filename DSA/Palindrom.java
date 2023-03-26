class Palindrom {
    public static void main(String[] args){
        int x = 121;
        String str = String.valueOf(x);
        int n =str.length();
        for(int i =0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("false");
            }
        } 
        System.out.println("true");
    } 
}
