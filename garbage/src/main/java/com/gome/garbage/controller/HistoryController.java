package com.gome.garbage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gome.garbage.model.Bag;
import com.gome.garbage.model.Point;
import com.gome.garbage.model.Recycle;
import com.gome.garbage.response.HistoryResult;
import com.gome.garbage.response.ResponseBase;
import com.gome.garbage.service.HistoryService;

@RestController
public class HistoryController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private HistoryService historyService;
	
	@GetMapping(value="/score/getScoreHistory")
	public ResponseBase getScoreHistory(String loginToken, Integer page, Integer pageSize) {
		if(historyService == null) {
			logger.debug("historyService is null");
		}
		List<Point> bagList = historyService.findPointByPage(loginToken, page, pageSize);
		return new HistoryResult<Point>(bagList, 0);
	}
	
	@GetMapping(value="/garbagebag/getBagHistory")
	public ResponseBase getBagHistory(String loginToken, Integer page, Integer pageSize) {
		if(historyService == null) {
			logger.debug("historyService is null");
		}
		List<Bag> pointList = historyService.findBagByPage(loginToken, page, pageSize);
		return new HistoryResult<Bag>(pointList, 0);
	}
	
	@GetMapping(value="/recycle/getRecycleHistory")
	public ResponseBase getRecycleHistory(String loginToken, Integer page, Integer pageSize) {
		if(historyService == null) {
			logger.debug("historyService is null");
		}
		List<Recycle> recycleList = historyService.findRecycleByPage(loginToken, page, pageSize);
		return new HistoryResult<Recycle>(recycleList, 0);
	}
}
