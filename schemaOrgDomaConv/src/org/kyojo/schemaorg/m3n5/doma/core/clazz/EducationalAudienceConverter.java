package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EDUCATIONAL_AUDIENCE;
import org.kyojo.schemaorg.m3n5.core.Clazz.EducationalAudience;

@ExternalDomain
public class EducationalAudienceConverter implements DomainConverter<EducationalAudience, String> {

	@Override
	public String fromDomainToValue(EducationalAudience domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalAudience fromValueToDomain(String value) {
		return new EDUCATIONAL_AUDIENCE(value);
	}

}
