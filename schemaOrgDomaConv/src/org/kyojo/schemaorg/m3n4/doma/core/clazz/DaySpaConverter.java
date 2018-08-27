package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DAY_SPA;
import org.kyojo.schemaorg.m3n4.core.Clazz.DaySpa;

@ExternalDomain
public class DaySpaConverter implements DomainConverter<DaySpa, String> {

	@Override
	public String fromDomainToValue(DaySpa domain) {
		return domain.getNativeValue();
	}

	@Override
	public DaySpa fromValueToDomain(String value) {
		return new DAY_SPA(value);
	}

}