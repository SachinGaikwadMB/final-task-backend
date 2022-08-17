package com.mb.api.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mb.api.business.service.BookedDetailsService;
import com.mb.api.persistance.entity.BookedDetails;
import com.mb.api.web.dto.ShowDetailsDto;
import static com.mb.api.constant.UrlMapping.BOOKING_DETAILS;
@RestController
@CrossOrigin("http://localhost:4200/")
public class BookedDetailsController extends BaseController
{
	@Autowired
	private BookedDetailsService bookedDetailsService;
	
	@PostMapping(BOOKING_DETAILS)
	 public ResponseEntity<String> saveShowDetails(@RequestBody ShowDetailsDto showDetailsDto) {
		
		String responeBody = bookedDetailsService.saveShowDetails(showDetailsDto);
		return new ResponseEntity<>(responeBody, HttpStatus.OK);
	 }
	
	@GetMapping(BOOKING_DETAILS)
	public ResponseEntity<List<BookedDetails>> getBookingDetails() {
		List<BookedDetails> details = bookedDetailsService.getBookingDetails();
		return new ResponseEntity<>(details, HttpStatus.OK);
	}
}
