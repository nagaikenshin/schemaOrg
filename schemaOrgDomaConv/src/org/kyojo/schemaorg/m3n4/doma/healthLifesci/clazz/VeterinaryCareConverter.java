package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.VETERINARY_CARE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VeterinaryCare;

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
