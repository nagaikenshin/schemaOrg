package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ADDITIONAL_NUMBER_OF_GUESTS;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalNumberOfGuests;

@ExternalDomain
public class AdditionalNumberOfGuestsConverter implements DomainConverter<AdditionalNumberOfGuests, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(AdditionalNumberOfGuests domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdditionalNumberOfGuests fromValueToDomain(BigDecimal value) {
		return new ADDITIONAL_NUMBER_OF_GUESTS(value);
	}

}
