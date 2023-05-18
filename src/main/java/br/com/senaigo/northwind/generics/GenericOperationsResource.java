package br.com.senaigo.northwind.generics;

import java.util.List;

public interface GenericOperationsResource<E,N> {

    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     * @param entity
     * @return
     */
    public E create(E entity);

    /**
     * Retorna uma lista de entidades
     * @return
     */
    public List<E> read();

    /**
     * Atualiza TODO o registro
     * @param entity
     * @param id
     */
    public void updatefull(E entity, N id);

    /**
     * Atualiza parcialmente um registro
     * @param entity
     * @param id
     */
    public void update(E entity, N id);

    /**
     * Deleta um registro no banco;
     * @param entity
     */
    public void delete(E entity);

    /**
     * Deleta um registro no banco pelo identificador
     * @param id
     */
    public void deleteById(N id);
}
