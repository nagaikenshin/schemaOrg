package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATELINE;
import org.kyojo.schemaOrg.m3n3.core.Container.Dateline;

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
