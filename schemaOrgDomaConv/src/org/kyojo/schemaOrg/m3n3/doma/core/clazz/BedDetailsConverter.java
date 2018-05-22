package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BED_DETAILS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BedDetails;

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
