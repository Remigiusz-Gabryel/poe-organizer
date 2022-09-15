package com.remigiusz.poeorganizer.syndicate.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "syndicate_safehouse")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "id")
public class SyndicateSafehouse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	
	private String name;
	
	// Simply put, whoever owns the foreign key column gets the @JoinColumn annotation.
	@OneToOne
	@JoinColumn(name = "leader_id", referencedColumnName = "id")
	private SyndicateMember leader;
	
	@OneToMany(mappedBy = "safehouse")
	private List<SyndicateMember> synidcateMembers = new ArrayList<>();

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

	public SyndicateMember getLeader() {
		return leader;
	}

	public void setLeader(SyndicateMember leader) {
		this.leader = leader;
	}

	public List<SyndicateMember> getSynidcateMembers() {
		return synidcateMembers;
	}

	public void setSynidcateMembers(List<SyndicateMember> synidcateMembers) {
		this.synidcateMembers = synidcateMembers;
	}
	
	

}
