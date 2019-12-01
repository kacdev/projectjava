package pl.example.spring.punkty.db;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class StudentRepozytory implements CrudRepository<StudentRow, Long> {
    @Override
    public <S extends StudentRow> S save(S entity) {
        return null;
    }

    @Override
    public <S extends StudentRow> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<StudentRow> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<StudentRow> findAll() {
        return null;
    }

    @Override
    public Iterable<StudentRow> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(StudentRow entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends StudentRow> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
