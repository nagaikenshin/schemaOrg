package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FESTIVAL;
import org.kyojo.schemaorg.m3n5.core.Clazz.Festival;

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
