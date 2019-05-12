package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EDUCATIONAL_ROLE;
import org.kyojo.schemaorg.m3n5.core.Container.EducationalRole;

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
