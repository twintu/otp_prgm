package OTP;

import java.io.*;

public class otp_key {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Create a new file otp_key.txt*/
		File inf=new File("/home/student/otp/otp_key.txt");	
		FileWriter fw=new FileWriter(inf);
		BufferedWriter bw=new BufferedWriter(fw);

		/*generate a random integer*/
		long key=Math.round(Math.random() * 100000);
		
		String key1=String.valueOf(key);
		bw.write(key1);

		bw.close();

	}

}
