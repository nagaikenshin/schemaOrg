package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FLORIST;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Florist;

@ExternalDomain
public class FloristConverter implements DomainConverter<Florist, String> {

	@Override
	public String fromDomainToValue(Florist domain) {
		return domain.getNativeValue();
	}

	@Override
	public Florist fromValueToDomain(String value) {
		return new FLORIST(value);
	}

}
