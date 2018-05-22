package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESERVATION_PACKAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReservationPackage;

@ExternalDomain
public class ReservationPackageConverter implements DomainConverter<ReservationPackage, String> {

	@Override
	public String fromDomainToValue(ReservationPackage domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationPackage fromValueToDomain(String value) {
		return new RESERVATION_PACKAGE(value);
	}

}
