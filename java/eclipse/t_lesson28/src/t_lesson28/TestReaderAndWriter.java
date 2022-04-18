package t_lesson28;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestReaderAndWriter {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter out = null;
		try {
			br = new BufferedReader(new FileReader("d:/test/2.java"));
			out = new PrintWriter(new FileWriter("d:/test/2_c.java"));
			String str = null;
			//需要注意的是，读的每一行会自动把末尾的换行符去掉。
			while((str=br.readLine())!=null) {
				out.println(str);
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
			if(out!=null) out.close();
		}
	}
}
