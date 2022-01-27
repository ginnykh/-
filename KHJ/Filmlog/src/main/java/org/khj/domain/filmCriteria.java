package org.khj.domain;

public class filmCriteria {

		// 페이지 번호
		private int pageNum;
		// 한 페이지당 게시물 갯수
		private int amount;
		// 검색 종류
		private String search;
		// 검색 키워드
		private String keyword;
		
		filmCriteria(){
			this(1,10);
		}
		
		filmCriteria(int pageNum, int amount){
			this.pageNum = pageNum;
			this.amount = amount;
		}

		public int getPageNum() {
			return pageNum;
		}

		public void setPageNum(int pageNum) {
			this.pageNum = pageNum;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public String getSearch() {
			return search;
		}

		public void setSearch(String search) {
			this.search = search;
		}

		public String getKeyword() {
			return keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		@Override
		public String toString() {
			return "filmCriteria [pageNum=" + pageNum + ", amount=" + amount + ", search=" + search + ", keyword="
					+ keyword + "]";
		}
		
}
