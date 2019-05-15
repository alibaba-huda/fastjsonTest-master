import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class fastjsonTest02 {
	
	public static void main(String[] args){
		// 示例三：解析Json数组（多条Json数据）
		// [{'name':'John', 'grade':[{'course':'English','score':100},{'course':'Math','score':78}]}, {'name':'Tom', 'grade':[{'course':'English','score':86},{'course':'Math','score':90}]}]   //注：Json数组最外层一定要加"[]"
		String jsonData = "[{'name':'John', 'grade':[{'course':'English','score':100},{'course':'Math','score':78}]}, {'name':'Tom', 'grade':[{'course':'English','score':86},{'course':'Math','score':90}]}]  ";
		JSONArray jsonArray = JSON.parseArray(jsonData);
		Map<String, String> mapTemp = new HashMap<String, String>();
		String name = "";
		String grade = "";
		for (int i = 0; i < jsonArray.size(); i++) {
			 name  = jsonArray.getJSONObject(i).getString("name");
			 grade = jsonArray.getJSONObject(i).getString("grade");
			 System.out.println("name:"+name+", grade:"+grade);
			 JSONArray arrayTemp = JSON.parseArray(grade);
			 for (int j = 0; j < arrayTemp.size(); j++) {
				String course = arrayTemp.getJSONObject(j).getString("course");
				String score = arrayTemp.getJSONObject(j).getString("score");
				System.out.println("course:"+course+", score:"+score);
			}
	
		}
	}

}
