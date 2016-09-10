import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class testEncoding {

	@Test
	public void testPrint() {
		try {
			System.out.println("中文");
			System.out.println("中文".getBytes());
			System.out.println("中文".getBytes("GB2312"));
			System.out.println("中文".getBytes("ISO8859_1"));
			System.out.println(new String("中文".getBytes()));
			System.out.println(new String("中文".getBytes(), "GB2312"));
			System.out.println(new String("中文".getBytes(), "ISO8859_1"));
			System.out.println(new String("中文".getBytes("GB2312")));
			System.out.println(new String("中文".getBytes("GB2312"), "GB2312"));
			System.out.println(new String("中文".getBytes("GB2312"), "ISO8859_1"));
			System.out.println(new String("中文".getBytes("ISO8859_1")));
			System.out.println(new String("中文".getBytes("ISO8859_1"), "GB2312"));
			System.out.println(new String("中文".getBytes("ISO8859_1"), "ISO8859_1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetEncoding(){
		System.out.println();
	}

}
