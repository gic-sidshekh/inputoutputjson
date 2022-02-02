package com.gi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gi.main.bean.Input;

@Repository
public interface MetaDataInt extends JpaRepository<Input, Long> {

}