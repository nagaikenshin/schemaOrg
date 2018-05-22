package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.EXPERT_CONSIDERATIONS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExpertConsiderations;

@ExternalDomain
public class ExpertConsiderationsConverter implements DomainConverter<ExpertConsiderations, String> {

	@Override
	public String fromDomainToValue(ExpertConsiderations domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExpertConsiderations fromValueToDomain(String value) {
		return new EXPERT_CONSIDERATIONS(value);
	}

}
