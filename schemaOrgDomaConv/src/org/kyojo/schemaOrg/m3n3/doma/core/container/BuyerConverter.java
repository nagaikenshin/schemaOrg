package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUYER;
import org.kyojo.schemaOrg.m3n3.core.Container.Buyer;

@ExternalDomain
public class BuyerConverter implements DomainConverter<Buyer, String> {

	@Override
	public String fromDomainToValue(Buyer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Buyer fromValueToDomain(String value) {
		return new BUYER(value);
	}

}
