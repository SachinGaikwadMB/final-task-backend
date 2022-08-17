package com.mb.api.business.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mb.api.persistance.entity.BookedDetails;
import com.mb.api.web.dto.ShowDetailsDto;

@Service
public interface BookedDetailsService
{
	String saveShowDetails(ShowDetailsDto showDetailsDto);
	
	List<BookedDetails> getBookingDetails();
}
