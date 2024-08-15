package homework_6.paymentscore.mapper;

import homework_6.paymentscore.dto.UserDto;
import homework_6.paymentscore.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    private final ModelMapper modelMapper;

    public UserMapper() {
        this.modelMapper = new ModelMapper();
    }

    public UserDto toDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }
}
