package ash14;

public class ternary {
	public static void main(String[] args)
	{
	    int age=19;
	    boolean weight=true;
	    boolean candonate=(age>19)?true:false;
		boolean help= candonate?(weight?true:false):false;
	    System.out.println("age"+age);
	    System.out.println("has weight" + weight);
	    System.out.println(help);
	
	}

}
