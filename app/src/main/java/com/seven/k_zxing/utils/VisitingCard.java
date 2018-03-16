package com.seven.k_zxing.utils;
/**
 * 
 * 二维码名片
 *
 * @author Jimmy
 *
 * @version 
 *
 * @since 2017年11月21日
 */
public class VisitingCard {

	public static void main(String[] args) {
		// 二维码宽、高
		int width = 300;
		int height = 300;
		// 格式
		String format = "png";
		// 保存路径
		String filePath = "H://QRCode.png";
		
		// 生成二维码
		CreateQRCode.createQRCode(getCardContent(), format, width, height, filePath);
		
		//二维码地址
		System.out.println("二维码已生成：" + filePath);
	}

	private static String getCardContent(){
		StringBuffer content = new StringBuffer();
		content.append("BEGIN:VCARD").append("\n");
		content.append("VERSION:2.1").append("\n");
		content.append("N:张;三").append("\n");//姓名用;隔开
		content.append("FN:张三").append("\n");//姓名
		content.append("NICKNAME:zhangsan").append("\n");//昵称
		content.append("ORG:北京总公司").append("\n");//公司
		content.append("TITLE:JAVA开发工程师").append("\n");//职位
		content.append("TEL;WORK;:13500000000").append("\n");//工作手机号码
		content.append("TEL;HOME;:13500000001").append("\n");//住宅手机号码
		//content.append("ADR;HOME;POSTAL;PARCEL:;;乡镇;城市;省份;邮编;国家").append("\n");
		//content.append("ADR;WORK;POSTAL;PARCEL:;;").append("\n");
		content.append("EMAIL:1234567@qq.com").append("\n");//邮箱
		content.append("END:VCARD").append("\n");
		return content.toString();
	}

}
