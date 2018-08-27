package org.kyojo.schemaorg.m3n3.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.pending.impl.BROADCAST_FREQUENCY_VALUE;
import org.kyojo.schemaorg.m3n3.pending.Container.BroadcastFrequencyValue;

@ExternalDomain
public class BroadcastFrequencyValueConverter implements DomainConverter<BroadcastFrequencyValue, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(BroadcastFrequencyValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastFrequencyValue fromValueToDomain(BigDecimal value) {
		return new BROADCAST_FREQUENCY_VALUE(value);
	}

}
