package entity;

public class PageClass {
	// 总页数
	private int countPage;
	// 总记录数
	private int rows;
	// 每页显示数量
	private int numbers;
	// 当前页
	private int courrentPage;
	// 下一页
	private int nextPage;
	// 上一页
	private int lastPage;
	// 每一页的起始下标
	private int startIndex;

	
	
	public PageClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageClass(int rows , int numbers , String  courrentPage) {
		//总记录数
		this.rows = rows;
		//每页显示数量
		this.numbers = numbers;
		//初始化总页数
		initCountPage();
		
		//初始化当前页数
		initcourrnetPage(courrentPage);
		
		//初始化上一页
		initNextPage();
		
		//初始化下一页()
		initLastPage();
		
		//初始化下标
		initStartIndex();
		
	}

	// 初始化当前页
	public void initcourrnetPage(String courrentPage) { 
		if (courrentPage == null || Integer.parseInt(courrentPage) < 1) {
			this.courrentPage = 1;
		} else if (Integer.parseInt(courrentPage) > countPage) {
			this.courrentPage = countPage;
		} else {
			this.courrentPage = Integer.parseInt(courrentPage);
		}
	}

	// 初始式上一页
	public void initLastPage() {
		if (courrentPage <= 1 ) {
			lastPage = 1;
		} else {
			lastPage = courrentPage - 1;
		}
	}

	// 初始式下一页
	public void initNextPage() {
		if (courrentPage >= countPage) {
			this.nextPage = countPage;
		} else {
			this.nextPage = courrentPage + 1;
		}
	}
	
	//初始化最大页
	public void initCountPage() {
		if(rows%numbers==0) {
			countPage=rows/numbers;
		}else {
			countPage=rows/numbers+1;
		}
	}
	//初始化起始下标
	public void initStartIndex() {
		startIndex=(courrentPage-1)*numbers;
	}

	
	public int getCountPage() {
		return countPage;
	}

	public void setCountPage(int countPage) {
		this.countPage = countPage;
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

	@Override
	public String toString() {
		return "PageClass [countPage=" + countPage + ", rows=" + rows + ", numbers=" + numbers + ", courrentPage="
				+ courrentPage + ", nextPage=" + nextPage + ", lastPage=" + lastPage + ", startIndex=" + startIndex
				+ "]";
	}

	

}
