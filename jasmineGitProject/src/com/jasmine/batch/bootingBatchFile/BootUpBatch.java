package com.jasmine.batch.bootingBatchFile;

import java.util.ArrayList;
import java.util.List;

public class BootUpBatch {
	/*
	 * 输出格式
	 * @echo off
	 * start "" ""
	 * ping localhost -n 5
	 */
	public static void main(String[] args) {
		List<BootItem> bootItems = new ArrayList<>();
//		bootItems.add(new BootItem("QQ","qq.exe",4));
		StringBuilder strb = new StringBuilder();
		strb.append("@echo off\n");
		System.out.print(strb);
		for(BootItem b : bootItems){
			strb.setLength(0);
			strb.append("start ").append("\"").append(b.getName()).append("\" ").append("\"").append(b.getPath()).append("\" \n")
				.append("ping localhost -n ").append(b.getSecond()).append("\n");
			System.out.print(strb);
		}
	}
}