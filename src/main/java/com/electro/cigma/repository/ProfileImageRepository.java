package com.electro.cigma.repository;

import com.electro.cigma.entity.UserProfileImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileImageRepository extends JpaRepository<UserProfileImage,Integer> {

}
