package com.offcn.entity;

public class Page {
	
	
	// 总记录数
	private int rows;
	// 每页显示数量
	private int numbers;
	// 总页数
	private int countPage;
	// 当前页
	private int courrentPage;
	// 下一页
	private int nextPage;
	// 上一页
	private int lastPage;
	// 每一页的起始下标
	private int startIndex;
	
	
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Page(int rows , int number  ,String courrentPage) {
		this.rows = rows;
		this.numbers = number;
		initCountPage();
		initCourrentPage(courrentPage);
		initStartIndex();
		initlastPage();
		initnextPage();
	}
	
	@Override
	public String toString() {
		return "Page [rows=" + rows + ", numbers=" + numbers + ", countPage=" + countPage + ", courrentPage="
				+ courrentPage + ", nextPage=" + nextPage + ", lastPage=" + lastPage + ", startIndex=" + startIndex
				+ "]";
	}

	//初始化当前页
	private void initCourrentPage(String  courrentPage) {
		if(courrentPage==null || Integer.valueOf(courrentPage) <1) {
			this.courrentPage=1;
		}else if(Integer.valueOf(courrentPage) >countPage){
			this.courrentPage= countPage;
		}else {
			this.courrentPage= Integer.valueOf(courrentPage);
		}
	}
	
	//初始化总页数
	private void initCountPage() {
		countPage=rows%numbers ==0 ? rows/numbers : rows/numbers+1;
	}
	//初始化下一页
	private void initnextPage() {
		if(courrentPage<countPage) {
			nextPage=courrentPage+1;
		}else {
			nextPage=courrentPage;
		}
	}
	//初始化下一页
	private void initlastPage() {
		if(courrentPage>1) {
			lastPage=courrentPage-1;
		}else {
			lastPage=courrentPage;
		}
	}
	//初始化每页下标
	private void initStartIndex() {
		startIndex=(courrentPage-1)*numbers;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public int getCountPage() {
		return countPage;
	}

	public void setCountPage(int countPage) {
		this.countPage = countPage;
	}

	public int getCourrentPage() {
		return courrentPage;
	}

	public void setCourrentPage(int courrentPage) {
		this.courrentPage = courrentPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	
	
		
}
