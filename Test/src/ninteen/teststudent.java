package ninteen;

class teststudent {
	public static void main(String[] args) {
		System.out.println("program started");
		shop sh = new shop("katappa stores");
		student st = new student("kiran");
		pen mypen = sh.buypen(10.00);
		noteBook mybook = sh.buybook(35.00);
		st.preparenotes(mypen, mybook);
		System.out.println("program started");
	}
}
