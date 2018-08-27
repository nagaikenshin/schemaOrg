package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OWNERSHIP_INFO;
import org.kyojo.schemaorg.m3n4.core.Clazz.OwnershipInfo;

@ExternalDomain
public class OwnershipInfoConverter implements DomainConverter<OwnershipInfo, String> {

	@Override
	public String fromDomainToValue(OwnershipInfo domain) {
		return domain.getNativeValue();
	}

	@Override
	public OwnershipInfo fromValueToDomain(String value) {
		return new OWNERSHIP_INFO(value);
	}

}
