package org.kyojo.schemaorg.m3n4.doma.core.audience;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.audience.RESEARCHER;
import org.kyojo.schemaorg.m3n4.core.Audience.Researcher;

@ExternalDomain
public class ResearcherConverter implements DomainConverter<Researcher, String> {

	@Override
	public String fromDomainToValue(Researcher domain) {
		return domain.getNativeValue();
	}

	@Override
	public Researcher fromValueToDomain(String value) {
		return new RESEARCHER(value);
	}

}
