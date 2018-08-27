package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EDUCATIONAL_ORGANIZATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationalOrganization;

@ExternalDomain
public class EducationalOrganizationConverter implements DomainConverter<EducationalOrganization, String> {

	@Override
	public String fromDomainToValue(EducationalOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalOrganization fromValueToDomain(String value) {
		return new EDUCATIONAL_ORGANIZATION(value);
	}

}
