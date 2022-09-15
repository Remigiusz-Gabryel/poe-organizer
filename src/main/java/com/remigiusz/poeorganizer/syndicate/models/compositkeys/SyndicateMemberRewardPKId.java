package com.remigiusz.poeorganizer.syndicate.models.compositkeys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SyndicateMemberRewardPKId implements Serializable {
	
	@Column(name = "member_id")
	private Long memberId;
	
	@Column(name = "safehouse_id")
	private Long safehouseId;

	public SyndicateMemberRewardPKId() {
	}
	
	public SyndicateMemberRewardPKId(Long member_id, Long safehouseId) {
		this.memberId = member_id;
		this.safehouseId = safehouseId;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId.hashCode() + safehouseId.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof SyndicateMemberRewardPKId) {
			SyndicateMemberRewardPKId that = (SyndicateMemberRewardPKId) o;
			return this.memberId.equals(that.memberId)
			&& this.safehouseId.equals(that.safehouseId);
			}
			return false;
	}

	
	

}
