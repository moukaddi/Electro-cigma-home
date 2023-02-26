package com.electro.cigma.repository;

import com.electro.cigma.entity.CartDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartDetails,Integer> {

}
