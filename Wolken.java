class Wolken
{
  int id;
  String name;
  String emailid;
  long contactnumber;
  
  Wolken()
  {
	   System.out.println("WELCOME TO WOLKEN..!..Wolken Software works list\n");
  }
  Wolken(int i)
  {
	  this.id=i;
  }
  Wolken(int i,String n,String e,long c )
  {
	  this(i);
	 // this.id=i;
	  this.name=n;
	  this.emailid=e;
	  this.contactnumber=c;
  }
  void display()
   {
     System.out.println(id+" "+name+" "+emailid+" "+contactnumber);
	}  
  public static void main(String args[])
  {
	  Wolken wl=new Wolken();
	  Wolken w2=new Wolken(10,"Madhushree","madhushre@gmail.com",1234567890);
	  Wolken w3=new Wolken(13,"Ramya","ramya@gmail.com",1234567891);
	  Wolken w4=new Wolken(14,"Raj","raj@gmail.com",1234567892);
	  Wolken w5=new Wolken(16,"Rax","rax@gmail.com",1234567893);
	  w2.display();
	  w3.display();
	  w4.display();
	  w5.display();
  }
}  