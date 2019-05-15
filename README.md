# fastjsonTest
Learning to use fastjson

**fastjson(alibaba)总结

Fastjson API中文版：https://www.w3cschool.cn/fastjson/fastjson-api.html

Fastjson 最新发布版本jar包:https://search.maven.org/remote_content?g=com.alibaba&a=fastjson&v=LATEST

Fastjson jar：http://repo1.maven.org/maven2/com/alibaba/fastjson/

Fastjson 源码地址：https://github.com/alibaba/fastjson

Fastjson 中文 Wiki：https://github.com/alibaba/fastjson/wiki/Quick-Start-CN

Maven Repository：https://mvnrepository.com/


**fastjson的常用api：

Fastjson API入口类是com.alibaba.fastjson.JSON，常用的序列化操作都可以在JSON类上的静态方法直接完成。

public static final Object parse(String text); // 把JSON文本parse为JSONObject或者JSONArray 

public static final JSONObject parseObject(String text)； // 把JSON文本parse成JSONObject    

public static final <T> T parseObject(String text, Class<T> clazz); // 把JSON文本parse为JavaBean 
    
public static final JSONArray parseArray(String text); // 把JSON文本parse成JSONArray 

public static final <T> List<T> parseArray(String text, Class<T> clazz); //把JSON文本parse成JavaBean集合 
    
public static final String toJSONString(Object object); // 将JavaBean序列化为JSON文本 

public static final String toJSONString(Object object, boolean prettyFormat); // 将JavaBean序列化为带格式的JSON文本 

public static final Object toJSON(Object javaObject); 将JavaBean转换为JSONObject或者JSONArray。


**fastJson对于json格式字符串的解析主要用到了一下三个类：

JSON：fastJson的解析器，用于JSON格式字符串与JSON对象及javaBean之间的转换。

JSONObject：fastJson提供的json对象。  类似于  Map<String,Object>      {  }

JSONArray： fastJson提供json数组对象  类似于  List<Object>  注：可以把JSONArray看成由JSONObject构成的数组。  [ { } , { } , ......  , { } ] 



**补充信息：

**JSON:

http://www.json.org/json-zh.html

JSON(JavaScript Object Notation) 是一种轻量级的数据交换格式

JSON语法规则：数据在键（名称）/值对中、数据由逗号分隔、花括号保存对象、方括号保存数组

**JSON结构

JSON结构有两种结构，就是对象和数组。通过这两种结构可以表示各种复杂的结构。

{"province": "Shanxi"} 可以理解为是一个包含province为Shanxi的对象，

["Shanxi","Shandong"]这是一个包含两个元素的数组

而 [{"province": "Shanxi"},{"province": "Shandong"}] 就表示包含两个对象的数组。

当然了,你也可以使用 {"province":["Shanxi","Shandong"]} 来简化上面的JSON,这是一个拥有一个name数组的对象。

**注意：
（1）JSON键必须用双引号括起来，否则会报错
（2）最后一个属性不能加逗号


**Js中JSON.stringify()与JSON.parse():

JSON.stringify():将json对象转换成json字符串；
JSON.parse():将json字符串转成json对象。


com.alibaba.fastjson和net.sf.json的区别
org.json/net.sf.json/com.google.gson/com.alibaba.fastjson
链接：https://www.cnblogs.com/hyblogs/p/10432471.html
FastJson、Jackson、Gson、Json的效率简单对比
链接：https://www.2cto.com/kf/201707/660023.html


net.sf.json
要使程序可以运行必须引入JSON-lib包，JSON-lib包同时依赖于以下的JAR包：
commons-lang.jar
commons-beanutils.jar
commons-collections.jar
commons-logging.jar 
ezmorph.jar
json-lib-2.2.2-jdk15.jar
    
**本地Demo项目上传到GitHub**

1、git下载： https://www.git-scm.com/download/win

2、git安装教程: http://jingyan.baidu.com/article/e5c39bf5ab6af739d7603300.html

3、gitHub新建repository。

4、Https方式上传

Demo文件夹右击选择Git Bash Here。输入git指令
    git init
    git add .
    git remote add origin https地址
    git commit -m "提交说明"
    git pull --rebase origin master
    git push origin master
    git pull
    
5、常规问题：
git错误1:unable to auto-detect email address
解决方案：
找到工程目录 (Project) 的.git文件夹，打开之后找到config文件，在最后边加上一句话
[user]
email=your email
name=your name
