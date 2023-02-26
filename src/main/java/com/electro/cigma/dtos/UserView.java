package com.electro.cigma.dtos;

import com.electro.cigma.entity.UserProfileImage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserView {
    private int id;
    private String name;
    private String email;
    private UserProfileImage userProfileImage;
}
