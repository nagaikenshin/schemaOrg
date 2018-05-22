package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_INDICATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalIndication;

@ExternalDomain
public class MedicalIndicationConverter implements DomainConverter<MedicalIndication, String> {

	@Override
	public String fromDomainToValue(MedicalIndication domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalIndication fromValueToDomain(String value) {
		return new MEDICAL_INDICATION(value);
	}

}
