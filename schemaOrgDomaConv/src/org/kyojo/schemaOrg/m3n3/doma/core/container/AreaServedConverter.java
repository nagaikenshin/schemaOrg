package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AREA_SERVED;
import org.kyojo.schemaOrg.m3n3.core.Container.AreaServed;

@ExternalDomain
public class AreaServedConverter implements DomainConverter<AreaServed, String> {

	@Override
	public String fromDomainToValue(AreaServed domain) {
		return domain.getNativeValue();
	}

	@Override
	public AreaServed fromValueToDomain(String value) {
		return new AREA_SERVED(value);
	}

}
