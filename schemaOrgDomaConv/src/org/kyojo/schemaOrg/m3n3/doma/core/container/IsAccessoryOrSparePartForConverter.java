package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_ACCESSORY_OR_SPARE_PART_FOR;
import org.kyojo.schemaOrg.m3n3.core.Container.IsAccessoryOrSparePartFor;

@ExternalDomain
public class IsAccessoryOrSparePartForConverter implements DomainConverter<IsAccessoryOrSparePartFor, String> {

	@Override
	public String fromDomainToValue(IsAccessoryOrSparePartFor domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsAccessoryOrSparePartFor fromValueToDomain(String value) {
		return new IS_ACCESSORY_OR_SPARE_PART_FOR(value);
	}

}
