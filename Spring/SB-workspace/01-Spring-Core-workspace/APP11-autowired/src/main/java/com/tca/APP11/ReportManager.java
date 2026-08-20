package com.tca.APP11;

public class ReportManager {
  
	private ReportCreator reportcreator;
	
	private int page;
	
	//setter 
//	public void setReportcreator(ReportCreator reportcreator) {
//		this.reportcreator=reportcreator;
//	}
	
	
	public void setPage(int page) {
		this.page=page;
	}
	//constructor
	
	public ReportManager(ReportCreator reportcreator) {
		this.reportcreator=reportcreator;
	}
	
	   
	public void report() {
		reportcreator.createReport(page);
	}
}
