package com.course.util;

import java.util.List;

import com.course.entity.Relation;;

public class PageModel {
	private List datas;
	
	private int pageindex;//�ڼ�ҳ
	
	private int pagecount;//��ҳ��
	
	private int total;//������

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List getDatas() {
		return datas;
	}

	public void setDatas(List datas) {
		this.datas = datas;
	}

	public int getPageindex() {
		return pageindex;
	}

	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}

	public int getPagecount() {
		return pagecount;
	}

	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	
	
}
