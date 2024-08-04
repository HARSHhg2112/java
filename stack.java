import java .util.*;
public class stack {
    static class stacka{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(int data){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        stacka s =new stacka();
        stacka.push(1);
        stacka.push(2);
        s.push(3);
        while(!stacka.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        

        

    }
    
    
}
