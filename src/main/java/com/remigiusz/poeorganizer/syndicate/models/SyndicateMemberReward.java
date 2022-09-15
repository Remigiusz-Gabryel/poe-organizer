package com.remigiusz.poeorganizer.syndicate.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.remigiusz.poeorganizer.syndicate.models.compositkeys.SyndicateMemberRewardPKId;

@Entity
@Table(name = "syndicate_member_reward")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "id")
public class SyndicateMemberReward {
	
	@EmbeddedId
	private SyndicateMemberRewardPKId id = new SyndicateMemberRewardPKId();
	
	@ManyToOne
	@JoinColumn(
	name = "member_id",
	insertable = false, updatable = false)
	protected SyndicateMember member;
	@ManyToOne
	@JoinColumn(
	name = "safehouse_id",
	insertable = false, updatable = false)
	protected SyndicateSafehouse safehouse;
	
	private String tierOneReward;
	private String tierTwoReward;
	private String tierThreeReward;
	private String tierFourReward;
	
	

}
