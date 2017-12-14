package com.tnb.tnbServers.data.webservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

import com.tnb.tnbServers.data.entity.SalesData;

import java.util.*;

@RestController
public class OutageController {
	
	// Hack of database for quick testing
	private ArrayList<String> outageAreas = new ArrayList<>();
	
	@RequestMapping(value="/outageNow", method=RequestMethod.GET)
	List<String> findCurrentOutage()
	{
		return outageAreas;
	}

	@RequestMapping(value="/sales", method=RequestMethod.GET)
	List<SalesData> getSalesData()
	{
		ArrayList<SalesData> salesData = new ArrayList<>();
		//SalesData sd = new Sales
		salesData.add(new SalesData("Kuala Lumpur", 1673292, "12/2017"));
		salesData.add(new SalesData("Kuala Lumpur", 1873292, "11/2017"));
		salesData.add(new SalesData("Shah Alam", 173292, "11/2017"));
		salesData.add(new SalesData("Shah Alam", 73292, "12/2017"));
		return salesData;
	}
	
	@RequestMapping(value="/addOutage", method=RequestMethod.POST)
	ResponseEntity<String> addOutage(@RequestBody AddOutagePostBody addOutage) {
		outageAreas.add(addOutage.areaName);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}