package OTP;
import java.io.*;
public class otp_decrypt {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inf=new File("/home/student/otp/msgdecrypt.txt");	
		FileWriter fwrite=new FileWriter(inf);
		BufferedWriter bwrite=new BufferedWriter(fwrite);

		FileReader fileReader=new FileReader("/home/student/otp/keyencrypt.txt");
		/*Read encrypted message*/
		BufferedReader buffer_reader = new BufferedReader(fileReader);
		String encmsg=buffer_reader.readLine();
		/*convert hex value of message into decimal form*/
		int decimsg= Integer.parseInt(encmsg,16);

		FileReader fileReader1=new FileReader("/home/student/otp/otp_key.txt");
		/*Read key value*/
		BufferedReader buffer_reader1 = new BufferedReader(fileReader1);
		String key1=buffer_reader1.readLine();
		int key2=Integer.parseInt(key1);

		/*XORing cipher message and key*/
		int result=(int)(decimsg ^ key2);
		String decrmsg=String.valueOf(result);
		bwrite.write(decrmsg);
		bwrite.close();
	}

}
