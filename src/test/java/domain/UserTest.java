package domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.UserDTO;
import enums.SexEnum;
import mapper.UserMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import vo.UserVO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhangyaowen
 * @date 2021/10/4 2:47 下午
 */
class UserTest {

    @BeforeEach
    void setUp() {
        System.out.println(" START ");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" END ");
    }

    @Test
    void testMapper() throws JsonProcessingException {
        Car car = new Car();
        car.setName("baoma");
        car.setPrice(new BigDecimal("4999.996"));
        car.setExpdate(LocalDateTime.now());
        Currency currency = Currency.getInstance("XDR");;
        car.setCurrency(currency);
        List<Long> longs = new ArrayList<>();
        longs.add(1L);
        longs.add(2L);

        User user = new User("zhangsan",1, SexEnum.M,car,longs,"A");
        user.setUuid(UUID.randomUUID().toString());
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(user.toString());
        System.out.println(mapper.writeValueAsString(user));
        UserDTO userDTO = UserMapper.INSTANCE.userToDTO(user);
        System.out.println(userDTO.toString());
        System.out.println(mapper.writeValueAsString(userDTO));
        UserVO userVO = UserMapper.INSTANCE.dtoToVO(userDTO);
        System.out.println(userVO.toString());
        System.out.println(mapper.writeValueAsString(userVO));
    }
}