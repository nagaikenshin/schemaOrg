package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MASS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Mass;

@ExternalDomain
public class MassConverter implements DomainConverter<Mass, String> {

	@Override
	public String fromDomainToValue(Mass domain) {
		return domain.getNativeValue();
	}

	@Override
	public Mass fromValueToDomain(String value) {
		return new MASS(value);
	}

}
