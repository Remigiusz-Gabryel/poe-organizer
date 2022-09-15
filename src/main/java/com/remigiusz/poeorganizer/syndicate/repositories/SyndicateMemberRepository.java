package com.remigiusz.poeorganizer.syndicate.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.remigiusz.poeorganizer.syndicate.models.SyndicateMember;

@Component
@Qualifier
public interface SyndicateMemberRepository extends JpaRepository<SyndicateMember,Long> {
	Optional<SyndicateMember> findSyndicateMemberById(Long id);
}
