package com.gome.garbage.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gome.garbage.model.Bag;
import com.gome.garbage.model.BagRepository;
import com.gome.garbage.model.Point;
import com.gome.garbage.model.PointRepository;
import com.gome.garbage.model.Recycle;
import com.gome.garbage.model.RecycleRepository;
import com.gome.garbage.model.Token;
import com.gome.garbage.model.TokenRepository;

@Service
public class HistoryServiceImpl implements HistoryService {
	@Autowired
	private PointRepository pointRepository;
	@Autowired
	private BagRepository bagRepository;
	@Autowired
	private RecycleRepository recycleRepository;
	
	@Autowired
	private TokenRepository tokenRepository;
	
	@PostConstruct
    public void init() {
		System.out.println("RecordServiceImpl Construct");
	}

	public List<Point> findPointByPage(String loginToken, int page, int pageSize) {
		Token token = tokenRepository.findByToken(loginToken);
		if(token == null) {
			return null;
		}
		if(page < 0) {
			page = 0;
		}
        if (pageSize < 1) {
        	pageSize = 2;
        }
		Pageable pageable = PageRequest.of(page, pageSize, Direction.DESC,"id");
		return pointRepository.findByUserId(token.getUseId(), pageable);
	}

	public List<Bag> findBagByPage(String loginToken, int page, int pageSize) {
		Token token = tokenRepository.findByToken(loginToken);
		if(token == null) {
			return null;
		}
		if(page < 0) {
			page = 0;
		}
        if (pageSize < 1) {
        	pageSize = 2;
        }
		Pageable pageable = PageRequest.of(page, pageSize, Direction.DESC,"id");
		return bagRepository.findByUserId(token.getUseId(), pageable);
	}

	public List<Recycle> findRecycleByPage(String loginToken, int page, int pageSize) {
		Token token = tokenRepository.findByToken(loginToken);
		if(token == null) {
			return null;
		}
		if(page < 0) {
			page = 0;
		}
        if (pageSize < 1) {
        	pageSize = 2;
        }
		Pageable pageable = PageRequest.of(page, pageSize, Direction.DESC,"id");
		return recycleRepository.findByUserId(token.getUseId(), pageable);
	}

}
