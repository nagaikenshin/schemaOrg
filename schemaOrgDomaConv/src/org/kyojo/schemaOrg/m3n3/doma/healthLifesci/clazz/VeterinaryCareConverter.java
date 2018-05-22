package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.VETERINARY_CARE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.VeterinaryCare;

@ExternalDomain
public class VeterinaryCareConverter implements DomainConverter<VeterinaryCare, String> {

	@Override
	public String fromDomainToValue(VeterinaryCare domain) {
		return domain.getNativeValue();
	}

	@Override
	public VeterinaryCare fromValueToDomain(String value) {
		return new VETERINARY_CARE(value);
	}

}
