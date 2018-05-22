package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DAY_SPA;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DaySpa;

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
