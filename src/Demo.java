import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


 
public class Demo {
    public static void main(String[] args) {
        String content = "{\"SortedType\":1,\"ICBCPointInfomationList\":{},\"ICBCShopInfomationList\":{},\"ICBCAdiceInfomationList\":[{\"sm65653e054c594e6e91d42ca0da90c869\":{\"pointguid\":\"sm65653e054c594e6e91d42ca0da90c869\",\"stru_sname\":\"柳州分行鹿寨县支行营业室建中北路离行式自助银行\",\"stru_fname\":\"柳州分行鹿寨县支行营业室建中北路离行式自助银行\"},\"sm44273dba095d46c4bf05f209149ae8d6\":{\"pointguid\":\"sm44273dba095d46c4bf05f209149ae8d6\",\"stru_sname\":\"柳州分行鹿寨县支行营业室创业路离行式自助银行\",\"stru_fname\":\"柳州分行鹿寨县支行营业室创业路离行式自助银行\"}},{\"sm020c8cfe20d74374ab4bac21af08012c\":{\"pointguid\":\"sm020c8cfe20d74374ab4bac21af08012c\",\"stru_sname\":\"柳州分行鹿寨县支行营业室建中西路附行式自助银行\",\"stru_fname\":\"柳州分行鹿寨县支行营业室建中西路附行式自助银行\"},\"sme2708a151d1d4359b1edca26cdd31e03\":{\"pointguid\":\"sme2708a151d1d4359b1edca26cdd31e03\",\"stru_sname\":\"柳州分行鹿寨县支行营业室建中西路桂中市场离行式自助银行\",\"stru_fname\":\"柳州分行鹿寨县支行营业室建中西路桂中市场离行式自助银行\"}}],\"TotalPageCount\":\"1\",\"CurrentPageIndex\":\"1\"}";
 
        //将字符串对象转换为json对象
        JSONObject jsonObject = JSON.parseObject(content);
        
        //把中间的数组拿出来
        JSONArray jsonArray = jsonObject.getJSONArray("ICBCAdiceInfomationList");
 
        //定义一个存放结果的数组
        List<JSONObject> result = new ArrayList<JSONObject>();
 
        //这一层是将数组里面的json对象做一次遍历
        for (int i = 0; i < jsonArray.size(); i++){
 
            //每一个json_list就是数组里面的一个元素
            JSONObject json_list = jsonArray.getJSONObject(i);
 
            //entity是用来存放我们需要提取的字段的一个json
            JSONObject entity = new JSONObject();
 
            //这一层是遍历json里面的json
            for (Map.Entry<String,Object> entry : json_list.entrySet()){
 
                //每一个list就是最里层的每一条json元素
                JSONObject list = json_list.getJSONObject(entry.getKey());
 
                //提取字段，并存进entity这个json中
                entity.put("id",list.getString("pointguid"));
                entity.put("name",list.getString("stru_sname"));
 
                //把json添加到数组里面
                result.add(entity);
            }
 
        }
        // 输出结果
        System.out.println(result.toString());
 
    }
}