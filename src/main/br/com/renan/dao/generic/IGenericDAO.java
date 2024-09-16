package main.br.com.renan.dao.generic;

import main.br.com.renan.domain.Persistent;
import main.br.com.renan.exception.KeyNotFoundException;

import java.util.Collection;

public interface IGenericDAO <T extends Persistent> {
    public Boolean create(T entity) throws KeyNotFoundException;
    public void delete(String value) throws KeyNotFoundException;
    public T get(String value);
    public Collection<T> list();

}
