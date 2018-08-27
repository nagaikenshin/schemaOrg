package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DELIVERY_LEAD_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.DeliveryLeadTime;

@ExternalDomain
public class DeliveryLeadTimeConverter implements DomainConverter<DeliveryLeadTime, String> {

	@Override
	public String fromDomainToValue(DeliveryLeadTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeliveryLeadTime fromValueToDomain(String value) {
		return new DELIVERY_LEAD_TIME(value);
	}

}
