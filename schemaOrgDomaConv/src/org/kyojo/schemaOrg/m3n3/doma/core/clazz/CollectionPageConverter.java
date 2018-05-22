package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COLLECTION_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CollectionPage;

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
