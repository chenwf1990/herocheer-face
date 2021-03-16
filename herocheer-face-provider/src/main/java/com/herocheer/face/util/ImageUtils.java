package com.herocheer.face.util;


//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class ImageUtils {
	/** 
     * 将网络图片进行Base64位编码 
     *  
     * imageUrl 
     *            图片的url路径，如http://.....xx.jpg
     * @return
     */
    public static String encodeImgageToBase64(URL imageUrl) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        ByteArrayOutputStream outputStream = null;
        try {
            BufferedImage bufferedImage = ImageIO.read(imageUrl);
            outputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", outputStream);
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(outputStream.toByteArray());// 返回Base64编码过的字节数组字符串
    }

    /**
     * 将本地图片进行Base64位编码
     *
     * imageUrl
     *            图片的url路径，如http://.....xx.jpg
     * @return
     */
    public static String encodeImgageToBase64(File imageFile) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        InputStream in = null;
		byte[] data = null;
		//读取图片字节数组
		try
		{
		    in = new FileInputStream(imageFile);
		    data = new byte[in.available()];
		    in.read(data);
		    in.close();
		}
		catch (IOException e)
		{
		    e.printStackTrace();
		}
        BASE64Encoder encoder = new BASE64Encoder();
        String data2 = new String(BASE64Encoder.encode(data));
		return data2;
    }
    /**
     * 删除单个文件
     *
     * @param fileName
     *            要删除的文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("删除单个文件" + fileName + "成功！");
                return true;
            } else {
                System.out.println("删除单个文件" + fileName + "失败！");
                return false;
            }
        } else {
            System.out.println("删除单个文件失败：" + fileName + "不存在！");
            return false;
        }
    }
    /**
     * 将Base64位编码的图片进行解码，并保存到指定目录
     *
     * @param base64
     *            base64编码的图片信息
     * @return
     */
    public static void decodeBase64ToImage(String base64, String path,String imgName) {
    	//String[] bases = base64.split("base64,");
    	//String base = bases[1];
        BASE64Decoder decoder = new BASE64Decoder();
        try {
        	File file = new File(path);
        	if (!file.isDirectory()){
        	    System.out.println("文件夹不存在");
        	    file.mkdir();
        	}
        	File fileImg = new File(path + imgName);
            FileOutputStream out = new FileOutputStream(fileImg);
            byte[] b = decoder.decodeBuffer(base64);

//            zipImageFile(b,fileImg,0,0,0.6f);

			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {
					 b[i] += 256;
				}
			}
			out.write(b);
			out.flush();
			out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	//String str = "adfsa<code>adfa</code>dafea<subl></subls>";
    	//System.out.println(str.substring(str.indexOf("<code>")+6,str.indexOf("</code>")));
    	Float f = 0.5f;
    	zipWidthHeightImageFile(new File("E:/maven_project/Demo/config/321.jpg"),new File("E:/maven_project/Demo/config/_321.jpg"),618,816,f);
	}

    /**
     * 等比例压缩图片文件<br> 先保存原文件，再压缩、上传
     * @param buf  要进行压缩的文件
     * @param newFile  新文件
     * @param width  宽度 //设置宽度时（高度传入0，等比例缩放）
     * @param height 高度 //设置高度时（宽度传入0，等比例缩放）
     * @param quality 质量
     * @return 返回压缩后的文件的全路径
     */
    public static String zipImageFile( byte[] buf,File newFile, int width, int height,
            float quality) {
       /* if (oldFile == null) {
            return null;
        }  */
        try {
            /** 对服务器上的临时文件进行处理 */
        	InputStream in = new ByteArrayInputStream(buf);
            Image srcFile = ImageIO.read(in);
        	//Image srcFile = ImageIO.read(oldFile);
            int w = srcFile.getWidth(null);
        //  System.out.println(w);
            int h = srcFile.getHeight(null);
        //  System.out.println(h);
            double bili;
            if(width>0){
                bili=width/(double)w;
                height = (int) (h*bili);
            }else{
                if(height>0){
                    bili=height/(double)h;
                    width = (int) (w*bili);
                }
            }
            /** 宽,高设定 */
            BufferedImage tag = new BufferedImage(w, h,
                    BufferedImage.TYPE_INT_RGB);
            tag.getGraphics().drawImage(srcFile, 0, 0, w, h, null);
            //String filePrex = oldFile.getName().substring(0, oldFile.getName().indexOf('.'));
            /** 压缩后的文件名 */
            //newImage = filePrex + smallIcon+  oldFile.getName().substring(filePrex.length());

            /** 压缩之后临时存放位置 */
            FileOutputStream out = new FileOutputStream(newFile);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            JPEGEncodeParam jep = JPEGCodec.getDefaultJPEGEncodeParam(tag);
            /** 压缩质量 */
            jep.setQuality(quality, true);
            encoder.encode(tag, jep);
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFile.getAbsolutePath();
    }

    /**
     * 按宽度高度压缩图片文件<br> 先保存原文件，再压缩、上传
     * @param oldFile  要进行压缩的文件全路径
     * @param newFile  新文件
     * @param width  宽度
     * @param height 高度
     * @param quality 质量
     * @return 返回压缩后的文件的全路径
     */
    public static String zipWidthHeightImageFile(File oldFile,File newFile, int width, int height,
            float quality) {
        if (oldFile == null) {
            return null;
        }
        String newImage = null;
        try {
            /** 对服务器上的临时文件进行处理 */
            Image srcFile = ImageIO.read(oldFile);
            int w = srcFile.getWidth(null);
        //  System.out.println(w);
            int h = srcFile.getHeight(null);
        //  System.out.println(h);

            /** 宽,高设定 */
            BufferedImage tag = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
            tag.getGraphics().drawImage(srcFile, 0, 0, width, height, null);
            //String filePrex = oldFile.substring(0, oldFile.indexOf('.'));
            /** 压缩后的文件名 */
            //newImage = filePrex + smallIcon+ oldFile.substring(filePrex.length());

            /** 压缩之后临时存放位置 */
            FileOutputStream out = new FileOutputStream(newFile);

            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            JPEGEncodeParam jep = JPEGCodec.getDefaultJPEGEncodeParam(tag);
            /** 压缩质量 */
            jep.setQuality(quality, true);
            encoder.encode(tag, jep);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  
        return newImage;  
    }  
    
    public static byte[] getStringImage(String base64String) throws IOException {
    	BASE64Decoder decoder = new BASE64Decoder();
        return base64String != null ? decoder.decodeBuffer(base64String) : null;
    }
    
   
}  
