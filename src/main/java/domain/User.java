package domain;

import enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangyaowen
 * @date 2021/10/4 1:33 下午
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User extends BaseDomain implements Serializable {

    private String username;

    private Integer age;

    private SexEnum sex;

    private Car car;

    private List<Long> ids;

    private String type;

}
