package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DIRECTOR;
import org.kyojo.schemaorg.m3n5.core.Container.Director;

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
