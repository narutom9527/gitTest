package com.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class GitDao {
	/**
	 * 修改编码格式为UTF-8
	 */
	public void update() {
		System.out.println("完成修改方法");
		System.out.println("完善修改方法");
		System.out.println("更新修改方法");
    }
	public String message() {
		return "测试成功！";
				
	}
	public void readerAndWrite() {
		File readerFile = new File("reader.txt");
		File writeFile = new File("write.txt");
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(readerFile));
			bw = new BufferedWriter(new FileWriter(writeFile));
			StringBuffer sb = new StringBuffer();
			String line = null;
			while((line = br.readLine()) != null) {
				sb.append(line);
				sb.append("/r/n");
			}
			bw.write(sb.toString());
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//资源关闭
		}
		
 	}
	
	public static void main(String[] args) {
		String str = "qweoprjiojsdfasdfasjkjljwqer";
		char [] strs = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		String result = ""+strs[1];
		for(int i = 0; i < strs.length ; i++) {
			sb.append(strs[i]);
			System.out.print("当前字符：");
			for(int j = i+1 ; j < strs.length; j++) {
				if(sb.toString().indexOf(strs[j]) == -1) {
					System.out.print(strs[j]);
					sb.append(strs[j]);
					continue;
				}
				if(sb.length()>result.length()) {
					result = sb.toString();
				}
				sb.setLength(0);
			}
		}
		System.out.println("该字符串中连续且不包含重复的最长字符串为："+result+"\n长度为"+result.length());
 	}
}
