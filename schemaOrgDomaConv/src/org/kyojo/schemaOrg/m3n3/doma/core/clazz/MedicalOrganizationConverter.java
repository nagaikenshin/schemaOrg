package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MEDICAL_ORGANIZATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MedicalOrganization;

@ExternalDomain
public class MedicalOrganizationConverter implements DomainConverter<MedicalOrganization, String> {

	@Override
	public String fromDomainToValue(MedicalOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalOrganization fromValueToDomain(String value) {
		return new MEDICAL_ORGANIZATION(value);
	}

}
