package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zhangyaowen
 * @date 2021/10/4 1:28 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVO implements Serializable {

    private String username;

    private Integer age;

    private String sex;


}
