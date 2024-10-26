package com.example.nimap_infotech_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nimap_infotech_task.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
