package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorsServiceImp implements AuthorService{

    private final AuthorRepository repository;

    public AuthorsServiceImp(AuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Author> findAll() {

        return repository.findAll();
    }
}
