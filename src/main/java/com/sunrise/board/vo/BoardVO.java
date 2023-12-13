package com.sunrise.board.vo;

public class BoardVO {
	private String BOARD_TYPE;
	private int BOARD_NUM;
	private String BOARD_TITLE;
	private String BOARD_COMMENT;
	private String CREATOR;
	private String CREATE_TIME;
	private String MODIFIER;
	private String MODIFIED_TIME;
	private String FILE_ROOT;
	
	public String getBOARD_TYPE() {
		return BOARD_TYPE;
	}
	public void setBOARD_TYPE(String bOARD_TYPE) {
		BOARD_TYPE = bOARD_TYPE;
	}
	public int getBOARD_NUM() {
		return BOARD_NUM;
	}
	public void setBOARD_NUM(int bOARD_NUM) {
		BOARD_NUM = bOARD_NUM;
	}
	public String getBOARD_TITLE() {
		return BOARD_TITLE;
	}
	public void setBOARD_TITLE(String bOARD_TITLE) {
		BOARD_TITLE = bOARD_TITLE;
	}
	public String getBOARD_COMMENT() {
		return BOARD_COMMENT;
	}
	public void setBOARD_COMMENT(String bOARD_COMMENT) {
		BOARD_COMMENT = bOARD_COMMENT;
	}
	public String getCREATOR() {
		return CREATOR;
	}
	public void setCREATOR(String cREATOR) {
		CREATOR = cREATOR;
	}
	public String getCREATE_TIME() {
		return CREATE_TIME;
	}
	public void setCREATE_TIME(String cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}
	public String getMODIFIER() {
		return MODIFIER;
	}
	public void setMODIFIER(String mODIFIER) {
		MODIFIER = mODIFIER;
	}
	public String getMODIFIED_TIME() {
		return MODIFIED_TIME;
	}
	public void setMODIFIED_TIME(String mODIFIED_TIME) {
		MODIFIED_TIME = mODIFIED_TIME;
	}
	public String getFILE_ROOT() {
		return FILE_ROOT;
	}
	public void setFILE_ROOT(String fILE_ROOT) {
		FILE_ROOT = fILE_ROOT;
	}
	
	@Override
	public String toString() {
		return "BoardVO [BOARD_TYPE=" + BOARD_TYPE + ", BOARD_NUM=" + BOARD_NUM + ", BOARD_TITLE=" + BOARD_TITLE
				+ ", BOARD_COMMENT=" + BOARD_COMMENT + ", CREATOR=" + CREATOR + ", CREATE_TIME=" + CREATE_TIME
				+ ", MODIFIER=" + MODIFIER + ", MODIFIED_TIME=" + MODIFIED_TIME + ", FILE_ROOT=" + FILE_ROOT + "]";
	}
}
