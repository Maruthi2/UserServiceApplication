package com.example.userserviceapplication.dtos;

import com.example.userserviceapplication.models.Role;
import com.example.userserviceapplication.models.User;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private List<Role> roles;
    public static UserDto from(User user) {
        if (user == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        userDto.setRoles(user.getRoles());
        return userDto;
    }
}