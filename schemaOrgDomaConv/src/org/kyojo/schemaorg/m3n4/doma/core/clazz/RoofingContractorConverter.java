package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ROOFING_CONTRACTOR;
import org.kyojo.schemaorg.m3n4.core.Clazz.RoofingContractor;

@ExternalDomain
public class RoofingContractorConverter implements DomainConverter<RoofingContractor, String> {

	@Override
	public String fromDomainToValue(RoofingContractor domain) {
		return domain.getNativeValue();
	}

	@Override
	public RoofingContractor fromValueToDomain(String value) {
		return new ROOFING_CONTRACTOR(value);
	}

}
