package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.POND;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Pond;

@ExternalDomain
public class PondConverter implements DomainConverter<Pond, String> {

	@Override
	public String fromDomainToValue(Pond domain) {
		return domain.getNativeValue();
	}

	@Override
	public Pond fromValueToDomain(String value) {
		return new POND(value);
	}

}
