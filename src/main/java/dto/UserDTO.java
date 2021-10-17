package dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangyaowen
 * @date 2021/10/4 1:31 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class UserDTO extends BaseDTO implements Serializable {

    private String username;

    private Integer age;

    private String sex;

    private CarDTO carDTO;

    private List<String> ids;

    private String type;

    private String typeLabel;
}
