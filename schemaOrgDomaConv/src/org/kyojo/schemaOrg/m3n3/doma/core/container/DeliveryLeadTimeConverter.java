package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DELIVERY_LEAD_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.DeliveryLeadTime;

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
