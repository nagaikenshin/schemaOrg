package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EXPERT_CONSIDERATIONS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExpertConsiderations;

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
