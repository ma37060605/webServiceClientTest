package test;

import java.net.URL;

import org.codehaus.xfire.client.Client;

/** 
 * @author machao 
 * @version 创建时间：2015-4-16 下午3:15:39 
 * 程序的简单说明 
 */
public class WebServiceClientTest {
	public static void main(String[] args) {
		String wsURL = "http://192.168.15.114:8080/webServiceServerTest/webservice/TestService?wsdl";
		try {
			System.out.println(" ----&gt; 初始客户端 &lt;---- ");
			Client client = new Client(new URL(wsURL));

			Object[] results = client.invoke("process",
					new Object[] { "Michael" });

			System.out.println(results[0]);
			System.out.println(" ----&gt; 客户端调用结束 &lt;---- ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
