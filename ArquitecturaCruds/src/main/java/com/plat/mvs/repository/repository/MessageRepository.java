package com.plat.mvs.repository.repository;

import com.plat.mvs.repository.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}