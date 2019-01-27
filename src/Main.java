
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

class Main {

	int byteArray [] [];

	public static void main(String[] args){

		File img = new File("/home/dell/JpgCrypter/assets/image.jpg");
		File newImg = new File("/home/dell/JpgCrypter/assets/newImg1.jpg");

		ByteWorker byteWorker = new ByteWorker();

		System.out.println(byteWorker.textToStringBytes("Ololo") + "Ololo");

		BufferedImage bImg;

		try{
		bImg = ImageIO.read(img);

		int xWidth = bImg.getWidth();
		int yHeight = bImg.getHeight();
		int rgb;
		for(int x = 1; x < xWidth; x++){
  			for(int y = 1; y < yHeight; y++){
  
			rgb = bImg.getRGB(x,y);
			//System.out.println(rgb);

    
    		bImg.setRGB(x,y,(bImg.getRGB(x,y)+ (int) (x+y)));
  			}
		}

		try{
		newImg.createNewFile();
		}catch(Exception e){}

		ImageIO.write(bImg, "jpg",newImg);
		}catch(Exception e){}


	}

}
