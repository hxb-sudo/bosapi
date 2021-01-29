package com.example.util;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Component
public class Helper {

    @Autowired
    private RedisOperator redis;

    // 验证token
    public int CheckedRequest(HttpServletRequest request){
        String token = request.getHeader("X-Token");
        String phone = request.getHeader("user");
        String value = redis.getValue(0, phone);
        if (value == null){
            return 500;
        }else if (token.equals(value)){
            return 20000;
        }else{
            return -1;
        }
    }

    // 随机令牌
    public String randomToken(){
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 15; i++) {
            int c = random.nextInt(58) + 65;
            if (c>90 && c<97){
                --i;
                continue;
            }
            str += (char)c;
        }
        return str;
    }


    public static R OK(Object data) {
        return R.ok(data).setCode(20000).setMsg("请求成功~");
    }

    public static R Error(Object data) {
        return R.ok(data).setCode(-1).setMsg("请求失败~");
    }


}
