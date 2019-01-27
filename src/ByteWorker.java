
import java.awt.Color;
import java.math.BigInteger;

class ByteWorker {

	ByteWorker() {

	int RGB;
	int newRGB;
	int R;
	int G;
	int B;

	RGB = -13218262;
	System.out.println(RGB);

	System.out.println(Integer.toBinaryString(RGB));

	Color color = new Color(RGB);

	R = color.getRed();
	G = color.getGreen();
	B = color.getBlue();

	System.out.println(R + " - RED " + G + " - GREEN " + B + " - BLUE");

	R = changeLastBit(R, true);
	G = changeLastBit(G, true);
	B = changeLastBit(B, true);

	System.out.println(R + " - RED " + G + " - GREEN " + B + " - BLUE");

	Color newColor = new Color(R,G,B);

	newRGB = newColor.getRGB();

	System.out.println(newRGB);

	System.out.println();

	String text = " Bla bla bla";

	System.out.println("Text " + text);

	String byteText = textToStringBytes(text);

	System.out.println("Byte text " + byteText);

	String newText = fromStringBytesToText(byteText);

	System.out.println("Text from bytes " + newText);



	}

	static String fromStringBytesToText(String bytes){
		return new String(new BigInteger(bytes, 2).toByteArray());
	}

	static String textToStringBytes(String text){

		return new BigInteger(text.getBytes()).toString(2);

	}

	static int changeLastBit(int value, boolean bit){

		StringBuilder sb = new StringBuilder(Integer.toBinaryString(value));

		System.out.println(sb);

		sb.setCharAt(sb.length()-1, bit ? '1' : '0');

		System.out.println(sb);

		return Integer.parseInt(sb.toString(), 2);
	}



}