package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUPPORTING_DATA;
import org.kyojo.schemaOrg.m3n3.core.Container.SupportingData;

@ExternalDomain
public class SupportingDataConverter implements DomainConverter<SupportingData, String> {

	@Override
	public String fromDomainToValue(SupportingData domain) {
		return domain.getNativeValue();
	}

	@Override
	public SupportingData fromValueToDomain(String value) {
		return new SUPPORTING_DATA(value);
	}

}
