package org.khj.dbtest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str=sdf.format(date);
		
		System.out.println(date);
		System.out.println(str.replace("-", File.separator));
	}
	
}
