package t_lesson28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSystemIn {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
				if("exit".equals(str)) {
					System.out.println("bye!bye!");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
