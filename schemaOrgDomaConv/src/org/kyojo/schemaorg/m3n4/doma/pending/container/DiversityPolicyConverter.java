package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.DIVERSITY_POLICY;
import org.kyojo.schemaorg.m3n4.pending.Container.DiversityPolicy;

@ExternalDomain
public class DiversityPolicyConverter implements DomainConverter<DiversityPolicy, String> {

	@Override
	public String fromDomainToValue(DiversityPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiversityPolicy fromValueToDomain(String value) {
		return new DIVERSITY_POLICY(value);
	}

}
