package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DIRECTOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Director;

@ExternalDomain
public class DirectorConverter implements DomainConverter<Director, String> {

	@Override
	public String fromDomainToValue(Director domain) {
		return domain.getNativeValue();
	}

	@Override
	public Director fromValueToDomain(String value) {
		return new DIRECTOR(value);
	}

}
