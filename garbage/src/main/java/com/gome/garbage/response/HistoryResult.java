package com.gome.garbage.response;

import java.util.List;

public class HistoryResult<T> extends ResponseBase {
	private List<T> historyList;
	private int pageCount;
	
	public HistoryResult(List<T> historyList, int pageCount) {
		this.historyList = historyList;
		this.pageCount = pageCount;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public List<T> getHistoryList() {
		return historyList;
	}
}