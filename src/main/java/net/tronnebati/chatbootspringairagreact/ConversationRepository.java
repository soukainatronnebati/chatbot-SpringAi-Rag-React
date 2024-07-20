package net.tronnebati.chatbootspringairagreact;

import net.tronnebati.chatbootspringairagreact.entities.Conversation;
import net.tronnebati.chatbootspringairagreact.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ConversationRepository  extends JpaRepository<Conversation, Long>, JpaSpecificationExecutor<Conversation> {
    List<Conversation> findByPerson(Person person);
}

