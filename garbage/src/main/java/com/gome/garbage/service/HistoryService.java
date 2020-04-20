package com.gome.garbage.service;

import com.gome.garbage.model.Point;

import java.util.List;

import com.gome.garbage.model.Bag;
import com.gome.garbage.model.Recycle;

public interface HistoryService {
	List<Point> findPointByPage(String loginToken, int page, int pageSize);
	List<Bag> findBagByPage(String loginToken, int page, int pageSize);
	List<Recycle> findRecycleByPage(String loginToken, int page, int pageSize);
}