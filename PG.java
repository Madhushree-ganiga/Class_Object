class PG {
    public static void main(String []a) {
	Hospital h = new Hospital();
	int hh;
	String hhh;
	long hhhh;
	String hhhhh;
	String hhhhhh;
	String hhhhhhh;
	boolean z = h.admission();
	    System.out.println(z);
	String b = h.provideFood();
	    System.out.println(b);
	boolean c = h.vacancy(1);
	    System.out.println(c);
	h.id = 400012;
	h.name = "Madhu";
	h.contact = 1234567890;
	h.emailId = "madhu@wolkensoftware.com";
	h.website = "Mini's Nest";
	h.type = "girl";
	hh = h.id;
	hhh = h.name;
	hhhh = h.contact;
	hhhhh = h.emailId;
	hhhhhh = h.website;
	hhhhhhh = h.type;
	System.out.println(hh);
	System.out.println(hhh);
	System.out.println(hhhh);
	System.out.println(hhhhh);
	System.out.println(hhhhhh);
	System.out.println(hhhhhhh);
	}
}