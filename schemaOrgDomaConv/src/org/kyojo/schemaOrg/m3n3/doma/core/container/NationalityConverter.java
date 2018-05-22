package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NATIONALITY;
import org.kyojo.schemaOrg.m3n3.core.Container.Nationality;

@ExternalDomain
public class NationalityConverter implements DomainConverter<Nationality, String> {

	@Override
	public String fromDomainToValue(Nationality domain) {
		return domain.getNativeValue();
	}

	@Override
	public Nationality fromValueToDomain(String value) {
		return new NATIONALITY(value);
	}

}
