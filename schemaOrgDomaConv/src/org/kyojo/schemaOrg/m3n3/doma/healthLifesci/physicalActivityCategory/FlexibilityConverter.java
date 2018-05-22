package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalActivityCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalActivityCategory.FLEXIBILITY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalActivityCategory.Flexibility;

@ExternalDomain
public class FlexibilityConverter implements DomainConverter<Flexibility, String> {

	@Override
	public String fromDomainToValue(Flexibility domain) {
		return domain.getNativeValue();
	}

	@Override
	public Flexibility fromValueToDomain(String value) {
		return new FLEXIBILITY(value);
	}

}
