package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SPECIAL_OPENING_HOURS_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Container.SpecialOpeningHoursSpecification;

@ExternalDomain
public class SpecialOpeningHoursSpecificationConverter implements DomainConverter<SpecialOpeningHoursSpecification, String> {

	@Override
	public String fromDomainToValue(SpecialOpeningHoursSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public SpecialOpeningHoursSpecification fromValueToDomain(String value) {
		return new SPECIAL_OPENING_HOURS_SPECIFICATION(value);
	}

}
