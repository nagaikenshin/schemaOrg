package org.kyojo.schemaorg.m3n5.doma.healthLifesci.physicalActivityCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.physicalActivityCategory.ANAEROBIC_ACTIVITY;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalActivityCategory.AnaerobicActivity;

@ExternalDomain
public class AnaerobicActivityConverter implements DomainConverter<AnaerobicActivity, String> {

	@Override
	public String fromDomainToValue(AnaerobicActivity domain) {
		return domain.getNativeValue();
	}

	@Override
	public AnaerobicActivity fromValueToDomain(String value) {
		return new ANAEROBIC_ACTIVITY(value);
	}

}
