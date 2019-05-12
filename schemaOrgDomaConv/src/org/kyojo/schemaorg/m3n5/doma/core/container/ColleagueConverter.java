package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COLLEAGUE;
import org.kyojo.schemaorg.m3n5.core.Container.Colleague;

@ExternalDomain
public class ColleagueConverter implements DomainConverter<Colleague, String> {

	@Override
	public String fromDomainToValue(Colleague domain) {
		return domain.getNativeValue();
	}

	@Override
	public Colleague fromValueToDomain(String value) {
		return new COLLEAGUE(value);
	}

}
