class Home{
public static void main(String[] args)
{
Furniture fn=new Furniture();
fn.tosleep();
String fnType=fn.type;
System.out.println(fnType);
fn.type="Sofa";
fnType=fn.type;
System.out.println(fnType);
}
}