import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


public class fastjsonTest01 {
	
	public static void main(String[] args){
		// 示例二：单条有嵌套Json数据的解析
		// Json数据：{"name":"John","age":20,"grade":{"course":"English","score":100,"level":"A"}}
		String jsonData = "{\"name\":\"John\",\"age\":20,\"grade\":{\"course\":\"English\",\"score\":100,\"level\":\"A\"}}";
		JSONObject jsonObject = JSON.parseObject(jsonData);
		String  name = (String) jsonObject.get("name");
		int age = (Integer) jsonObject.get("age");
		JSONObject jsonTemp = jsonObject.getJSONObject("grade");
		String course = (String) jsonTemp.get("course");
		System.out.println("name: "+name+", age"+age+", jsonTemp:"+jsonTemp+", course:"+course);
	}

}
