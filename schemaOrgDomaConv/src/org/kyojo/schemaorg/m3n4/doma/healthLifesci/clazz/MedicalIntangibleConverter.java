package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_INTANGIBLE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalIntangible;

@ExternalDomain
public class MedicalIntangibleConverter implements DomainConverter<MedicalIntangible, String> {

	@Override
	public String fromDomainToValue(MedicalIntangible domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalIntangible fromValueToDomain(String value) {
		return new MEDICAL_INTANGIBLE(value);
	}

}
