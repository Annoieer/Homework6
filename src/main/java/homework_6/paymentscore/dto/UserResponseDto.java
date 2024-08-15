package homework_6.paymentscore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class UserResponseDto {
    private Integer totalCount;
    List<UserDto> users;
}
