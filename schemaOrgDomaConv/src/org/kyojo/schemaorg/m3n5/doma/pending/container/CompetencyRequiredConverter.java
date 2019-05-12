package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.COMPETENCY_REQUIRED;
import org.kyojo.schemaorg.m3n5.pending.Container.CompetencyRequired;

@ExternalDomain
public class CompetencyRequiredConverter implements DomainConverter<CompetencyRequired, String> {

	@Override
	public String fromDomainToValue(CompetencyRequired domain) {
		return domain.getNativeValue();
	}

	@Override
	public CompetencyRequired fromValueToDomain(String value) {
		return new COMPETENCY_REQUIRED(value);
	}

}
