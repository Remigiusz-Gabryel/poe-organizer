package com.remigiusz.poeorganizer.syndicate;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remigiusz.poeorganizer.syndicate.models.SyndicateMember;

@RestController
@RequestMapping("/syndicate")
public class SyndicateMemberController {
	
	private final SyndicateMemberService memberService;

	public SyndicateMemberController(SyndicateMemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<SyndicateMember>> getAllSyndicateMembers(){
		List<SyndicateMember> syndicateMembers = memberService.findAllSyndicateMembers();
		return new ResponseEntity<>(syndicateMembers,HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<SyndicateMember> getSyndicateMemberById (@PathVariable("id") Long id){
		SyndicateMember syndicateMember = memberService.findSyndicateMember(id);
		return new ResponseEntity<>(syndicateMember,HttpStatus.OK);
	}

}
