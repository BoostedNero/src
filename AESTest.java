import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.*;
import java.util.*;
class AESTest
{
 
  public static void main (String[] args) throws IOException {
     //file reader instantiated with aes file
     File aestriples = new File("AES-Triples.txt");
     FileReader filereader = new FileReader(aestriples);
     BufferedReader bufferreader = new BufferedReader(filereader);
     StringBuilder stringBuffer = new StringBuilder();
     String line = "";
     BitSet set = new BitSet(128);
     StringArray keyandtext = new StringArray();
     while ((line = bufferreader.readLine()) != null) {
        stringBuffer.append(line);
        stringBuffer.append("\n");
        for (int i = 0; i < 3; i++) {
           keyandtext.add(Arrays.toString(line.split(" ")));
           System.out.println(keyandtext);
        }
     }
     String keytext="400102030405060708090a0b0c0d0e0f";
     String plaintext="00112233445566778899aabbccddeeff";
     byte [] key	= Util.hex2byte(keytext);
     byte [] plain= Util.hex2byte(plaintext);
     byte [] result;
     AES testAES = new AES();	// create new AES instance to test triple
	  testAES.traceLevel = 1;	// select level of trace info 
     testAES.setKey(key);		// set key 
     result = testAES.encrypt(plain);	// encryption
     String ciphertext=Util.toHEX(result); //convert result to HEx value
     System.out.println(keytext+" "+plaintext+" "+ciphertext); //print
	
   }

}