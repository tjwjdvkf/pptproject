package com.sjh.board;

import java.util.Date;

public class BoardVO {

	//pk
    private Integer nno;
    //  ����
    private String ntitle;
    //  ����
    private String ncontent;
    //  �ۼ���
    private String nwriter;
    //  �ۼ���
    private Date nrdate;
    //  ��ȸ��
    private Integer nviewcnt;
    //  ��������
    private String nisdelete;
	public Integer getNno() {
		return nno;
	}
	public void setNno(Integer nno) {
		this.nno = nno;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public String getNwriter() {
		return nwriter;
	}
	public void setNwriter(String nwriter) {
		this.nwriter = nwriter;
	}
	public Date getNrdate() {
		return nrdate;
	}
	public void setNrdate(Date nrdate) {
		this.nrdate = nrdate;
	}
	public Integer getNviewcnt() {
		return nviewcnt;
	}
	public void setNviewcnt(Integer nviewcnt) {
		this.nviewcnt = nviewcnt;
	}
	public String getNisdelete() {
		return nisdelete;
	}
	public void setNisdelete(String nisdelete) {
		this.nisdelete = nisdelete;
	}
	@Override
	public String toString() {
		return "BoardVO [nno=" + nno + ", ntitle=" + ntitle + ", ncontent=" + ncontent + ", nwriter=" + nwriter
				+ ", nrdate=" + nrdate + ", nviewcnt=" + nviewcnt + ", nisdelete=" + nisdelete + "]";
	}
    
    
}
