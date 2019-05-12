package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DATELINE;
import org.kyojo.schemaorg.m3n5.core.Container.Dateline;

@ExternalDomain
public class DatelineConverter implements DomainConverter<Dateline, String> {

	@Override
	public String fromDomainToValue(Dateline domain) {
		return domain.getNativeValue();
	}

	@Override
	public Dateline fromValueToDomain(String value) {
		return new DATELINE(value);
	}

}
