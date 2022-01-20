/*package com.kata.bank.repository;

import com.kata.bank.model.Account;
import com.kata.bank.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
} */

package com.kata.bank.repository;

import com.kata.bank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface AccountRepository extends JpaRepository<Account,Integer> {
   @Query("update Account u set u.amount = :amount where u.clientId = :clientId and u.idAccount = :idAccount")
    void updateAccountByidAccountAndIdClient(@Param("clientId") int clientId,@Param("idAccount") int idAccount,@Param("amount") double amount);

    @Query("update Account u set u.amount = ?3 where u.idClient = ?1 and u.amount = ?3")
    void withdrawAmountByidAccountAndIdClient(@Param("idClient") int idClient,@Param("idAccount") int idAccount,@Param("amount") double amount);
    @Query("select u.amount from Account u  where u.clientId = :clientId and u.id = :id")
    String displayAmountByidAccountAndIdClient(@Param("clientId") int clientId,@Param("id") int id);

}
