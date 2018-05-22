package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_GUIDELINE_CONTRAINDICATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalGuidelineContraindication;

@ExternalDomain
public class MedicalGuidelineContraindicationConverter implements DomainConverter<MedicalGuidelineContraindication, String> {

	@Override
	public String fromDomainToValue(MedicalGuidelineContraindication domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalGuidelineContraindication fromValueToDomain(String value) {
		return new MEDICAL_GUIDELINE_CONTRAINDICATION(value);
	}

}
