package org.kyojo.schemaorg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MEDICAL_CONTRAINDICATION;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalContraindication;

@ExternalDomain
public class MedicalContraindicationConverter implements DomainConverter<MedicalContraindication, String> {

	@Override
	public String fromDomainToValue(MedicalContraindication domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalContraindication fromValueToDomain(String value) {
		return new MEDICAL_CONTRAINDICATION(value);
	}

}
