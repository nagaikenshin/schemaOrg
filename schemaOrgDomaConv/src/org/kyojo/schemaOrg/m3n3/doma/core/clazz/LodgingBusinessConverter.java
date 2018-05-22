package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LODGING_BUSINESS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LodgingBusiness;

@ExternalDomain
public class LodgingBusinessConverter implements DomainConverter<LodgingBusiness, String> {

	@Override
	public String fromDomainToValue(LodgingBusiness domain) {
		return domain.getNativeValue();
	}

	@Override
	public LodgingBusiness fromValueToDomain(String value) {
		return new LODGING_BUSINESS(value);
	}

}
