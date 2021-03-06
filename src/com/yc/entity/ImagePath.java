package com.yc.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@DiscriminatorValue("imagePath")
@JsonIgnoreProperties(value={"unKnownComm","commodity"})
public class ImagePath {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer imageId;
	
	@ManyToOne
	private UnKnownCommodity unKnownComm;
	
	@ManyToOne
	@JoinColumn(name = "from_commodity")
	private Commodity commodity;
	
	@Column
	private String path;

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Integer getImageId() {
		return imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public UnKnownCommodity getUnKnownComm() {
		return unKnownComm;
	}

	public void setUnKnownComm(UnKnownCommodity unKnownComm) {
		this.unKnownComm = unKnownComm;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
