package net.tronnebati.chatbootspringairagreact.services;

import net.tronnebati.chatbootspringairagreact.entities.Conversation;
import net.tronnebati.chatbootspringairagreact.entities.Person;
import net.tronnebati.chatbootspringairagreact.ConversationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversationService {

    @Autowired
    private ConversationRepository conversationRepository;

    public List<Conversation> getConversationsByPerson(Person person) {
        return conversationRepository.findByPerson(person);
    }

    public Conversation saveConversation(Conversation conversation) {
        return conversationRepository.save(conversation);
    }
}
