import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


 
public class Demo {
    public static void main(String[] args) {
        String content = "{\"SortedType\":1,\"ICBCPointInfomationList\":{},\"ICBCShopInfomationList\":{},\"ICBCAdiceInfomationList\":[{\"sm65653e054c594e6e91d42ca0da90c869\":{\"pointguid\":\"sm65653e054c594e6e91d42ca0da90c869\",\"stru_sname\":\"���ݷ���¹կ��֧��Ӫҵ�ҽ��б�·����ʽ��������\",\"stru_fname\":\"���ݷ���¹կ��֧��Ӫҵ�ҽ��б�·����ʽ��������\"},\"sm44273dba095d46c4bf05f209149ae8d6\":{\"pointguid\":\"sm44273dba095d46c4bf05f209149ae8d6\",\"stru_sname\":\"���ݷ���¹կ��֧��Ӫҵ�Ҵ�ҵ·����ʽ��������\",\"stru_fname\":\"���ݷ���¹կ��֧��Ӫҵ�Ҵ�ҵ·����ʽ��������\"}},{\"sm020c8cfe20d74374ab4bac21af08012c\":{\"pointguid\":\"sm020c8cfe20d74374ab4bac21af08012c\",\"stru_sname\":\"���ݷ���¹կ��֧��Ӫҵ�ҽ�����·����ʽ��������\",\"stru_fname\":\"���ݷ���¹կ��֧��Ӫҵ�ҽ�����·����ʽ��������\"},\"sme2708a151d1d4359b1edca26cdd31e03\":{\"pointguid\":\"sme2708a151d1d4359b1edca26cdd31e03\",\"stru_sname\":\"���ݷ���¹կ��֧��Ӫҵ�ҽ�����·�����г�����ʽ��������\",\"stru_fname\":\"���ݷ���¹կ��֧��Ӫҵ�ҽ�����·�����г�����ʽ��������\"}}],\"TotalPageCount\":\"1\",\"CurrentPageIndex\":\"1\"}";
 
        //���ַ�������ת��Ϊjson����
        JSONObject jsonObject = JSON.parseObject(content);
        
        //���м�������ó���
        JSONArray jsonArray = jsonObject.getJSONArray("ICBCAdiceInfomationList");
 
        //����һ����Ž��������
        List<JSONObject> result = new ArrayList<JSONObject>();
 
        //��һ���ǽ����������json������һ�α���
        for (int i = 0; i < jsonArray.size(); i++){
 
            //ÿһ��json_list�������������һ��Ԫ��
            JSONObject json_list = jsonArray.getJSONObject(i);
 
            //entity���������������Ҫ��ȡ���ֶε�һ��json
            JSONObject entity = new JSONObject();
 
            //��һ���Ǳ���json�����json
            for (Map.Entry<String,Object> entry : json_list.entrySet()){
 
                //ÿһ��list����������ÿһ��jsonԪ��
                JSONObject list = json_list.getJSONObject(entry.getKey());
 
                //��ȡ�ֶΣ������entity���json��
                entity.put("id",list.getString("pointguid"));
                entity.put("name",list.getString("stru_sname"));
 
                //��json��ӵ���������
                result.add(entity);
            }
 
        }
        // ������
        System.out.println(result.toString());
 
    }
}