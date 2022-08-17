package com.mb.api.business.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.api.persistance.entity.BookedDetails;
import com.mb.api.persistance.repository.BookedDetailsRepository;
import com.mb.api.web.dto.ShowDetailsDto;

@Service
public class BookedDetailsServiceImpl implements BookedDetailsService
{
	@Autowired
	private BookedDetailsRepository bookedDetailsRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public String saveShowDetails(ShowDetailsDto showDetailsDto)
	{
		BookedDetails bookedDetails = mapper.map(showDetailsDto, BookedDetails.class);

		bookedDetailsRepository.save(bookedDetails);
		return "Details saved successfully !";
	}

	@Override
	public List<BookedDetails> getBookingDetails()
	{

		return bookedDetailsRepository.findAll();
	}

}
