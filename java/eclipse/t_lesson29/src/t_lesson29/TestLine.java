package t_lesson29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLine {
	public static void main(String[] args) {
		System.out.println(getLineByDir("D:\\teach_source\\class2"));
	}
	
	public static int getLineByDir(String dir) {
		int count = 0;
		File file = new File(dir);
		File[] files = file.listFiles();
		for(File f:files) {
			if(f.isFile()) {
				if(f.getName().endsWith(".java")) {
					count+=getLine(f.getPath());
				}
			} else {
				count+=getLineByDir(f.getPath());
			}
		}
		return count;
	}
	
	public static int getLine(String file) {
		BufferedReader br = null;
		int count = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			String str = null;
			while((str=br.readLine())!=null) {
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
