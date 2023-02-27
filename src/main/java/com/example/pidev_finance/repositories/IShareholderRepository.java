package com.example.pidev_finance.repositories;

import com.example.pidev_finance.entities.ShareHolder;
import org.springframework.data.repository.CrudRepository;

public interface IShareholderRepository extends CrudRepository<ShareHolder,Integer> {
}
