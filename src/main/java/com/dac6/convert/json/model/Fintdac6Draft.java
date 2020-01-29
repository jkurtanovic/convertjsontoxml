package com.dac6.convert.json.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FINTDAC6_DRAFT")
public class Fintdac6Draft {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="OIB_IZVJESTITELJA")
	private String oibIzvjestitelja;
	@Column(name="DRAFT_NAME")
	private String draftName;
	@Column(name="DRAFT")
	private String draft;
	@Column(name="DRAFT_STATUS")
	private int draftStatus;
	@Column(name="ARRANGEMENT_ID")
	private int arrangementId;
	@Column(name="CREATED_BY")
	private String createBy;
	@Column(name="CREATED_ON")
	private Timestamp createOn;
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	@Column(name="MODIFIED_ON")
	private Timestamp modifiedOn;
	
	public Fintdac6Draft() {
		
	}
	
	
	public Fintdac6Draft(String oibIzvjestitelja, String draftName, String draft, int draftStatus, int arrangementId) {
		this.oibIzvjestitelja = oibIzvjestitelja;
		this.draftName = draftName;
		this.draft = draft;
		this.draftStatus = draftStatus;
		this.arrangementId = arrangementId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOibIzvjestitelja() {
		return oibIzvjestitelja;
	}


	public void setOibIzvjestitelja(String oibIzvjestitelja) {
		this.oibIzvjestitelja = oibIzvjestitelja;
	}


	public String getDraftName() {
		return draftName;
	}


	public void setDraftName(String draftName) {
		this.draftName = draftName;
	}


	public String getDraft() {
		return draft;
	}


	public void setDraft(String draft) {
		this.draft = draft;
	}


	public int getDraftStatus() {
		return draftStatus;
	}


	public void setDraftStatus(int draftStatus) {
		this.draftStatus = draftStatus;
	}


	public int getArrangementId() {
		return arrangementId;
	}


	public void setArrangementId(int arrangementId) {
		this.arrangementId = arrangementId;
	}


	public String getCreateBy() {
		return createBy;
	}


	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}


	public Timestamp getCreateOn() {
		return createOn;
	}


	public void setCreateOn(Timestamp createOn) {
		this.createOn = createOn;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	public Timestamp getModifiedOn() {
		return modifiedOn;
	}


	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}


	@Override
	public String toString() {
		return "fintdac6Draft [id=" + id + ", oibIzvjestitelja=" + oibIzvjestitelja + ", draftName=" + draftName
				+ ", draft=" + draft + ", draftStatus=" + draftStatus + ", arrangementId=" + arrangementId
				+ ", createBy=" + createBy + ", createOn=" + createOn + ", modifiedBy=" + modifiedBy + ", modifiedOn="
				+ modifiedOn + "]";
	}
	
	
	
	

}