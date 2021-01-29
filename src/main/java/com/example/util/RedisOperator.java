package com.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisOperator {
   
 
   @Autowired
    @Qualifier("customStringTemplate")
   private StringRedisTemplate stingRedisTemplate;
 
 
    @Autowired
    @Qualifier("customRedisTemplate")
    private RedisTemplate redisTemplate;
 
 
 
   public  StringRedisTemplate getStringRedisTemplate(int index){
        return (StringRedisTemplate) getTemplate(stingRedisTemplate,index);
    }
 
    public  RedisTemplate getRedisTemplate(int index){
        return  getTemplate(redisTemplate,index);
    }
 
    public RedisTemplate getTemplate(RedisTemplate redisTemplate,int index) {
        JedisConnectionFactory jedisConnectionFactory = (JedisConnectionFactory) redisTemplate.getConnectionFactory();
        jedisConnectionFactory.setDatabase(index);
        redisTemplate.setConnectionFactory(jedisConnectionFactory);
        return redisTemplate;
    }
    /**
     * @description 添加字符串
     * @param index,key,value （数据库下标、字符串的键、字符串的值）
     * @return void
     * */
   public  void value(int index,String key, String value) {
       getStringRedisTemplate(index).opsForValue().set(key, value);

   }

   public void setVal_Time(int index, String key, String value, Long timeout){
       getStringRedisTemplate(index).opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
   }

   public String getValue(int index, String key){
       return getStringRedisTemplate(index).opsForValue().get(key);
   }



}