package uitl;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 根据配置文件创建类对象
 */
public class XMLUtil {
	// 根据配置文件放回type字段
	public static String getType(File file){
		try{
			// 创建Document对象
			DocumentBuilderFactory documentBuilderFactory =DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document doc = documentBuilder.parse(file);

			NodeList classNl = doc.getElementsByTagName("class");
			String classStr = classNl.item(0).getFirstChild().getNodeValue();
			return classStr;

		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

	// 根据配置文件返回类对象
	public static Object getBean(File file){
		try{
			// 创建Document对象
			DocumentBuilderFactory documentBuilderFactory =DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document doc = documentBuilder.parse(file);

			// 获取xml文件字段的值
			NodeList packageNl =doc.getElementsByTagName("package");
			String packageStr = packageNl.item(0).getFirstChild().getNodeValue();

			NodeList classNl = doc.getElementsByTagName("class");
			String classStr = classNl.item(0).getFirstChild().getNodeValue();

			String path = packageStr + "." + classStr;

			// 利用反射创建对象
			Class c = Class.forName(path);
			return c.newInstance();

		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
