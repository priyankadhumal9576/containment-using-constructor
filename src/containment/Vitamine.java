package containment;

public class Vitamine 
{
 String vitamineName;
 int proportion;
 String useToBody;
 
public Vitamine()
 {
	 
 }
public Vitamine(String vName,int prop,String use)
{
	vitamineName=vName;
	proportion=prop;
	useToBody=use;
	
}
public String toString()

{
	return"vitamine name:" +vitamineName+  "\n"+   "proportion:" +proportion+   "\n"+  "has use to body:"+useToBody;
}

}
