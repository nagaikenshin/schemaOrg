package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SELLER;
import org.kyojo.schemaOrg.m3n3.core.Container.Seller;

@ExternalDomain
public class SellerConverter implements DomainConverter<Seller, String> {

	@Override
	public String fromDomainToValue(Seller domain) {
		return domain.getNativeValue();
	}

	@Override
	public Seller fromValueToDomain(String value) {
		return new SELLER(value);
	}

}
