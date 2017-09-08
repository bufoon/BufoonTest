package com.bufoon.test.io.file.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**   
 * CSV操作(导出和导入)
 *
 * @author 林计钦
 * @version 1.0 Jan 27, 2014 4:30:58 PM   
 */
public class CSVImportExport {
    
    /**
     * 导出
     * 
     * @param file csv文件(路径+文件名)，csv文件不存在会自动创建
     * @param dataList 数据
     * @return
     */
    public static boolean exportCsv(File file, List<String> dataList){
        boolean isSucess=false;
        
        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream(file);
            //UTF8字节序 BOM（Byte Order Mark）
            out.write(239);   // 0xEF  
            out.write(187);   // 0xBB  
            out.write(191);   // 0xBF
            osw = new OutputStreamWriter(out, Charset.forName("UTF-8"));
            bw =new BufferedWriter(osw);
            if(dataList!=null && !dataList.isEmpty()){
                for(String data : dataList){
                    bw.append(data).append("\r");
                }
            }
            isSucess=true;
        } catch (Exception e) {
        	e.printStackTrace();
            isSucess=false;
        }finally{
            if(bw!=null){
                try {
                    bw.close();
                    bw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
            if(osw!=null){
                try {
                    osw.close();
                    osw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
            if(out!=null){
                try {
                    out.close();
                    out=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
        }
        
        return isSucess;
    }
    
    /**
     * 导入
     * 
     * @param file csv文件(路径+文件)
     * @return
     */
    public static List<String> importCsv(File file){
        List<String> dataList=new ArrayList<String>();
        
        BufferedReader br=null;
        try { 
        	
        	DataInputStream in=new DataInputStream(new FileInputStream(file));
            br = new BufferedReader(new InputStreamReader(in,"utf-8"));
            String line = ""; 
            while ((line = br.readLine()) != null) { 
                dataList.add(line);
            }
        }catch (Exception e) {
        }finally{
            if(br!=null){
                try {
                    br.close();
                    br=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return dataList;
    }
    
    public static void exportCsv() {
        List<String> dataList=new ArrayList<String>();
        dataList.add("1,张三,男");
        dataList.add("2,李四,男");
        dataList.add("3,小红,女");
        boolean isSuccess=CSVImportExport.exportCsv(new File("D:/test/ljq.csv"), dataList);
        System.out.println(isSuccess);
    }
    
    public static void importCsv()  {
        List<String> dataList=CSVImportExport.importCsv(new File("D:/test/ljq.csv"));
        if(dataList!=null && !dataList.isEmpty()){
            for(String data : dataList){
                System.out.println(data);
            }
        }
    }
    
    public static void main(String[] args) {
    	CSVImportExport.exportCsv();
    	CSVImportExport.importCsv();
    	BigDecimal bd = new BigDecimal("3.40256010353E+11");  
    	System.out.println(bd.toPlainString());
    	
    	 try {
			File file = new File("D:/test/ljq.csv");
			 InputStream in= new java.io.FileInputStream(file);
			 byte[] b = new byte[3];
			 in.read(b);
			 in.close();
			 if (b[0] == -17 && b[1] == -69 && b[2] == -65)
			     System.out.println(file.getName() + "：编码为UTF-8");
			 else
			     System.out.println(file.getName() + "：可能是GBK，也可能是其他编码");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}