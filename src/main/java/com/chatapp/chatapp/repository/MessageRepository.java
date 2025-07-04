package com.chatapp.chatapp.repository;

import com.chatapp.chatapp.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findBySenderIdAndRecipientId(Long senderId, Long recipientId);
    List<Message> findByRecipientId(Long recipientId);
}
