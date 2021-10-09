class WolkenS {
    String id;
	String emailId;
	long contact;
	
	WolkenS() {
	    System.out.println();
	}
	WolkenS(String idd) {
	    id = idd;
	}

	WolkenS(String idd, String emailId, long contact) {
	    this(idd);
		this.emailId = emailId;
		this.contact = contact;
	}
	void result() {
		System.out.println(id + "\t" + emailId + "\t" + contact);
	}
}