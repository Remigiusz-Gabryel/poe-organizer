package com.remigiusz.poeorganizer.syndicate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.remigiusz.poeorganizer.syndicate.exceptions.SyndicateMemberNotFoundException;
import com.remigiusz.poeorganizer.syndicate.models.SyndicateMember;
import com.remigiusz.poeorganizer.syndicate.repositories.SyndicateMemberRepository;

@Service
public class SyndicateMemberService {
	
	
	private final SyndicateMemberRepository syndicateMemberRepository;
	
	@Autowired
	public SyndicateMemberService(SyndicateMemberRepository syndicateMemberRepository) {
		this.syndicateMemberRepository = syndicateMemberRepository;
	}
	
	public SyndicateMember findSyndicateMember(Long id) {
		return syndicateMemberRepository.findSyndicateMemberById(id)
				.orElseThrow(() -> new SyndicateMemberNotFoundException("Member by id " + id + "not found"));
	}
	
	public List<SyndicateMember> findAllSyndicateMembers(){
		return syndicateMemberRepository.findAll();
	}
	
	
	
}
