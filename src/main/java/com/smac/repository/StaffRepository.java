package com.smac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smac.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{
}
