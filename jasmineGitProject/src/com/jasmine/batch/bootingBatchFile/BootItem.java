package com.jasmine.batch.bootingBatchFile;

public class BootItem{
	String name;
	String path;
	Integer second;
	public BootItem() {	}
	public BootItem(String name, String path, Integer second) { this.name = name; this.path = path; this.second = second; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getPath() { return path; }
	public void setPath(String path) { this.path = path; }
	public Integer getSecond() { return second; }
	public void setSecond(Integer second) { this.second = second; }
}