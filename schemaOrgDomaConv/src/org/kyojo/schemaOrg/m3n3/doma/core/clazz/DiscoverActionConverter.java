package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISCOVER_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DiscoverAction;

@ExternalDomain
public class DiscoverActionConverter implements DomainConverter<DiscoverAction, String> {

	@Override
	public String fromDomainToValue(DiscoverAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiscoverAction fromValueToDomain(String value) {
		return new DISCOVER_ACTION(value);
	}

}
