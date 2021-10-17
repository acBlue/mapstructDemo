package utils;

import org.mapstruct.Named;

/**
 * @author zhangyaowen
 * @date 2021/10/4 7:10 下午
 */
@Named(value = "RedisUtil")
public class RedisUtil {

    @Named(value = "getCache")
    public static String getCache(String code){
        return code+"Label";
    }
}
