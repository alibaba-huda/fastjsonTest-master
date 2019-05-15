import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class FastJsonTest06 {
	
	public static void main(String[] args) {
		/**
		 * eg2.有数据头的纯数组数据
		 * 内容跟上面的 JSON一模一样，只不过加了一个名称 “muser” ，也就是约定好的 数据头 ：
		 * 
		 * 
		 * {
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
		String jsonData = "{\"muser\": [{\"name\": \"zhangsan\",\"age\": \"10\",\"phone\": \"11111\",\"email\": \"11111@11.com\"},{\"name\": \"lisi\",\"age\": \"20\",\"phone\": \"22222\",\"email\": \"22222@22.com\"}]}";
		JSONObject jsonObject = JSON.parseObject(jsonData);
		String muser = jsonObject.getString("muser");
		JSONArray muserTemp = JSON.parseArray(muser);
		for (int i = 0; i < muserTemp.size(); i++) {
			String name = 	muserTemp.getJSONObject(i).getString("name");
			Integer age = muserTemp.getJSONObject(i).getInteger("age");
			String phone = muserTemp.getJSONObject(i).getString("phone");
			String email = muserTemp.getJSONObject(i).getString("email");
			System.out.println("name:"+name+", age:"+age+", phone:"+phone+", email:"+email);
		}
	}

}
