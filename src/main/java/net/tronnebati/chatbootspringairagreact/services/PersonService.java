package net.tronnebati.chatbootspringairagreact.services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import net.tronnebati.chatbootspringairagreact.PersonRepository;
import net.tronnebati.chatbootspringairagreact.entities.Person;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person,Long, PersonRepository> {
}
