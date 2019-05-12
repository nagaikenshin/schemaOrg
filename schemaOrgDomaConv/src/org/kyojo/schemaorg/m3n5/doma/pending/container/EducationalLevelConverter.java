package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.EDUCATIONAL_LEVEL;
import org.kyojo.schemaorg.m3n5.pending.Container.EducationalLevel;

@ExternalDomain
public class EducationalLevelConverter implements DomainConverter<EducationalLevel, String> {

	@Override
	public String fromDomainToValue(EducationalLevel domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalLevel fromValueToDomain(String value) {
		return new EDUCATIONAL_LEVEL(value);
	}

}
