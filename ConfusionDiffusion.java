import java.util.Scanner;
import java.util.BitSet;
public class ConfusionDiffusion extends Util{
    public static void main(String[] args){
//        instantiation of utii to use to perform conversions
        BitSet bitSet = new BitSet();
        BitSet bitSet2 = new BitSet();
    Util util = new Util();
//    tuple string is split into array to assign variables
    String tuple = "000102030405060708090a0b0c0d0e0f 00112233445566778899aabbccddeeff 69c4e0d86a7b0430d8cdb78070b4c55a";
    String[] tuplearray = tuple.split("\\s+");
    String key = tuplearray[0];
    String plaintext = tuplearray[1];
    String ciphertext = tuplearray[2];
//    converting hex to byte before flipping ///
    byte[] keybyte = hex2byte(key);
    bitSet = BitSet.valueOf(keybyte);
    bitSet2 = BitSet.valueOf(keybyte);
//    take input for which bit to flip
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the index number of the bit that you want to flip: ");
    int flipnum = scan.nextInt();
        if(flipnum > key.length() || flipnum < 0){
            System.out.println("That value is longer than the key. Please try again.");
            System.out.println("Please enter the index number of the bit that you want to flip: ");
            flipnum = scan.nextInt();
        }
        bitSet2.flip(flipnum);
        for (int i = 0; i > bitSet.length(); i++){
            
        }
            }

}
