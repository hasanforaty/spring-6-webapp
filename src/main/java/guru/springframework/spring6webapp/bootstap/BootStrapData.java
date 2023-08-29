package guru.springframework.spring6webapp.bootstap;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final AuthorRepository  authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");
        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");
        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);



        Author roaling = new Author();
        roaling.setFirstName("roaling");
        roaling.setLastName("j.k");
        Book harryPotter = new Book();
        harryPotter.setTitle("harry potter");
        harryPotter.setIsbn("12345634");
        Author roalingSaved = authorRepository.save(roaling);
        Book harryPotterSaved = bookRepository.save(harryPotter);

        ericSaved.getBooks().add(dddSaved);
//        dddSaved.getAuthors().add(ericSaved);
        roalingSaved.getBooks().add(harryPotterSaved);

        Author response = authorRepository.save(ericSaved);
//        bookRepository.save(dddSaved);
        authorRepository.save(roalingSaved);
        System.out.println(ericSaved);
        System.out.println("In bootStrap");
        System.out.println("Author Count : "+authorRepository.count());
        System.out.println("book count : "+bookRepository.count());



    }
}
