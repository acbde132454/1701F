package com.zhangsan.common.utils;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "f:/hello.txt";
		InputStream is = new FileInputStream(path);
		String content = readTextFile(is);
		System.out.println(content);
	}
	
	/*
	* 批量关闭流，参数能传无限个
	*/
	public static void closeAll(Closeable...ios){
		for(Closeable io : ios){
			if(io != null){
				try {
					io.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	* 传入一个文本文件对象，默认为UTF-8编码，
	* 返回该文件内容,
	* 要求方法内部调用上面第1个方法关闭流
	*/
	public static String readTextFile(InputStream src){
		byte[] temp = new byte[1024];
		int len = 0;
		String sb = "";
		try {
			while((len = src.read(temp)) != -1){
				sb += new String(temp, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(src);
		}
		
		return sb;
	}
}
