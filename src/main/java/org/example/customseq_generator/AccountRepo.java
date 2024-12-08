package org.example.customseq_generator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account, AccountPk> {

//    @Query(name = "call getAccount()", nativeQuery = true)
//    public List<Account> getAccount();


}
