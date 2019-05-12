package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUPPORTING_DATA;
import org.kyojo.schemaorg.m3n5.core.Container.SupportingData;

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
