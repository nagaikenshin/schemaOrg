package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SEEKS;
import org.kyojo.schemaOrg.m3n3.core.Container.Seeks;

@ExternalDomain
public class SeeksConverter implements DomainConverter<Seeks, String> {

	@Override
	public String fromDomainToValue(Seeks domain) {
		return domain.getNativeValue();
	}

	@Override
	public Seeks fromValueToDomain(String value) {
		return new SEEKS(value);
	}

}
