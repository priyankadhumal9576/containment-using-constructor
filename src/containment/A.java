package containment;

public class A 
{

	public static void main(String[] args)
	{
		Vitamine obj=new Vitamine("c" ,45, "skin");
       Fruit f=new Fruit("orange","bitter",obj);
      // f.showDetails(); 
      
        System.out.println(f);
	}

}
