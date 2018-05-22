package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARCEL_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ParcelService;

@ExternalDomain
public class ParcelServiceConverter implements DomainConverter<ParcelService, String> {

	@Override
	public String fromDomainToValue(ParcelService domain) {
		return domain.getNativeValue();
	}

	@Override
	public ParcelService fromValueToDomain(String value) {
		return new PARCEL_SERVICE(value);
	}

}
