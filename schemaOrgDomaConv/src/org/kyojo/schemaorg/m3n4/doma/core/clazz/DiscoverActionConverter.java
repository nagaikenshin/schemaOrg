package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DISCOVER_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DiscoverAction;

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
