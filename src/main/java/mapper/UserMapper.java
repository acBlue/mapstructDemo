package mapper;

import domain.Car;
import domain.User;
import dto.CarDTO;
import dto.UserDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import utils.CoreUtil;
import utils.RedisUtil;
import vo.UserVO;

/**
 * @author zhangyaowen
 * @date 2021/10/4 1:35 下午
 */
@Mapper(builder = @Builder(disableBuilder = true),uses = {RedisUtil.class, CoreUtil.class})
public interface UserMapper {

    static UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "car",target = "carDTO")
    @Mapping(source = "type",target = "typeLabel",qualifiedByName = "getCache")
    UserDTO userToDTO(User user);


    UserVO dtoToVO(UserDTO userDTO);

    @Mapping(source = "price",target = "price",numberFormat = "$###.00")
    @Mapping(source = "expdate",target = "expdate",dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    CarDTO carToDTO(Car car);
}
