package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ROOFING_CONTRACTOR;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RoofingContractor;

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
