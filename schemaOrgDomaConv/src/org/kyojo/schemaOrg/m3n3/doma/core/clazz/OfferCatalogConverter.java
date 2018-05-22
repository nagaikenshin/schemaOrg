package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OFFER_CATALOG;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OfferCatalog;

@ExternalDomain
public class OfferCatalogConverter implements DomainConverter<OfferCatalog, String> {

	@Override
	public String fromDomainToValue(OfferCatalog domain) {
		return domain.getNativeValue();
	}

	@Override
	public OfferCatalog fromValueToDomain(String value) {
		return new OFFER_CATALOG(value);
	}

}
