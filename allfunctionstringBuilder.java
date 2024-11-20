public class allfunctionstringBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abhi");
        sb.append("h");
        System.out.println(sb);
        sb.setCharAt(3, 's');
        System.out.println(sb);
        sb.delete(3, 4);
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        
    }
}