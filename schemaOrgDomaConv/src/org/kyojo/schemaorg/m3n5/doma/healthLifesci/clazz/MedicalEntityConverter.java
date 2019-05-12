package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_ENTITY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalEntity;

@ExternalDomain
public class MedicalEntityConverter implements DomainConverter<MedicalEntity, String> {

	@Override
	public String fromDomainToValue(MedicalEntity domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalEntity fromValueToDomain(String value) {
		return new MEDICAL_ENTITY(value);
	}

}
