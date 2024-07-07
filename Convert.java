public class Convert{
    public static void main(String[] args) {
        String str = "1234";
        int number = Integer.parseInt(str);
        System.out.println(number);
        
        int oddno = 1357;
        String collect = Integer.toString(oddno);
        System.out.println(collect);
        for (int i = 0; i < collect.length(); i++) {
            System.out.println(collect.charAt(i));
            
        }
        

        
        
    }
}