package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.api.persistance.entity.BookedDetails;

public interface BookedDetailsRepository extends JpaRepository<BookedDetails, Integer>
{

}
