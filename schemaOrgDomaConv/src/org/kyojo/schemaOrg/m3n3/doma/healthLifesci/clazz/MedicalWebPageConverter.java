package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_WEB_PAGE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalWebPage;

@ExternalDomain
public class MedicalWebPageConverter implements DomainConverter<MedicalWebPage, String> {

	@Override
	public String fromDomainToValue(MedicalWebPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalWebPage fromValueToDomain(String value) {
		return new MEDICAL_WEB_PAGE(value);
	}

}
