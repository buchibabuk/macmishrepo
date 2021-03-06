package com.mccamish.workflow.model;

import java.io.Serializable;

public class SLADetails implements Serializable{
	
	private static final long serialVersionUID = 875517769096593126L;
	private String ecmsTimer;
	private String sysAdminTimer;
	private String indexingTimer;
	private String collectionTimer;
	private String workflowTimer;
	private String vpasRetryTimer;
	private String vpasBatchTimer;
	private String missingRemindTimer;
	
	public String getEcmsTimer() {
		return ecmsTimer;
	}
	public void setEcmsTimer(String ecmsTimer) {
		this.ecmsTimer = ecmsTimer;
	}
	public String getSysAdminTimer() {
		return sysAdminTimer;
	}
	public void setSysAdminTimer(String sysAdminTimer) {
		this.sysAdminTimer = sysAdminTimer;
	}
	public String getIndexingTimer() {
		return indexingTimer;
	}
	public void setIndexingTimer(String indexingTimer) {
		this.indexingTimer = indexingTimer;
	}
	public String getCollectionTimer() {
		return collectionTimer;
	}
	public void setCollectionTimer(String collectionTimer) {
		this.collectionTimer = collectionTimer;
	}
	public String getWorkflowTimer() {
		return workflowTimer;
	}
	public void setWorkflowTimer(String workflowTimer) {
		this.workflowTimer = workflowTimer;
	}
	public String getVpasRetryTimer() {
		return vpasRetryTimer;
	}
	public void setVpasRetryTimer(String vpasRetryTimer) {
		this.vpasRetryTimer = vpasRetryTimer;
	}
	public String getVpasBatchTimer() {
		return vpasBatchTimer;
	}
	public void setVpasBatchTimer(String vpasBatchTimer) {
		this.vpasBatchTimer = vpasBatchTimer;
	}
	public String getMissingRemindTimer() {
		return missingRemindTimer;
	}
	public void setMissingRemindTimer(String missingRemindTimer) {
		this.missingRemindTimer = missingRemindTimer;
	}
}
