package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PHYSICAL_ACTIVITY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PhysicalActivity;

@ExternalDomain
public class PhysicalActivityConverter implements DomainConverter<PhysicalActivity, String> {

	@Override
	public String fromDomainToValue(PhysicalActivity domain) {
		return domain.getNativeValue();
	}

	@Override
	public PhysicalActivity fromValueToDomain(String value) {
		return new PHYSICAL_ACTIVITY(value);
	}

}
