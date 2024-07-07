public class reverse {
    public static void main(String[]args){

// first way of revsersing by stringbuilder
    StringBuilder sb = new StringBuilder("abhishek");  
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;

            Character frontchar = sb.charAt(i);
            Character backchar = sb.charAt(sb.length()-1-i);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

                   
        }
        System.out.println(sb);

// second way of revsersing by string
    String str = "abhishek";
    String reverse ="";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        
        }
        System.out.println(reverse);

    }
}
