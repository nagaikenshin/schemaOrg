package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CHURCH;
import org.kyojo.schemaorg.m3n5.core.Clazz.Church;

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
