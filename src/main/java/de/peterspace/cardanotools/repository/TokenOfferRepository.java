package de.peterspace.cardanotools.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import de.peterspace.cardanotools.model.Account;
import de.peterspace.cardanotools.model.TokenOffer;

@Repository
public interface TokenOfferRepository extends PagingAndSortingRepository<TokenOffer, Long> {

	List<TokenOffer> findByAccount(Account account);

}