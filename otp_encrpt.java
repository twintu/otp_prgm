package OTP;
import java.io.*;
public class otp_encrpt {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inf=new File("/home/student/otp/keyencrypt.txt");	
		FileWriter fwrite=new FileWriter(inf);
		BufferedWriter bwrite=new BufferedWriter(fwrite);

		FileReader fileReader=new FileReader("/home/student/otp/otp_originalmsg.txt");
		/*Read original message*/
		BufferedReader buffer_reader = new BufferedReader(fileReader);
		String msg=buffer_reader.readLine();
		int mesg1=Integer.parseInt(msg);
		

		FileReader fileReader1=new FileReader("/home/student/otp/otp_key.txt");
		/*Read key value*/
		BufferedReader buffer_reader1 = new BufferedReader(fileReader1);
		String key11=buffer_reader1.readLine();
		int key2=Integer.parseInt(key11);
		
		int result=(int)(mesg1 ^ key2);
		/*X-ORing the message and the key value and convert it into hexvalue*/
		String encrmsg = Integer.toHexString((int) result);
        bwrite.write(encrmsg);
		
		bwrite.close();
	}

}
