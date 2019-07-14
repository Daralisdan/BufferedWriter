package test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class copyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFile = "E:\\workspace[java][ide]\\test\\src\\a.txt";
		String targetFile = "E:\\workspace[java][ide]\\test\\src\\b.txt";
		//copy01(sourceFile, targetFile);
		String dst = "E:\\workspace[java][ide]\\test\\src\\c.txt";
		copyFile(targetFile, dst);
		
		
		appendChars(dst, "姚丹");
	}

	public static void appendChars(String dst, String ctx) {
		// TODO Auto-generated method stub

		BufferedWriter write = null;
		try {
			write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dst,true)));
			write.append("\n"+ctx);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (write != null) {
				try {
					write.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void copy01(String sourceFile, String targetFile) {
		// TODO Auto-generated method stub
		// ��������
		FileReader fr = null;
		FileWriter fw = null;
		// ѭ������д
		int len = 0;
		try {
			fr = new FileReader(sourceFile);
			fw = new FileWriter(targetFile);
			while ((len = fr.read()) != -1) {
				fw.write((char) len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();

				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void copyFile(String src, String dst) {
		FileReader reader = null;
		FileWriter writer = null;

		int len = 0;
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dst);
			while ((len = reader.read()) != -1) {
				writer.write(len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (writer != null) {
						try {
							writer.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

				}
			}
		}
	}
}