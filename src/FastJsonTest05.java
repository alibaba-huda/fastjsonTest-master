import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class FastJsonTest07 {
	
	public static void main(String[] args) {
		
		/**
		 * 有数据头的复杂数据
		 * {
  			"code": 200,
  			"msg": "OK",
  			"muser": [
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
			}
		 */
	String jsonData = "{\"code\": 200,\"msg\": \"OK\",\"muser\": [{\"name\": \"zhangsan\",\"age\": \"10\",\"phone\": \"11111\",\"email\": \"11111@11.com\"},{\"name\": \"lisi\",\"age\": \"20\",\"phone\": \"22222\",\"email\": \"22222@22.com\"}]}";
	JSONObject jsonObject = JSON.parseObject(jsonData);
	String code = jsonObject.getString("code");
	String msg = jsonObject.getString("msg");
	JSONArray muserTemp = jsonObject.getJSONArray("muser");
	for (int i = 0; i < muserTemp.size(); i++) {
		String name = 	muserTemp.getJSONObject(i).getString("name");
		Integer age = muserTemp.getJSONObject(i).getInteger("age");
		String phone = muserTemp.getJSONObject(i).getString("phone");
		String email = muserTemp.getJSONObject(i).getString("email");
		System.out.println("name:"+name+", age:"+age+", phone:"+phone+", email:"+email);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
