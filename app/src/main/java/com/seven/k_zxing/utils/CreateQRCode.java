package com.seven.k_zxing.utils;

import android.annotation.SuppressLint;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * 生成二维码
 * 
 *
 * @author Jimmy
 *
 * @version 
 *
 * @since 2017年11月21日
 */
public class CreateQRCode {

	public static void main(String[] args) {
		// 二维码宽、高
		int width = 300;
		int height = 300;
		// 格式
		String format = "png";
		// 保存路径
		String filePath = "H://QRCode.png";
		// 信息
		String content = "Holle QRCode";
		
		// 生成二维码
		createQRCode(content, format, width, height, filePath);
		
		//二维码地址
		System.out.println("二维码已生成：" + filePath);
	}
	
	
	
	/**
	 * 
	 * 功能描述：
	 *
	 * @param content 二维码信息
	 * @param format 格式
	 * @param width 宽
	 * @param height 高
	 * @param filePath 生成路径
	 *
	 * @author Jimmy
	 *
	 * @since 2017年11月21日
	 *
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public static void createQRCode(String content,String format,int width,int height,String filePath) {
		//定义二维码参数
		HashMap<EncodeHintType,Object> hints = new HashMap<EncodeHintType,Object>();
		//字符集
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		//等级
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		//边距
		hints.put(EncodeHintType.MARGIN, 1);
		
		try {
			BitMatrix bitMatrix = new MultiFormatWriter().encode(content,
					BarcodeFormat.QR_CODE, width, height, hints);
			@SuppressLint({"NewApi", "LocalSuppress"}) Path file = new File(filePath).toPath();
			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
