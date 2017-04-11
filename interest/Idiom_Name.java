package interest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Idiom_Name {
	private static HashSet<String> idiomTable = new HashSet<String>();
	private static HashSet<String> lastNameTable = new HashSet<String>();
	
	public static void main(String [] args){
		getLastNameTable();
		getIdiomTable();
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("D:\\成语名字.txt");
			for (String name : idiomTable){
				System.out.println(name);
				fileWriter.write(name+"\r\n");
			}
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void getIdiomTable(){
		String encoding="GBK";
		File file=new File("D:\\成语词典.txt");
		InputStreamReader read;
		try {
			read = new InputStreamReader(
			new FileInputStream(file),encoding);
			BufferedReader bufferedReader = new BufferedReader(read);
	        String lineTxt = null;
	        String idiom = null;
	        while((lineTxt = bufferedReader.readLine()) != null){
	        	idiom = getString(lineTxt);
	        	String idm[] = idiom.split("");
	        	if (lastNameTable.contains(idm[0])){
	        		idiomTable.add(idm[0]+idm[1]+idm[2]);
	        	}
	        	if (lastNameTable.contains(idm[1])&&idm.length>3){
	        		idiomTable.add(idm[1]+idm[2]+idm[3]);
	        	}
	        }
	        read.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String getString(String str) { 
        String rex="[【】]+";
		String[] string=str.split(rex);
		return string[1];
	} 
	
	public static void getLastNameTable(){
		String encoding="GBK";
		File file=new File("D:\\百家姓.txt");
		InputStreamReader read;
		try {
			read = new InputStreamReader(
			new FileInputStream(file),encoding);
			BufferedReader bufferedReader = new BufferedReader(read);
	        String lineTxt = null;

	        while((lineTxt = bufferedReader.readLine()) != null){
	        	String lastname[] = lineTxt.split("");
	        	for(int i=0;i<lastname.length;i++){
	        		if (!lastname[i].equals(" ")){
	        			lastNameTable.add(lastname[i]);
	        		}
	        	}	        	
	        }
	        read.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}


