package learn;

import java.io.PrintWriter;

import jdepend.xmlui.*;

public class Sample_XML {
	public static void main(String[] args) throws Exception{
		JDepend db = new JDepend(new PrintWriter("report.xml"));
		db.addDirectory("T:\\21116001_TranVanBinh\\Library-Assistant");
		db.analyze();
		System.out.println("DONE");
	}
}
