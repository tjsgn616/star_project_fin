package com.star.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.star.domain.DustDTO;
import com.star.domain.WeatherDTO;

@Service
public interface WeatherService {

	// 예보 데이터 저장
	public boolean insertWeather(WeatherDTO weatherDTO);
	
	// 예보 데이터 불러 오기
	public List<WeatherDTO> getWeather(String fcstDate, String fcstTime);

	// 해당 지역의 하위 지역들 불러오기
	public List<String> getLowerRegion(String region);
	
}
