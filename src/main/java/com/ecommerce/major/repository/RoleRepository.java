package com.ecommerce.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.major.model.Role;
import com.ecommerce.major.model.User;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
