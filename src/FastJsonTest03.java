import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;


public class FastJsonTest05 {
	
	public static void main(String[] args) {
		/**
		 * 示例说明：
		 * "muser": [
    		{
      		"name": "zhangsan",
      		"age": "10",
      		"phone": "11111",
      		"email": "11111@11.com"
    		},
    		...
			]
			这里的 “muser” ，也就是数组的名称，称它为数据头，防止跟里面的字段有歧义；
			如果没有数据头，那就叫它纯数据，或者纯数组数据；
			代码中用到的 JsonArray/JsonObject 等熟悉的类全部来自 GSON 
		 */
		
		
		/**
		 * eg1.没有数据头的纯数组JSON
		 * 也就是这个 JSON 里面只有一个数组（JsonArray），而且这个数组没有名字
		 * [
  			{
    		  "name": "zhangsan",
    		  "age": "10",
    		  "phone": "11111",
    		  "email": "11111@11.com"
  			},
  			{
         	   "name": "lisi",
    		   "age": "20",
    		   "phone": "22222",
    		   "email": "22222@22.com"
  			},
  			...
		   ] 
		 */
	String jsonData = "[{\"name\": \"zhangsan\",\"age\": \"10\",\"phone\": \"11111\",\"email\": \"11111@11.com\"},{\"name\": \"lisi\",\"age\": \"20\",\"phone\": \"22222\",\"email\": \"22222@22.com\"}]";
	JSONArray jsonArray =  JSON.parseArray(jsonData);
	for (int i = 0; i < jsonArray.size(); i++) {
		String name = jsonArray.getJSONObject(i).getString("name");
		Integer age = jsonArray.getJSONObject(i).getInteger("age");
		String phone = jsonArray.getJSONObject(i).getString("phone");
		String email = jsonArray.getJSONObject(i).getString("email");
		System.out.println("name:"+name+", age:"+age+", phone:"+phone+", email:"+email);
	}
	
	
	
	
	
	
	
	}

}
