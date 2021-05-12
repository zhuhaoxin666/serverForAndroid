### 为Android项目my-words后端支持

---
在Android端主要调用以下接口：
***
**1.**
*http://124.70.186.115:8080/word/userRegister*  
(注册)添加用户接口：  
*按顺序输入*
+ **key**  -------------------- **value**
+ 'name'     ------------------- "姓名"
+ 'password' --------------"密码"  
+ 'age'      ----------------------"年龄"
+ 'motto'  --------------------"个性签名"  

返回结果：  
+ true 
  + 添加用户成功
+ false 
  + 添加用户失败
  
  
**2.**
*http://124.70.186.115:8080/word/input*  
添加单词接口：  
*按顺序输入*
+ **key**  -------------------- **value**
+ 'name'     ------------------- "姓名"
+ 'word' --------------------"单词"  
+ 'interpretation'----------"解释"  

返回结果：
+   "{\"code\":200,\"message\":\"插入成功\",\"name\":\"noone\"}"
    + 说明插入成功
+ "{\"code\":400,\"message\":\"插入失败，有异常\"}"
    + 说明插入失败  
**注意：** 'name'需要注册

**3.**
*http://124.70.186.115:8080/word/delete*  
删除单词接口：  
+ **key**  -------------------- **value**
+ 'name'     ------------------- "姓名"  

返回结果：
+ "{\"code\":200,\"message\":\"删除成功\",\"name\":\"noone\"}"
  + 说明删除成功
+ "{\"code\":400,\"message\":\"删除失败,该用户可能未注册或出现其他DAO异常\"}"  
    + 说明删除失败  
      **注意：** 'name'需要注册

**4.**
*http://124.70.186.115:8080/word/getUserInfo*  
获取用户信息接口：
+ **key**  -------------------- **value**
+ 'name'     ------------------- "姓名"

返回结果：
+ "{\"age\":15,\"motto\":\"love words\",\"name\":\"noone\"}"  
    + 返回个人信息

**5.**
*http://124.70.186.115:8080/word/output*  
获取单词接口: 
+ **key**  -------------------- **value**
+ 'name'     ------------------- "姓名"  

返回结果：
+ [
  "{\"meaning\":\".n 书\",\"word\":\"book\"}",
  "{\"meaning\":\".n 桌子\",\"word\":\"table\"}",
  "{\"meaning\":\".v 玩\",\"word\":\"play\"}"
  ]
  + 返回的是json串集合
    
**6.**
*http://124.70.186.115:8080/word/existUser*  
用户验证接口：
+ **key**  -------------------- **value**
+ 'name'     ------------------- "姓名"  
+ 'password'---------------"密码"

返回结果：
+ "{\"code\":200,\"message\":\"验证成功\",\"name\":\"noone\"}"
    + 验证成功，返回username
+ "{\"code\":400,\"message\":\"用户名或密码错误\"}"   
    + 验证失败