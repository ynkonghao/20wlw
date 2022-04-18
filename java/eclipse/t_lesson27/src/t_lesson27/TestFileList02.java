package t_lesson27;

import java.io.File;
import java.io.FileFilter;

public class TestFileList02 {
	public static void main(String[] args) {
		File f = new File("d:/test");
		File[] fs = f.listFiles(new MyFileFilter());
		for(File file:fs) {
			System.out.println(file.getName());
		}
	}
}

class MyFileFilter implements FileFilter {

	@Override
	public boolean accept(File f) {
		if(f.getName().endsWith(".txt")) {
			return true;
		}
		return false;
	}
	
}
