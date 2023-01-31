package cub.book.repository;

import javax.enterprise.context.ApplicationScoped;

import cub.book.entity.LogEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class BookRepository implements PanacheRepository<LogEntity> {

}