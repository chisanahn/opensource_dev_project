package week8.ex;

class MyStack<T> {
    int tos;
    Object [] stck;
    public MyStack() {
        tos = 0;
        stck = new Object [10];
    }
    public void push(T item) {
        if(tos == 10)
            return;
        stck[tos] = item;
        tos++;
    }
    public T pop() {
        if(tos == 0)
            return null;
        tos--;
        return (T)stck[tos];
    }
}

public class Ex7_9 {
    public static void main(String[] args) {
        MyStack<String> stringStack = new MyStack<String>();
        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");
        for(int n=0; n<3; n++)
            System.out.println(stringStack.pop());
        MyStack<Integer> intStack = new MyStack<Integer>();
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);
        for(int n=0; n<3; n++)
            System.out.println(intStack.pop());
    }
}
