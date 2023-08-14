public class stack_1 {
    public static void main(String[] args) {
        int top = -1;
        int size = 3;
        int[] stack=new int[size];
        System.out.println(isEmpty(top));
        top= push(stack,top,size,10);
        top = push(stack,top,size,20);
        top = push(stack,top,size,30);
        top = push(stack,top,size,60);
        display(stack,top);
        System.out.println( isEmpty(top));

    }
    private static boolean isEmpty(int top){
        if (top == -1){
            return  true;
        }
        return  false;
    }
    private static int push(int[] stack,int top,int size,int value){
        if (top==size-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top] = value;
        return top;
    }
    private static void display(int[] stack,int top){
        if (top == -1){
            System.out.println("stack is empty");
            return;
        }
        for (int i = top; i >= 0 ; i--) {
            System.out.println(stack[i]+" ");
        }
    }
}
