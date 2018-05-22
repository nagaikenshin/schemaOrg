package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EDUCATIONAL_ALIGNMENT;
import org.kyojo.schemaOrg.m3n3.core.Container.EducationalAlignment;

@ExternalDomain
public class EducationalAlignmentConverter implements DomainConverter<EducationalAlignment, String> {

	@Override
	public String fromDomainToValue(EducationalAlignment domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalAlignment fromValueToDomain(String value) {
		return new EDUCATIONAL_ALIGNMENT(value);
	}

}
