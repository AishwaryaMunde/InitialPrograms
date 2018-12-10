package datastructure;

public class ParenthesisStackMethods 
{
	int maxsize ;
	int top;
	String[] array;
	public ParenthesisStackMethods(String expression)
	{
		maxsize = expression.length();
		array = new String[maxsize];
		top=0;
	}
	
	public void push(String expression) 
	{
		array[top++] = expression;
		return;
	}

	public String peek()
	{
		return array[top];
	}
	public boolean isEmpty() 
	{
		if(top==0)
		{
			return true;
		}
		else
			return false;
	}

	public String pop() 
	{
		return array[top--];
	}

}
