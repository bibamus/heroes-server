package com.biba.heroserver.dto;


/**
 *
 * @param <T> The Entity
 * @param <S> The DTO
 */
public interface Mapper<T, S> {

	S mapToDTO(T enity);

	T mapToEntity(S dto);

}
