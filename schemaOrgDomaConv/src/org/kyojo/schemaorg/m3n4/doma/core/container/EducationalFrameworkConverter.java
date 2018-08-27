package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EDUCATIONAL_FRAMEWORK;
import org.kyojo.schemaorg.m3n4.core.Container.EducationalFramework;

@ExternalDomain
public class EducationalFrameworkConverter implements DomainConverter<EducationalFramework, String> {

	@Override
	public String fromDomainToValue(EducationalFramework domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalFramework fromValueToDomain(String value) {
		return new EDUCATIONAL_FRAMEWORK(value);
	}

}
