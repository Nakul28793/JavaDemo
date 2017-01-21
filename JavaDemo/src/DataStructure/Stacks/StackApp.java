package DataStructure.Stacks;

/**
 *Exception to indicate that Stack is full.
 */
class StackException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public StackException(){
        super();
    }
    
    public StackException(String message){
        super(message);
    }
    
}
  
/**
 * Stack class
 */
class Stack {
	private int size;
    private int[] stackAr;
    private int top; // top of stack
    private int len;
 
    /**
     * Constructor for initializing Array.
     */
    public Stack(int size) 
    {	if (size <= 0)  
    	{
    		throw new StackException("Stack's capacity must be positive");
    	}
    	this.size = size;
    	len=0;
        stackAr = new int[size]; // Creation of Stack array
        top = -1; // initialize Stack to with -1
    }
    
    /**
     * @return true if Stack is empty
     */
    public boolean isEmpty() 
    {
    	return (top == -1);
    }
 
    /**
     * @return true if stack is full
     */
    
    public boolean isFull() 
    {
    	return (top == size - 1);
    }
 
    /*  Function to get the size of the stack */
    public int getSize()
    {
        return len ;
    }
    
    /*  Function to check the top element of the stack */
    public int peek() 
    {
    	if(isEmpty())
    	{
    		throw new StackException("Stack is empty");
    	}
        return stackAr[top];
    }
    
    /**
     * Push items in stack, it will put items on top of Stack.
     */
    public void push(int value)
    {
    	if(isFull())
    	{
    		throw new StackException("Cannot push "+value+", Stack is full");
    	}
    	stackAr[++top] = value;
    	len++;
    }
 
    /**
     * Pop items in stack, it will remove items from top of Stack.
     */
    public int pop() 
    {
    	if(isEmpty())
    	{
    		throw new StackException("Stack is empty");
    	}
    	len-- ;
    	return stackAr[top--]; // remove item and decrement top as well.
    }
 
    /*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
        {
            System.out.print(stackAr[i]+" ");
        }
        System.out.println();
    } 
 
    
}
 

public class StackApp {
	public static void main(String[] args) 
    {
		try
	    {
			Stack stack = new Stack(4); // Creation of Stack
			stack.push(11);
			stack.push(21);
			stack.push(31);
			stack.push(41);
			//stack.push(51);
	 
			stack.display();
			
			System.out.println("Popped Element = " + stack.pop());
			System.out.println("Popped Element = " + stack.pop());
  
			
			System.out.println("Peek Element = " + stack.peek());
			System.out.println("Empty status = " + stack.isEmpty());
			System.out.println("Full status = " + stack.isFull());
			System.out.println("Size = " + stack.getSize());
			
	    }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }
}