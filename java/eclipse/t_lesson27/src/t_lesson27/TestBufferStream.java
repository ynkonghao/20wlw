package t_lesson27;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferStream {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("d:/test/2.jpg"));
			bos = new BufferedOutputStream(new FileOutputStream("d:/test/2_b.jpg"));
			int len = 0;
			byte[] buf = new byte[1024];
			while((len=bis.read(buf))>0) {
				bos.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bos!=null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
