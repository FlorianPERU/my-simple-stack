package deqo.fper.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by peru on 25/10/2018
 *
 * Exigence ....
 */



public class SimpleStackImpl implements SimpleStack{

    Stack <Object> wrappedStack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }


    public int getSize(){
        return wrappedStack.size();

    }

    public void push (Item item){
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException{
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException{
        return (Item) wrappedStack.pop();
    }

}
