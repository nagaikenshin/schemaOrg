package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EDUCATIONAL_ROLE;
import org.kyojo.schemaOrg.m3n3.core.Container.EducationalRole;

@ExternalDomain
public class EducationalRoleConverter implements DomainConverter<EducationalRole, String> {

	@Override
	public String fromDomainToValue(EducationalRole domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalRole fromValueToDomain(String value) {
		return new EDUCATIONAL_ROLE(value);
	}

}
