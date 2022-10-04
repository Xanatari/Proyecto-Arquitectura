package com.plat.mvs.services;

import com.plat.mvs.repository.entities.Message;
import com.plat.mvs.repository.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    MessageRepository msgRepository;

    public List<Message> getAllMessages(){
        return msgRepository.findAll();
    }

    public Message createNewMessage(Message inputMessage){
        return msgRepository.save(inputMessage);
    }

    public Message updateMessage(Message modifiedMessage){
        Optional<Message> optionalMessage = msgRepository.findById(modifiedMessage.getId());
        if(!optionalMessage.isPresent()){
            return null;
        }
        Message storedMessage = optionalMessage.get();
        storedMessage.setContenido(modifiedMessage.getContenido());
        storedMessage.setId_responsable(modifiedMessage.getId_responsable());
        storedMessage.setFecha_ini(modifiedMessage.getFecha_ini());
        storedMessage.setFecha_fin(modifiedMessage.getFecha_fin());
        msgRepository.save(storedMessage);
        return storedMessage;
    }

    public String deleteMessage(Long msgId){
        msgRepository.deleteById(msgId);
        return "El mensaje " + msgId + " ha sido eliminado";
    }
}
