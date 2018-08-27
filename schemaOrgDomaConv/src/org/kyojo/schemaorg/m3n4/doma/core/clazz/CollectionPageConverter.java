package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COLLECTION_PAGE;
import org.kyojo.schemaorg.m3n4.core.Clazz.CollectionPage;

@ExternalDomain
public class CollectionPageConverter implements DomainConverter<CollectionPage, String> {

	@Override
	public String fromDomainToValue(CollectionPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public CollectionPage fromValueToDomain(String value) {
		return new COLLECTION_PAGE(value);
	}

}