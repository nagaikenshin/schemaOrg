package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BUYER;
import org.kyojo.schemaorg.m3n5.core.Container.Buyer;

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
