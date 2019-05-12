package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COURTHOUSE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Courthouse;

@ExternalDomain
public class CourthouseConverter implements DomainConverter<Courthouse, String> {

	@Override
	public String fromDomainToValue(Courthouse domain) {
		return domain.getNativeValue();
	}

	@Override
	public Courthouse fromValueToDomain(String value) {
		return new COURTHOUSE(value);
	}

}
