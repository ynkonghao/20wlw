package t_lesson28;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestHtml {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter out = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new FileWriter("d:/test/20wlw.html"));
			String str = null;
			while((str=br.readLine())!=null) {
				if("quit".equals(str)) {
					break;
				}
				out.println(str);
			}
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
