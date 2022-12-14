package com.remigiusz.poeorganizer.syndicate.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "syndicate_member")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "id")
public class SyndicateMember {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id; 
	private String name;
	private String imageUrl;

	@OneToOne(mappedBy = "leader")
	private SyndicateSafehouse SafehouseLeader;
	
	@ManyToOne
	@JoinColumn(name = "safehouse_id")
	private SyndicateSafehouse safehouse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public SyndicateSafehouse getSafehouseLeader() {
		return SafehouseLeader;
	}

	public void setSafehouseLeader(SyndicateSafehouse safehouseLeader) {
		SafehouseLeader = safehouseLeader;
	}

	public SyndicateSafehouse getSafehouse() {
		return safehouse;
	}

	public void setSafehouse(SyndicateSafehouse safehouse) {
		this.safehouse = safehouse;
	}
	
	
}
