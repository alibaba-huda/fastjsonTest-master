import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


public class fastjsonTest00 {
	
	public static void main(String[] args){
				// ʾ��һ��������Ƕ��Json���ݵĽ���
				// Json���ݣ�{"name":"John", "age":20}
		String jsonData = "{\"name\":\"John\", \"age\":20}";
		JSONObject jsonObject  =   JSON.parseObject(jsonData);
		String name = (String) jsonObject.get("name");
		int age = (Integer) jsonObject.get("age");
		System.out.println("name:"+name+", age:"+age);
	}

}
