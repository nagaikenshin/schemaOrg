package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CANDIDATE;
import org.kyojo.schemaOrg.m3n3.core.Container.Candidate;

@ExternalDomain
public class CandidateConverter implements DomainConverter<Candidate, String> {

	@Override
	public String fromDomainToValue(Candidate domain) {
		return domain.getNativeValue();
	}

	@Override
	public Candidate fromValueToDomain(String value) {
		return new CANDIDATE(value);
	}

}
