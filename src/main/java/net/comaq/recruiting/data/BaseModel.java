package net.comaq.recruiting.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity()
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseModel {
	
	@Id
	@GeneratedValue
	@Column(nullable = false, updatable = false)
	private Long id;

	@JsonProperty(required = false)
	private String createdBy;
	@JsonProperty(required = false)
	private LocalDateTime createdAt;
	@JsonProperty(required = false)
	private String lastEditedBy;
	@JsonProperty(required = false)
	private LocalDateTime lastEditedAt;
	
	public BaseModel() {
		createdAt = LocalDateTime.now();
		lastEditedAt = LocalDateTime.now();
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getLastEditedBy() {
		return lastEditedBy;
	}

	public void setLastEditedBy(String lastEditedBy) {
		this.lastEditedBy = lastEditedBy;
	}

	public LocalDateTime getLastEditedAt() {
		return lastEditedAt;
	}

	public void setLastEditedAt(LocalDateTime lastEditedAt) {
		this.lastEditedAt = lastEditedAt;
	}

}
