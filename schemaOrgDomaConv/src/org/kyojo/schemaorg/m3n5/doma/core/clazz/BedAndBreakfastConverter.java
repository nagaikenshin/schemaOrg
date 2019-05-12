package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BED_AND_BREAKFAST;
import org.kyojo.schemaorg.m3n5.core.Clazz.BedAndBreakfast;

@ExternalDomain
public class BedAndBreakfastConverter implements DomainConverter<BedAndBreakfast, String> {

	@Override
	public String fromDomainToValue(BedAndBreakfast domain) {
		return domain.getNativeValue();
	}

	@Override
	public BedAndBreakfast fromValueToDomain(String value) {
		return new BED_AND_BREAKFAST(value);
	}

}
