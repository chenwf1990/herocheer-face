package com.herocheer.face.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.*;


public class HttpClients {
	private static Logger logger = LoggerFactory.getLogger(HttpClients.class);    //日志记录

	public static JSONObject httpCommunication(String url,Map<String,Object> map){
		JSONObject result= new JSONObject();
        try{
            map = paraFilter(map);// 去掉空值与签名参数后的新签名参数组
            JSONObject js= new JSONObject();
           for (String key : map.keySet()) {
               Object value = map.get(key);
                if (value == null || value.equals("")) {
                    continue;
                }
                js.put(key, value);
            }
           result = httpPost(url,js,"UTF-8");
        }catch (Exception e) {
            e.printStackTrace();
    }
        return result;
    }

	
    /**
     * post请求
     * @param url         url地址
     * @param jsonParam     参数
     * @return
     */
    public static JSONObject httpPost(String url,JSONObject jsonParam,String input_charset){
    	logger.info("請求地址：【{}】,請求參數：【{}】",url,jsonParam);
        //post请求返回结果
        //DefaultHttpClient httpClient = new DefaultHttpClient();
    	CloseableHttpClient httpClient = HttpClientBuilder.create().build();
    	JSONObject jsonResult = null;

        try {
//        	url = URLEncoder.encode(url);
            HttpPost method = new HttpPost(url);
            if (null != jsonParam) {
                //解决中文乱码问题
                StringEntity entity = new StringEntity(jsonParam.toString(), input_charset);
                entity.setContentEncoding(input_charset);
                entity.setContentType("application/json");
                method.setEntity(entity);
            }
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, input_charset);
            /**请求发送成功，并得到响应**/
            logger.info("請求返回狀態：【{}】",result.getStatusLine().getStatusCode());
            if (result.getStatusLine().getStatusCode() == 200) {
                String str = "";
                try {
                    /**读取服务器返回过来的json字符串数据**/
                    str = EntityUtils.toString(result.getEntity());
                    /**把json字符串转换成json对象**/
                    jsonResult = JSONObject.parseObject(str);
                } catch (Exception e) {
                    logger.error("post请求提交失败:" + url, e);
                }
            }
        } catch (IOException e) {
            logger.error("post请求提交失败:" + url, e);
        }
        return jsonResult;
    }
//
//
//    /**
//     * 发送get请求
//     * @param url    路径
//     * @return
//     */
//    public static JSONObject httpGet(String url){
//        //get请求返回结果
//        JSONObject jsonResult = null;
//        try {
//        	CloseableHttpClient client = HttpClientBuilder.create().build();
//            //发送get请求
//            HttpGet request = new HttpGet(url);
//            HttpResponse response = client.execute(request);
//
//            /**请求发送成功，并得到响应**/
//            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                /**读取服务器返回过来的json字符串数据**/
//                String strResult = EntityUtils.toString(response.getEntity());
//                /**把json字符串转换成json对象**/
//                jsonResult = JSONObject.parseObject(strResult);
//                url = URLDecoder.decode(url, "UTF-8");
//            } else {
//                logger.error("get请求提交失败:" + url);
//            }
//        } catch (IOException e) {
//            logger.error("get请求提交失败:" + url, e);
//        }
//        return jsonResult;
//    }
	
    
    /** 
     * 除去数组中的空值和签名参数
     * @param sArray 签名参数组
     * @return 去掉空值与签名参数后的新签名参数组
     */
    public static Map<String, Object> paraFilter(Map<String, Object> sArray) {

        Map<String, Object> result = new HashMap<String, Object>();

        if (sArray == null || sArray.size() <= 0) {
            return result;
        }

        for (String key : sArray.keySet()) {
        	Object value = sArray.get(key);
            if (value == null || value.equals("") || key.equalsIgnoreCase("sign")
                || key.equalsIgnoreCase("sign_type")) {
                continue;
            }
            result.put(key, value);
        }

        return result;
    }

    /** 
     * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     * @param params 需要排序并参与字符拼接的参数组
     * @return 拼接后字符串
     */
    public static String createLinkString(Map<String, String> params) {

        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);

            if (i == keys.size() - 1) {//拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }

        return prestr;
    }

  
    
    
}
