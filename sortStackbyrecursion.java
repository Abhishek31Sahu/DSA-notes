import java.util.*;
public class sortStackbyrecursion{
    static void sorting(Stack<Integer> st,int temp){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        // else{
            if(st.peek()<=temp) st.push(temp);
            else{
                int t = st.pop();
                // sort(st);
                sorting(st,temp);
                st.push(t);
            }
        // }C:\Users\Abhishek Sahu\sortStackbyrecursion.java
        

    }
    static void sort(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        sort(st);
        sorting(st,temp);

    }

    public static void main(String[] args){
        // solution sc = new solution();
        Stack<Integer> st = new Stack<>();
        st.push(34);
        st.push(3);
        st.push(45);
        st.push(3);
        st.push(92);
        st.push(23);
        sort(st);
        System.out.println(st);
    }
}