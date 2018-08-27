package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PHARMACY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Pharmacy;

@ExternalDomain
public class PharmacyConverter implements DomainConverter<Pharmacy, String> {

	@Override
	public String fromDomainToValue(Pharmacy domain) {
		return domain.getNativeValue();
	}

	@Override
	public Pharmacy fromValueToDomain(String value) {
		return new PHARMACY(value);
	}

}
