package service;

public interface IService<T> {
    Iterable<T> findAll();
    T findById(int id);
    T update(T model);
    T save(T model);
    T remove(int id);
}
