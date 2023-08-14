import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        int size =4;
        int top=-1;
        int stack[]=new int[size];
       top= insert(stack,top,size,10);
      top=  insert(stack,top,size,20);
        print(stack,top);
        pop(stack,top);
        print(stack,top);
    }
    private static int pop(int stack[],int top){
        if(top==-1){
            System.out.println("stack is empty");
            return top;
        }
        System.out.println(stack[top]+"  popped");
        top--;
        return top;
    }
    private static int insert(int stack[],int top,int size,int value){
        if(top==size-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
    private static void print(int stack[],int top){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >=0; i--) {
            System.out.println(stack[i]);
        }
    }

}
