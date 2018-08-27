package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DRY_CLEANING_OR_LAUNDRY;
import org.kyojo.schemaorg.m3n4.core.Clazz.DryCleaningOrLaundry;

@ExternalDomain
public class DryCleaningOrLaundryConverter implements DomainConverter<DryCleaningOrLaundry, String> {

	@Override
	public String fromDomainToValue(DryCleaningOrLaundry domain) {
		return domain.getNativeValue();
	}

	@Override
	public DryCleaningOrLaundry fromValueToDomain(String value) {
		return new DRY_CLEANING_OR_LAUNDRY(value);
	}

}
