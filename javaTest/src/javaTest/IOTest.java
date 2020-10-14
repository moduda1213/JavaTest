package javaTest;

import java.io.*;

public class IOTest {
	static String fileName = "test.txt";
	static FileInputStream fis = null;
	static int count=0;
	static char a;
	public static void main(String[] args) {
		try {
			fis=new FileInputStream(fileName);
			System.out.println(fis.available());
			/*
			do {
				System.out.print((char)fis.read());
			}while(fis.read() != -1); // 1 x 3 x 5 이렇게 문자 출력 / 이유 ?
			*/
			for(int i = fis.available(); i>0;i--) {
				System.out.print((char)fis.read());
			}
		}catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 발생");
		}catch (IOException e) {
			System.out.println("IOException 발생");
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println("file.close(): 발생");
			}
		}
	}
}
