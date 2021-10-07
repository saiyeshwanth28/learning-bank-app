package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Account;
/** Account repository interface*/
public interface AccountRepo extends JpaRepository<Account,Integer> {
@Query(value="Select * from account where account_num=?1",nativeQuery=true)
/** to fetch the data of particular accountno */
Account getDataof(int accountno);
}
