package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PHYSICAL_ACTIVITY_CATEGORY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.PhysicalActivityCategory;

@ExternalDomain
public class PhysicalActivityCategoryConverter implements DomainConverter<PhysicalActivityCategory, String> {

	@Override
	public String fromDomainToValue(PhysicalActivityCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public PhysicalActivityCategory fromValueToDomain(String value) {
		return new PHYSICAL_ACTIVITY_CATEGORY(value);
	}

}
