package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.COLLECTION_SIZE;
import org.kyojo.schemaorg.m3n5.pending.Container.CollectionSize;

@ExternalDomain
public class CollectionSizeConverter implements DomainConverter<CollectionSize, Long> {

	@Override
	public Long fromDomainToValue(CollectionSize domain) {
		return domain.getNativeValue();
	}

	@Override
	public CollectionSize fromValueToDomain(Long value) {
		return new COLLECTION_SIZE(value);
	}

}
