class a {
	public static void main(String[] args) {
		
		String a[] = {"vijay","vijay1","vijay2","vijay3","vijay4"};
		String m = "vijay1";

		boolean fl = true;

		for (int i=0;i<a.length;i++) {
			if (a[i].equals(m)) {
				System.out.println("yes");
				fl = false;
				break;
			}
		}

		if (fl) {
			System.out.println("no");
		}

	}
}