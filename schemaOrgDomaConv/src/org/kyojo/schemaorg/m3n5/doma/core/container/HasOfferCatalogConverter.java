package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HAS_OFFER_CATALOG;
import org.kyojo.schemaorg.m3n5.core.Container.HasOfferCatalog;

@ExternalDomain
public class HasOfferCatalogConverter implements DomainConverter<HasOfferCatalog, String> {

	@Override
	public String fromDomainToValue(HasOfferCatalog domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasOfferCatalog fromValueToDomain(String value) {
		return new HAS_OFFER_CATALOG(value);
	}

}
