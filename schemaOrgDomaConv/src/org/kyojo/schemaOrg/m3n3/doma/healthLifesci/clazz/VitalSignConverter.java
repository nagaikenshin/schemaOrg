package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.VITAL_SIGN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.VitalSign;

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
