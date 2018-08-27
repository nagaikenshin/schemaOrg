package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BED_DETAILS;
import org.kyojo.schemaorg.m3n4.core.Clazz.BedDetails;

@ExternalDomain
public class BedDetailsConverter implements DomainConverter<BedDetails, String> {

	@Override
	public String fromDomainToValue(BedDetails domain) {
		return domain.getNativeValue();
	}

	@Override
	public BedDetails fromValueToDomain(String value) {
		return new BED_DETAILS(value);
	}

}
