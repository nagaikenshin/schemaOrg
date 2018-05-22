package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EDUCATIONAL_USE;
import org.kyojo.schemaOrg.m3n3.core.Container.EducationalUse;

@ExternalDomain
public class EducationalUseConverter implements DomainConverter<EducationalUse, String> {

	@Override
	public String fromDomainToValue(EducationalUse domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalUse fromValueToDomain(String value) {
		return new EDUCATIONAL_USE(value);
	}

}
