package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FESTIVAL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Festival;

@ExternalDomain
public class FestivalConverter implements DomainConverter<Festival, String> {

	@Override
	public String fromDomainToValue(Festival domain) {
		return domain.getNativeValue();
	}

	@Override
	public Festival fromValueToDomain(String value) {
		return new FESTIVAL(value);
	}

}
