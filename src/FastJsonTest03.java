import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;


public class FastJsonTest05 {
	
	public static void main(String[] args) {
		/**
		 * ʾ��˵����
		 * "muser": [
    		{
      		"name": "zhangsan",
      		"age": "10",
      		"phone": "11111",
      		"email": "11111@11.com"
    		},
    		...
			]
			����� ��muser�� ��Ҳ������������ƣ�����Ϊ����ͷ����ֹ��������ֶ������壻
			���û������ͷ���Ǿͽ��������ݣ����ߴ��������ݣ�
			�������õ��� JsonArray/JsonObject ����Ϥ����ȫ������ GSON 
		 */
		
		
		/**
		 * eg1.û������ͷ�Ĵ�����JSON
		 * Ҳ������� JSON ����ֻ��һ�����飨JsonArray���������������û������
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
