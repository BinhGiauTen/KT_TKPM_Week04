package learn;

import jdepend.framework.JDepend;

public class Sample {
	public static void main(String[] args) throws Exception{
		JDepend db = new JDepend();
		db.addDirectory("T:\\21116001_TranVanBinh\\Library-Assistant");
		db.analyze();
		System.out.println("DONE");
	}
}
