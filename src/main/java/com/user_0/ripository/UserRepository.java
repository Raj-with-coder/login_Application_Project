package com.user_0.ripository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user_0.model.UserDetail;

public interface UserRepository extends JpaRepository<UserDetail, Long>{

}
