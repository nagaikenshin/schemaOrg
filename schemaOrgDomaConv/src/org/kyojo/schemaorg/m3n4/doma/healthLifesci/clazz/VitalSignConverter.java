package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.VITAL_SIGN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VitalSign;

@ExternalDomain
public class VitalSignConverter implements DomainConverter<VitalSign, String> {

	@Override
	public String fromDomainToValue(VitalSign domain) {
		return domain.getNativeValue();
	}

	@Override
	public VitalSign fromValueToDomain(String value) {
		return new VITAL_SIGN(value);
	}

}