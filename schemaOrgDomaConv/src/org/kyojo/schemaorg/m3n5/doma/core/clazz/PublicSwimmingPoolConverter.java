package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PUBLIC_SWIMMING_POOL;
import org.kyojo.schemaorg.m3n5.core.Clazz.PublicSwimmingPool;

@ExternalDomain
public class PublicSwimmingPoolConverter implements DomainConverter<PublicSwimmingPool, String> {

	@Override
	public String fromDomainToValue(PublicSwimmingPool domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicSwimmingPool fromValueToDomain(String value) {
		return new PUBLIC_SWIMMING_POOL(value);
	}

}
