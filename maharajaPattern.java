import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

 class maharajaPattern{

	public static void main(String[] args) {
		File file =new File("C:\\Users\\maa\\Desktop\\M7 JAVA");
		try {
			BufferedImage image = ImageIO.read(file);
			for(int i=0;i<image.getHeight();i++)

			{
				for(int j=0;j<image.getWidth();j++)
				{
					Color cl = new Color(image.getRGB(j, i));
					if((cl.getBlue()==0)&& (cl.getRed()==0) && (cl.getGreen()==0))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}			
				}
				System.out.println();
			}
			}catch(Exception e){
				
						}
					}
				}
