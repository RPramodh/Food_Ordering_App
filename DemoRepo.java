package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.DemoEntity;

public interface DemoRepo extends JpaRepository<DemoEntity, Long>{

}
