package cub.book.cosumer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import io.smallrye.reactive.messaging.annotations.Blocking;

import cub.book.entity.LogEntity;
import cub.book.repository.BookRepository;

@ApplicationScoped
public class BookConsumer {
	
	private BookRepository bookRepository;

	@Inject
	public BookConsumer(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Incoming("librarylog-in")
	@Blocking
	@Transactional
    public void consumeLog(LogEntity logEntity) {
		bookRepository.persist(logEntity);
    }
}