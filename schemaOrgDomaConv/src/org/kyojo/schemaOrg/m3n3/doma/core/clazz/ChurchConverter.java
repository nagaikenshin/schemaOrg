package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHURCH;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Church;

@ExternalDomain
public class ChurchConverter implements DomainConverter<Church, String> {

	@Override
	public String fromDomainToValue(Church domain) {
		return domain.getNativeValue();
	}

	@Override
	public Church fromValueToDomain(String value) {
		return new CHURCH(value);
	}

}
