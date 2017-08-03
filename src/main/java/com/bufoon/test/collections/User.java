package com.bufoon.test.collections;

public class User {
	protected Integer id;  
    
    protected String username;  
      
    public User(Integer id, String username){  
        this.id = id;  
        this.username = username;  
    }  
  
  
    /** 
     * 如果对象类型是User 的话 则返回true 去比较hashCode值 
     */  
    @Override  
    public boolean equals(Object obj) {  
        if(obj == null) return false;  
        if(this == obj) return true;  
        if(obj instanceof User){   
            User user =(User)obj;  
//          if(user.id = this.id) return true; // 只比较id  
            // 比较id和username 一致时才返回true 之后再去比较 hashCode  
            if(user.id == this.id && user.username.equals(this.username)) return true;  
            }  
        return false;  
    }  
  
  
  
    /** 
     * 重写hashcode 方法，返回的hashCode 不一样才认定为不同的对象 
     */  
    @Override  
    public int hashCode() {  
//      return id.hashCode(); // 只比较id，id一样就不添加进集合  
        return id.hashCode() * username.hashCode();  
    }  
	
}
