package com.zhangsan.common.utils;

import java.io.File;

public class FileUtil {
	

	public static void main(String[] args) {
		getUserDirectory();
	}
	
	/*
	* 给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		return fileName.substring(fileName.lastIndexOf(".") + 1);
	}
	
	/*
	* 返回操作系统临时目录
	*/
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	
	/*
	* 返回操作系统用户目录
	*/
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		System.out.println(path);
		return new File(path);
	}
}
