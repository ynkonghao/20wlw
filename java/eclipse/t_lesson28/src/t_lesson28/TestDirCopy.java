package t_lesson28;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDirCopy {
	public static void main(String[] args) {
		File f = new File("d:/test/file");
		File[] files = f.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				if(file.isFile()) return true;
				return false;
			}
		});
		for(File file:files) {
			copy(file.getPath(),"d:/test/20wlw1/"+file.getName());
		}
	}
	
	public static void copy(String old,String destPath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(old);
			fos = new FileOutputStream(destPath);
			int len = 0;
			byte[] buf = new byte[1024];
			while((len=fis.read(buf))>0) {
				fos.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
