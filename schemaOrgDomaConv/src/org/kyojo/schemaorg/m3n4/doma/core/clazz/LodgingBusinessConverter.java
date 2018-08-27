package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LODGING_BUSINESS;
import org.kyojo.schemaorg.m3n4.core.Clazz.LodgingBusiness;

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
