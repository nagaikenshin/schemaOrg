package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SLOGAN;
import org.kyojo.schemaorg.m3n5.core.Container.Slogan;

@ExternalDomain
public class SloganConverter implements DomainConverter<Slogan, String> {

	@Override
	public String fromDomainToValue(Slogan domain) {
		return domain.getNativeValue();
	}

	@Override
	public Slogan fromValueToDomain(String value) {
		return new SLOGAN(value);
	}

}
