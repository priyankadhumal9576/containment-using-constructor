package containment;

public class Fruit
{
	String fruitName;
	String fruitTaste;
	Vitamine v;//containment
	
	public Fruit(String name,String taste,Vitamine v1)
	{
		fruitName=name;
		fruitTaste=taste;
		v=v1;
	}
	public String toString()
	{
		return fruitName+"has taste"+fruitTaste+"has one of vitamine"+v; 
	
	}
	public void showDetails()
	{
		System.out.println("Name of the fruit is: "+fruitName);
		System.out.println("Taste of trhe fruit is: "+fruitTaste);
		System.out.println(v+"");
	}
	

}
