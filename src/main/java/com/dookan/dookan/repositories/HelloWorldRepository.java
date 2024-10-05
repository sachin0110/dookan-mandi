package com.dookan.dookan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dookan.dookan.models.HelloWorld;

public interface HelloWorldRepository extends JpaRepository<HelloWorld, Long> {
    
}
