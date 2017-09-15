package com.jasmine.InputOutputStream;

import java.io.File;
import java.io.IOException;

public class CreateBatchFile {
	/*
	 * 适用于单线程创建并写入文件
	 */
	public static void main(String[] args) {
		StringBuilder filePath = new StringBuilder("C:\\Users\\Administrator\\Desktop");
		StringBuilder fileName = new StringBuilder("jasmineBooting.bat");
		StringBuilder filePathAndName = filePath.append("\\").append(fileName);
		File batch = new File(filePathAndName.toString());
//		if (!batch.getParentFile().exists()) {
//			batch.getParentFile().mkdirs();
//		}
		try {
			batch.createNewFile();
		} catch (IOException e) {
			System.err.println("文件创建失败！");
			e.printStackTrace();
		}
	}
}
