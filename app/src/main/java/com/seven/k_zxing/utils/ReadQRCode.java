//package com.seven.k_zxing.utils;
//
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.util.HashMap;
//
//import javax.imageio.ImageIO;
//
//import com.google.zxing.BinaryBitmap;
//import com.google.zxing.EncodeHintType;
//import com.google.zxing.MultiFormatReader;
//import com.google.zxing.Result;
//import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
//import com.google.zxing.common.HybridBinarizer;
//
///**
// * 读取二维码信息
// *
// *
// * @author Jimmy
// *
// * @version
// *
// * @since 2017年11月21日
// */
//public class ReadQRCode {
//
//
//	private static final String path = "H://QRCode.png";
//
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) {
//
//		try {
//			MultiFormatReader formatReader = new MultiFormatReader();
//			File file = new File(path);
//
//			BufferedImage image = ImageIO.read(file);
//
//			BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
//
//			//定义二维码参数
//			@SuppressWarnings("rawtypes")
//			HashMap hints = new HashMap();
//			//字符集
//			hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
//
//			Result result = formatReader.decode(binaryBitmap, hints);
//
//			System.out.println("二维码内容："+result.getText());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//}
