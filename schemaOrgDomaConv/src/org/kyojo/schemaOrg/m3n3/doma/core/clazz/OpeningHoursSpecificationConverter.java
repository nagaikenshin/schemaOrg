package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OPENING_HOURS_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OpeningHoursSpecification;

@ExternalDomain
public class OpeningHoursSpecificationConverter implements DomainConverter<OpeningHoursSpecification, String> {

	@Override
	public String fromDomainToValue(OpeningHoursSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public OpeningHoursSpecification fromValueToDomain(String value) {
		return new OPENING_HOURS_SPECIFICATION(value);
	}

}
