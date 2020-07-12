package com.casjpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "complaint")
public class Complaint implements Serializable 
{
	@Id
	@Column(name = "complaint_no")
	@GeneratedValue(strategy =GenerationType.AUTO )
	protected int complaintNo;
	
	protected String title;
	protected String description;
	
	@Column(name = "reported_date")
	protected Date reportedDate;
	
	protected int priority;
	protected int severity;
	protected String Status;
	
	
	public int getComplaintNo() {
		return complaintNo;
	}
	public void setComplaintNo(int complaintNo) {
		this.complaintNo = complaintNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getReportedDate() {
		return reportedDate;
	}
	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + complaintNo;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + priority;
		result = prime * result + ((reportedDate == null) ? 0 : reportedDate.hashCode());
		result = prime * result + severity;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complaint other = (Complaint) obj;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (complaintNo != other.complaintNo)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (priority != other.priority)
			return false;
		if (reportedDate == null) {
			if (other.reportedDate != null)
				return false;
		} else if (!reportedDate.equals(other.reportedDate))
			return false;
		if (severity != other.severity)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Complaint [complaintNo=" + complaintNo + ", title=" + title + ", description=" + description
				+ ", reportedDate=" + reportedDate + ", priority=" + priority + ", severity=" + severity + ", Status="
				+ Status + "]";
	}
	
	
	
}
